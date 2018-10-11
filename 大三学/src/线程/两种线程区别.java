package 线程;

public class 两种线程区别 {
	public static void main(String[] args) {
		ThreadDome t = new ThreadDome();//继承Thread类把对象和任务都放在一起，并且有局限性
		t.start();
		ThreadDome t1 = new ThreadDome();
		t1.start();
		RunnableDome r = new RunnableDome();
		Thread  t2 = new Thread(r);
		t2.start();
		System.out.println(Thread.currentThread().getName()+"你好");
	}

}
/* 继承Thread类 */
class ThreadDome extends Thread{//当ThreadDome有继承其他父类时不能用继承线程，因为不能多继承
	public void run(){
		
		for(int i=0;i<5;i++)
		System.out.println(Thread.currentThread().getName()+"你好");	
	}
}
/* 实现Runnable接口*/
 class RunnableDome implements Runnable{//目前最广泛应用的

	@Override
	public void run() {
		for(int i=0;i<5;i++)
			System.out.println(Thread.currentThread().getName()+"Hello Word!");
	}
	 
 }
