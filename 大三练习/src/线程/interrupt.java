package �߳�;

//��ʾֹͣ�̡߳�
class Demo implements Runnable
{
	private boolean flag = true;
	public synchronized void run()
	{
		while(flag)
		{
			try
			{
				wait();//t1  t2
			}
			catch (InterruptedException e)
			{
				System.out.println(Thread.currentThread().toString()+"....."+e.toString());
				changeFlag();
			}

			System.out.println(Thread.currentThread().getName()+"----->");
		}
	}
	//�Ա�ǵ��޸ķ�����
	public void changeFlag()
	{
		flag = false;
	}
}


class interrupt

{
	public static void main(String[] args) 
	{
		Demo d = new Demo();

		Thread t1 = new Thread(d,"����");
		Thread t2 = new Thread(d,"Сǿ");
		t1.start();
		//��t2���Ϊ��̨�̣߳��ػ��̡߳�
//		t2.setDaemon(true);
		t2.start();

		int x = 0;
		while(true)
		{
			if(++x == 50)//�������㡣
			{
//				d.changeFlag();//�ı��߳��������ı�ǣ��������߳�Ҳ������
				//��t1�̶߳�������ж�״̬�������ǿ������ָ�������״̬��
				t1.interrupt();
				//��t2�̶߳�������ж�״̬�������ǿ������ָ�������״̬��
				t2.interrupt();

				break;//����ѭ�������߳̿��Խ�����
			}
			System.out.println("main-------->"+x);
		}

		System.out.println("over");
	}
}
