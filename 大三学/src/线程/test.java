package �߳�;

/*����Runnable�Ľӿ���ʵ���̣߳�Runnable����������һ���̣߳�ֻ���ڸ�����ͨ��ʵ��run����ָ�����߳�����Ҫ��ɵ�����*/
/*�߳�ֻ�ܵ���һ�Σ�ֻ��startһ�Σ�*/

public class test {
	

	   public static void main(String args[])
	   {
		   Myrunnable m = new Myrunnable();
		   Myrunnable1 m1=new Myrunnable1();
		   Thread t1 = new Thread (m);
		   Thread t2 =new Thread (m1);
		   t1.start();
		   t2.start();
				  
	   }
}
/*������һ���Q��*/
class Myrunnable implements Runnable
{
	public void run()
	{
	for(int i=1;i<100;i++)
	{
		System.out.print("*");
	}
		
	}
	
}
/*�ڶ����߳�*/
class Myrunnable1 implements Runnable
{

@Override
public void run() {
	// TODO Auto-generated method stub
	for(int i=1;i<100;i++)
	{
		System.out.print("#");
	}
		
}
   
}

