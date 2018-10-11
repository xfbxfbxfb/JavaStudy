package 基础练习;

/*
 * 运用两个线程完成一个任务
 */
public class Test2 {
	public static void main(String[] args) {
		MyRunnable my = new MyRunnable();
		Thread th1 = new Thread(my);
		Thread th2 = new Thread(my);
		th1.start();
		th2.start();

	}
}

class MyRunnable implements Runnable {
	int num = 100;

	@Override
	public void run() {
		while (num > 0) {
			synchronized (this) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
				}
				System.out.println(Thread.currentThread().getName() + "--" + num--);
			}
		}
	}

	// synchronized void ceshi() {
	// if (num > 0)
	// try {
	// Thread.sleep(10);
	// } catch (InterruptedException e) {
	// }
	// System.out.println(Thread.currentThread().getName() + "--" + num--);
	//
	// }
}
