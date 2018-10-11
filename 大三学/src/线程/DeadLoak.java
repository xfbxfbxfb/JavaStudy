package �߳�;
/*
    ������������⣺�����߳�ִ�г���ʱ���������������������߳�1����1����Ҫ��2�����߳�2����2�����һ�Ҫ����1
 */
public class DeadLoak {
	public static void main(String[] args) {
		Singer s1 = new Singer(true);
		Singer s2 = new Singer(false);
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);
		t1.start();
		t2.start();
	}
}
class Singer implements Runnable{
	private boolean flg;
	Singer( boolean flg){
		this.flg=flg;
	}
	@Override
	public void run() {
		if(flg){
			while(true){
			synchronized(Lock.LOCKA){
				System.out.println(Thread.currentThread().getName()+"��A");
				synchronized(Lock.LOCKB){
					System.out.println(Thread.currentThread().getName()+"��B");
				}
			}
		}
	}
		else{
			while(true){
			synchronized(Lock.LOCKB){
				System.out.println(Thread.currentThread().getName()+"��B");
				synchronized(Lock.LOCKA){
					System.out.println(Thread.currentThread().getName()+"��A");
				}
			}
		}
	}
}
}
class Lock{
	public static final Object LOCKA=new Object();
	public static final Object LOCKB=new Object();
}




