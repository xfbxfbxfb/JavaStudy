package 基础;
/*
 * 匿名内部类：1，new个对像在对象里实现方法，在调用，缺点只能实现一个方法，
 * 2.将对象向上转型增加扩展性，即多态，在实现方法，再调用。
 */

public class NiMing {

	public static void main(String[] args) {
	
		Outer1 o = new Outer1();
		o.method();

	}

}

interface inter {
	void show1();

	void show2();
}

class Outer1 {
	int num = 3;

	// 在一个类里使用接口的对象。可以通过内部类来实现‘
public	class inner implements inter {
		public void show1() {System.out.println();}
		public void show2() {System.out.println();}
	}

public  void method ()
{/*
	inner in  = new inner();
	in.show1();
	in.show2();
	*/
    //对其简化。。。利用匿名内部类
	new  inner()
	{
	public void show1(){System.out.println("3");};	
	public void show2(){System.out.println("4");};
	}.show1();//利用此匿名内部类虽然可以简化但也有一定的缺点只能用一个方法。

    //为了能够用多个方法和简化，我们用了多态和匿名内部类
	inter in = new inner()//向上转型
	{
		public void show1(){System.out.println("5");};
		public void show2(){System.out.println("6");};
	};
	in.show1();
	in.show2();
	
}
}












