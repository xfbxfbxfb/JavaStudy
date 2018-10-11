package 线程;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
需求：
资源有姓名和性别。
两个线程，
	一个负责给姓名和性别赋值，
	一个负责获取姓名和性别的值。

参阅ThreadTest2.java文件

要求1，运行一下，解决程序的 "妖"的问题。
	分析过程：
	加入同步，必须保证同一个锁，解决妖的问题。

要求2，实现正确数据的间隔输出 如 
张飞--男
rose--女女女
张飞--男 
rose--女女女

要求3，对代码进行重构。
	将name，sex私有化，资源类提供对其访问的方法。

要求4，将程序改成JDK1.5的Lock Condition接口。

*/
public class 练习 {
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
			name="张飞";
			sex="男";
			x=0;
			} else{
				this.name="rose";
				this.sex="女女女女";
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
 

























