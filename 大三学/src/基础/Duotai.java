package 基础;

/*
 * 1.成员变量：编译看左边（编译不创建对象运行创建对象）：参考的是引用型变量所属的类是否有被调用的成员变量。没有编译失败
 * 运行时期：也是调用引用型变量所属的类的成员变量，即看左边。
 * 2.成员函数：编译看左边，没有函数编译失败，运行看右边。当运行时子类没有函数时，运行父类的。
 * 对于成员函数时动态绑定到对象上。
 * 3.静态函数
 * 静态函数是静态的绑定到类上。即只看左边
 */

public class Duotai {
	public static void main(String[] args) {
		FuDuoTai f = new ZiDuoTai();// 多态//向上转型，不能使用子类特有的方法
		System.out.println(f.num);// 利用多态时参考左边，有调用的成员变量，能编译运行。
		f.show();//编译看左边，运行时看右边，因为子类有重写功能所以用最新的如果子类没有，运行父类。
		f.method();//父类静态方法
		ZiDuoTai z = new ZiDuoTai();
		System.out.println(z.num);
		z.show();
		ZiDuoTai l = (ZiDuoTai)f;//向下转型
		System.out.println(l.num);
		l.show();
	}
}

class FuDuoTai {
	int num = 3;

	void show() {
		System.out.println("父类运行");
	}
	static void method()
	{
		System.out.println("静态父类运行");
	}
}






class ZiDuoTai extends FuDuoTai {
	int num = 5;

	void show() {
		System.out.println("子类运行");
	}
	static void method()
	{
		System.out.println("静态子类运行");
	}
	void te() {
		
		
		System.out.println("子类特有的方法！");
		
	}
}