package �߳�;
/*
 * jion�����������߳�ִ�е��˵ȴ����߳�ִ���꣬��ִ�������
 * yield����:�߳���ʱ��ͣ���ͷ�ִȨ
 */

public class jionDemo {
	public static void main(String[] args) {
		A a = new A();
		Thread t1 = new Thread(a ,"��һ��");
		Thread t2 = new Thread(a ,"�ڶ���");
		t1.start();
		/*try {
			t1.join();//���߳��ڴ˵ȴ���ֱ����һ���߳�������;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		t2.start();
		//�����������ڴ˴�����t2�Ƿ�ִ����ֻҪt1ִ����Ϳ��Լ���ִ����ȥ
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
		  Thread.yield();//�߳��ڴ��ͷ�ִ��Ȩ��
	   }
	}
	
}