package 基础练习;
/*
 * 单例的应用
 * 单例：实现对对象的控制，即多个程序操作同一个对象。
 * 单例的方法步骤：1，构造函数私有化，2.在本类创建对象（饿汉式）在方法中
 * 创建对象（懒汉式）；3.在方法中调用对象。
 * 
 * 以下是用饿汉式调用的单例
 */

public class SingleDemo {
	public static void main(String[] args) {
		Demo ss = Demo.getInstant();// 利用类调用方法

	}

}

class Demo {
	 private Demo() {
		 System.out.println("22岁1");	
		 s.get();
	 }// 构造函数私有化；

	private static Demo s = new Demo();// 对象的创建

	public static Demo getInstant() {
		System.out.println("22岁3");

		return s; // 方法返回对象

	}
	public static void get() {
		System.out.println("22岁2");

		 // 方法返回对象

	}
}
