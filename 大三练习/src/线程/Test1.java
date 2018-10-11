package 线程;

/*
 * 任务：写一个多线程，表明生产者，消费者两者的关系。
 * 流程
 * 框架
 * 资源，消费者，生产者
 *使用了wait()让线程处于等待的状态线程存在线程池中,和
 *notify()将唤醒线程池中任意一个等待的线程;
 *notifyAll()唤醒线程池中的所有等待的线程;
 *特别注意：这些方法必须使用到同步方法中，因为必须要标识wait(),notify()等方法所属的锁，同一个锁上的notify只能唤醒改锁上被wait的
 *的线程。
 */
public class Test1 {
	public static void main(String[] args) {
		Reasouse r = new Reasouse();
		Produce p = new Produce(r);
		Consume c = new Consume(r);
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);
		Thread t3 = new Thread(p);
		Thread t4 = new Thread(c);
		Thread t5 = new Thread(p);
		Thread t6 = new Thread(c);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
	}

}

class Reasouse {
	public int count = 1;
	boolean flag = false;

	private String name;
//生产者方法
	public synchronized void set(String name) {
		while (flag) {
			try {
				wait();//生产者等待

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
			this.name = name + count;
			System.out.println(Thread.currentThread().getName() + "生产者....." + this.name);
			count++;
			flag = true;
		
		this.notifyAll();//唤醒生产者
	}
//消费者方法
	public synchronized void out() {
	while (flag) {
			System.out.println(Thread.currentThread().getName() + "消费者......." + this.name);
			flag = false;
		} 
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		
		this.notifyAll();//唤醒消费者
	}
}
//生产者
class Produce implements Runnable {
	Reasouse r;

	Produce(Reasouse r) {
		this.r = r;
	}

	@Override
	public void run() {
		for (int i = 0; i <= 60; i++)
			r.set("鸡腿");
	}

}
//消费者
class Consume implements Runnable {
	Reasouse r;

	Consume(Reasouse r) {
		this.r = r;
	}

	@Override
	public void run() {
		for (int i = 0; i <= 60; i++)
			r.out();
	}
}
