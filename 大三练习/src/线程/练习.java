package �߳�;

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
public class ��ϰ {
	public static void main(String[] args) {
		Reasouce3 r = new Reasouce3();
		input i =new input(r);
		output o = new output(r);
		Thread t1 = new Thread(i);
		Thread t2 = new Thread(o);
		t1.start();
		t2.start();
		
		
	}

}

class Reasouce3 {
	private String name;
	private String sex;
	int x = 1;
	// Lock lock =new ReentrantLock();
	boolean flag = false;

	public synchronized void set(){
		
		if(flag){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
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
		this.notify();
	}
	public synchronized void out(){
		if(flag){
			System.out.println(Thread.currentThread().getName()+name+"....."+sex);
			flag=false;
		}else{
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.notify();
	}
}

class input implements Runnable{
	Reasouce3 r;
	input(Reasouce3 r){
		this.r=r;
		
	}

	@Override
	public void run() {
		for(int i = 0;i<60;i++)
			r.set();
		
	}
	
}
 
class output implements Runnable{
	Reasouce3 r;
	output(Reasouce3 r){
		this.r=r;
		
	}

	@Override
	public void run() {
		for(int i = 0;i<60;i++)
			r.out();
		
	}
	
}
 

























