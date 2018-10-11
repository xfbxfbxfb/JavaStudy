package �߳�;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * ����Lock
 * Lock  lock = new ReentrantLock();
 * Condition con = Lock. newCondition();
 * class {
 * lock.lock();//��ȡ��
 * con.await();//�ȴ�
 * con.sigmal();//����
 * lock.unlock();//�ͷ���
 * }
 * 
 */
public class Test2 {
	public static void main(String[] args) {
		Reasouse2 r = new Reasouse2();
		Produce2 p = new Produce2(r); 
		Consume2 c = new Consume2(r);
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);
		Thread t3 = new Thread(p);
		Thread t4 = new Thread(c);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}

class Reasouse2{
	private String name;//��������
	private int count=1;//��Ʒ����
	boolean flg = false;//��ʼ���Ϊ��
	Lock lock = new ReentrantLock();//������
	Condition consume =  lock.newCondition();//���������߼�����
	Condition prouce = lock.newCondition();//���������߼�����
	//������ 
	public void set(String name){
		lock.lock();//��ȡ��
		if(flg){//�ж��Ƿ��в�Ʒ
			try {
				prouce.await();//�����ߵȴ�
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				lock.unlock();//һ��ִ���ͷ���
			}
		}else{
			this.name= name+count;
			System.out.println(Thread.currentThread().getName()+"....������..."+this.name);
			count++;
			flg=true;//�������
			
		}
		consume.signal();//����������
		
	}
	public void out(){
		lock.lock();//��ȡ��
		if(flg){
			System.out.println(Thread.currentThread().getName()+".......������...."+this.name );
			flg=false;
			
		}else{
			try {
				consume.await();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				lock.unlock();
			}
		}
		prouce.signal();//����������
	}
}
class Produce2 implements Runnable {
	//�ṹ������ʼ������Դ��ʼ��
	Reasouse2 r; 
	Produce2(Reasouse2 r){
		this.r=r;
	}
	@Override
	public void run() {
		for(int i =0;i<60;i++)
			r.set("����");
	}
	
}
class Consume2 implements Runnable{
	Reasouse2 r;
	Consume2(Reasouse2 r){
		this.r=r;
	}
	@Override
	public void run() {
		for(int i = 0;i<60;i++)
			r.out();
		
	}
	
}



