package �߳�;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
����
��Դ���������Ա�
�����̣߳�
	һ��������������Ա�ֵ��
	һ�������ȡ�������Ա��ֵ��

����ThreadTest2.java�ļ�

Ҫ��1������һ�£��������� "��"�����⡣
	�������̣�
	����ͬ�������뱣֤ͬһ����������������⡣

Ҫ��2��ʵ����ȷ���ݵļ����� �� 
�ŷ�--��
rose--ŮŮŮ
�ŷ�--�� 
rose--ŮŮŮ

Ҫ��3���Դ�������ع���
	��name��sex˽�л�����Դ���ṩ������ʵķ�����

Ҫ��4��������ĳ�JDK1.5��Lock Condition�ӿڡ�

*/
public class ��ϰ2 {
	public static void main(String[] args) {
		Reasouce4 r = new Reasouce4();
		input1 i =new input1(r);
		output1 o = new output1(r);
		Thread t1 = new Thread(i);
		Thread t2 = new Thread(o);
		t1.start();
		t2.start();
		
		
	}

}

class Reasouce4 {
	private String name;
	private String sex;
	int x = 1;
	Lock lock =new ReentrantLock();//������
	Condition set = lock.newCondition();//�������ü�����
	Condition out = lock.newCondition();//�������������
	boolean flag = false;

	public void set(){
		lock.lock();//��ȡ��
		if(flag){
			try {
				set.await();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				lock.unlock();
			}
		}else{
			if(x==1){
			name="�ŷ�";
			sex="��";
			x=0;
			} else{
				this.name="rose";
				this.sex="ŮŮŮŮ";
				x=1;
			}
			
			flag = true;
		}
		out.signal();//�������������
	}
	public void out(){
		lock.lock();
		if(flag){
			System.out.println(Thread.currentThread().getName()+name+"....."+sex);
			flag=false;
		}else{
			try {
				out.await();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				lock.unlock();
			}
		}
		set.signal();
	}
}

class input1 implements Runnable{
	Reasouce4 r;
	input1(Reasouce4 r){
		this.r=r;
		
	}

	@Override
	public void run() {
		for(int i = 0;i<60;i++)
			r.set();
		
	}
	
}
 
class output1 implements Runnable{
	Reasouce4 r;
	output1(Reasouce4 r){
		this.r=r;
		
	}

	@Override
	public void run() {
		for(int i = 0;i<60;i++)
			r.out();
		
	}
	
}
 

























