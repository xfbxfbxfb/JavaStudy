package 基础练习;

/*
 * Thread.currentThread()获取当前线程对象
 * Thread.currentThread().getName();获取线程名称
 */
public class Test3 {
	public static void main(String[] args) {
		MyRunnable1 my = new MyRunnable1();
		Thread t1 = new Thread(my);
		Thread t2 = new Thread(my);
		t1.start();
		t2.start();
	}

}

class MyRunnable1 implements Runnable {
	int num = 100;

	@Override
	public void run() {
		while (num > 0) {
			synchronized (this) {
				System.out.println(Thread.currentThread().getName() + "---" + num--);
			}
		}

	}

}