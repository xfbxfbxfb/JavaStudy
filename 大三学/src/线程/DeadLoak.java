package 线程;
/*
    死锁：自我理解：两个线程执行程序时，里面有俩个锁，例如线程1拿了1锁还要拿2锁但线程2拿了2锁并且还要拿锁1
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
				System.out.println(Thread.currentThread().getName()+"锁A");
				synchronized(Lock.LOCKB){
					System.out.println(Thread.currentThread().getName()+"锁B");
				}
			}
		}
	}
		else{
			while(true){
			synchronized(Lock.LOCKB){
				System.out.println(Thread.currentThread().getName()+"锁B");
				synchronized(Lock.LOCKA){
					System.out.println(Thread.currentThread().getName()+"锁A");
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




