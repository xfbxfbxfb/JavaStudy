package �߳�;

public class �����߳����� {
	public static void main(String[] args) {
		ThreadDome t = new ThreadDome();//�̳�Thread��Ѷ�������񶼷���һ�𣬲����о�����
		t.start();
		ThreadDome t1 = new ThreadDome();
		t1.start();
		RunnableDome r = new RunnableDome();
		Thread  t2 = new Thread(r);
		t2.start();
		System.out.println(Thread.currentThread().getName()+"���");
	}

}
/* �̳�Thread�� */
class ThreadDome extends Thread{//��ThreadDome�м̳���������ʱ�����ü̳��̣߳���Ϊ���ܶ�̳�
	public void run(){
		
		for(int i=0;i<5;i++)
		System.out.println(Thread.currentThread().getName()+"���");	
	}
}
/* ʵ��Runnable�ӿ�*/
 class RunnableDome implements Runnable{//Ŀǰ��㷺Ӧ�õ�

	@Override
	public void run() {
		for(int i=0;i<5;i++)
			System.out.println(Thread.currentThread().getName()+"Hello Word!");
	}
	 
 }
