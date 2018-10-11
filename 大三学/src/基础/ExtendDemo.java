package 基础;
/*
 * 1.重写：要相同的函数名，函数返回类型且子类的权限大于或等于父类的权限；
 * 2.构造函数：先执行父类的构造函数
 * 3.子类中有默认的空参数super();为隐式，一般是不写，
 * 但如果有用父类非空参数，必须写super(x);为显示
 * 4.当构造函数有this();就没有super()；
 * 因为this();super();都是写在第一行且只有一个；
 */
public class ExtendDemo {
	public static void main(String[] args) {
		Zi z  = new Zi();
	    z.show();
	}

}
class Fu{
	
	int money = 10;//父类的成员变量
	//父类构造函数
	Fu(int x){
		System.out.println("我是父亲我有"+money+"亿1"+x);
	};
	//父类方法
	void show(int y){
		System.out.println("老子有"+money+"亿2"+y);
	}
	
}
class Zi extends Fu{//子类构造函数
	Zi()
	{//super();隐式
		super(2);//显示调用
		System.out.println("我也有"+money+"亿是我父亲的3");
	}
	//子类的方法
  public  int show()//重写（覆盖）父类方法，要相同的函数名(show)，函数返回类型（int）且子类的权限大于或等于父类的权限；
  { 
	  //super.show(2);//调用父类方法 
	  System.out.println("儿子也有"+money+"亿是老子的4");
	  return 1;
  }
}







