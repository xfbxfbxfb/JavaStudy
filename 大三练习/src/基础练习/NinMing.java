package 基础练习;

import 基础练习.NiMing1.Niming2;

class NiMing1 {
	// 方法有两种一种使用匿名内部类，根据只有一个方法所以使用匿名内部类更好
	// 方法一匿名内部类
	/*
	 * public static Inter method()//返回类型为Inter { //利用匿名内部类 return new
	 * Inter()//返回Inter的对象 { public void show() { System.out.println("ok"); } };
	 * }
	 */
	// 方法二利用内部类
	static class Niming2 implements Inter {
		public void show() {
			System.out.println("sok");
		}
	}

	public static Inter method()// 返回类型为Inter,静态只能调用静态所以Niming2是静态
	{
		return new Niming2();
	}
}

interface Inter {
	public void show();
}



//面试常用题
class Niming3{
public void method()
{
	new Object()
	{
		public void show(){};
	}.show();//编译能成功
	
/*	Object o= new Object ()//利用多态
			{
		public void show(){}
			};
			o.show();
 //编译失败
/*
 * 失败总结
 * Object 里没有show()方法  这里不懂要看多态
 */

}
	
}

public class NinMing {
	public static void main(String[] args) {
		NiMing1.method().show();// 目标
	}

}



