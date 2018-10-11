package 线程;

public class 匿名 {
	public static void main(String[] args) {
		// 1.匿名线程
		new Thread() {
			public void run() {
				for (int i = 1; i < 30; i++)
					System.out.println(Thread.currentThread().getName() + "..a." + i);
			}
		}.start();
		// 2.
		Runnable r = new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i < 30; i++)
					System.out.println(Thread.currentThread().getName() + "..b." + i);

			}
		};
		new Thread(r).start();
//面试题将以上两种结合
		new Thread(new Runnable() {

			public void run() {

				System.out.println(Thread.currentThread().getName() + ".子类运行.");

			}
		}) {
			public void run() {

				System.out.println(Thread.currentThread().getName() + ".父类运行.");

			}
		}.start();
	}
}
