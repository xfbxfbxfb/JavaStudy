package �߳�;
/*     ʹ��sleep����ʹ�߳�˯��*/

 class Myrunnable2 implements Runnable
  {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0;i<100;i++)
		{
			System.out.print("&");
			try {
				Thread.sleep(50);                            //����Ĳ����Ǻ��룻˯��50���룻
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
  }
  
 class Myrunnable3 implements Runnable
  {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++)
		{
			System.out.print("*");
			try {
				Thread.sleep(500);                          //����Ĳ����Ǻ��룻˯��500���룻
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}  
  }	
 public class test2 {
		public static void main(String arg[])
		{
			Myrunnable2 m = new Myrunnable2();
			Myrunnable3 m1=new Myrunnable3();
			Thread t1 = new Thread(m) ;
			Thread t2 = new Thread(m1);
			t1.start();
			t2.start();
		 }
}

