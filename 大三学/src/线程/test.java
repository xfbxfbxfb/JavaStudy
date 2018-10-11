package 线程;

/*利用Runnable的接口来实现线程，Runnable其自身并不是一个线程，只是在该类中通过实现run方法指出了线程所需要完成的任务*/
/*线程只能调用一次，只能start一次，*/

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
/*創建第一個綫程*/
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
/*第二个线程*/
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

