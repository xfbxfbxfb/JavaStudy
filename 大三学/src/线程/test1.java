package �߳�;
/*���ü̳еķ�����ʵ���̣߳�һ���������߳�*/

public class test1 {
	public static void main(String args[])
	{
		Mythread m = new Mythread();
		m.start();
		Mythread1 m1 = new Mythread1();
		m1.start();
	}

}
class Mythread extends Thread{
	public void run()
	{
		for(int i =0;i<100;i++)
		{
			System.out.print("*");
		}
		System.out.print("....");
	}
} 
class Mythread1 extends Thread{
	public void run()
	{
		for(int i =0;i<100;i++)
		{
			System.out.print("#");
			
		}
	}
	
	
	
}
