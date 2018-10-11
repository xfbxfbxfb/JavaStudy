package 线程;

import java.util.concurrent.locks.Condition;
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
public class 练习2 {
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
	Lock lock =new ReentrantLock();//创建锁
	Condition set = lock.newCondition();//创建设置监视器
	Condition out = lock.newCondition();//创建输出监视器
	boolean flag = false;

	public void set(){
		lock.lock();//获取锁
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
		out.signal();//唤醒输出监视器
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
 

























