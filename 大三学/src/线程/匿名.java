package �߳�;

public class ���� {
	public static void main(String[] args) {
		// 1.�����߳�
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
//�����⽫�������ֽ��
		new Thread(new Runnable() {

			public void run() {

				System.out.println(Thread.currentThread().getName() + ".��������.");

			}
		}) {
			public void run() {

				System.out.println(Thread.currentThread().getName() + ".��������.");

			}
		}.start();
	}
}
