package �߳�;

/*
 * ����дһ�����̣߳����������ߣ����������ߵĹ�ϵ��
 * ����
 * ���
 * ��Դ�������ߣ�������
 *ʹ����wait()���̴߳��ڵȴ���״̬�̴߳����̳߳���,��
 *notify()�������̳߳�������һ���ȴ����߳�;
 *notifyAll()�����̳߳��е����еȴ����߳�;
 *�ر�ע�⣺��Щ��������ʹ�õ�ͬ�������У���Ϊ����Ҫ��ʶwait(),notify()�ȷ�������������ͬһ�����ϵ�notifyֻ�ܻ��Ѹ����ϱ�wait��
 *���̡߳�
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
//�����߷���
	public synchronized void set(String name) {
		while (flag) {
			try {
				wait();//�����ߵȴ�

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
			this.name = name + count;
			System.out.println(Thread.currentThread().getName() + "������....." + this.name);
			count++;
			flag = true;
		
		this.notifyAll();//����������
	}
//�����߷���
	public synchronized void out() {
	while (flag) {
			System.out.println(Thread.currentThread().getName() + "������......." + this.name);
			flag = false;
		} 
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		
		this.notifyAll();//����������
	}
}
//������
class Produce implements Runnable {
	Reasouse r;

	Produce(Reasouse r) {
		this.r = r;
	}

	@Override
	public void run() {
		for (int i = 0; i <= 60; i++)
			r.set("����");
	}

}
//������
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
