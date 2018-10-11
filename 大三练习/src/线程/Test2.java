package 线程;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * 新锁Lock
 * Lock  lock = new ReentrantLock();
 * Condition con = Lock. newCondition();
 * class {
 * lock.lock();//获取锁
 * con.await();//等待
 * con.sigmal();//唤醒
 * lock.unlock();//释放锁
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
	private String name;//定义名字
	private int count=1;//产品数量
	boolean flg = false;//开始标记为无
	Lock lock = new ReentrantLock();//创建锁
	Condition consume =  lock.newCondition();//创建消费者监视器
	Condition prouce = lock.newCondition();//创建生产者监视器
	//生产厂 
	public void set(String name){
		lock.lock();//获取锁
		if(flg){//判断是否有产品
			try {
				prouce.await();//生产者等待
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				lock.unlock();//一定执行释放锁
			}
		}else{
			this.name= name+count;
			System.out.println(Thread.currentThread().getName()+"....生产者..."+this.name);
			count++;
			flg=true;//更换标记
			
		}
		consume.signal();//唤醒消费者
		
	}
	public void out(){
		lock.lock();//获取锁
		if(flg){
			System.out.println(Thread.currentThread().getName()+".......消费者...."+this.name );
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
		prouce.signal();//唤醒生产者
	}
}
class Produce2 implements Runnable {
	//结构函数初始化把资源初始化
	Reasouse2 r; 
	Produce2(Reasouse2 r){
		this.r=r;
	}
	@Override
	public void run() {
		for(int i =0;i<60;i++)
			r.set("火腿");
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



