package 线程;
/*
 * jion方法：当主线程执行到此等待该线程执行完，再执行下面的
 * yield方法:线程临时暂停，释放执权
 */

public class jionDemo {
	public static void main(String[] args) {
		A a = new A();
		Thread t1 = new Thread(a ,"第一个");
		Thread t2 = new Thread(a ,"第二个");
		t1.start();
		/*try {
			t1.join();//主线程在此等待，直到第一个线程运行完;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		t2.start();
		//若将方法放在此处不管t2是否执行完只要t1执行完就可以继续执行下去
		/*try {
		t1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
		for(int i = 1;i<30;i++){
			System.out.println("main....."+i);
		}
		System.out.println("over");
	}
}

class A implements Runnable{

	@Override
	public void run() {
	   for(int i = 0; i<60; i++){
		  System.out.println(Thread.currentThread().getName()+"..."+i);
		  Thread.yield();//线程在此释放执行权，
	   }
	}
	
}