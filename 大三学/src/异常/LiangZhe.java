package 异常;

public class LiangZhe {

	public static void main(String[] args) {
		 Persion p  = new  Persion("肖", -20);

	}

}
//自定义异常
/*
 * 构造函数到底抛出这个NoAgeException是继承Exception呢还是继承 RuntimeException呢？
 * 1，继承Exception,必须要有throws声明，后调用者进行捕获，一旦问题处理了程序继续执行。
 * 2，继续RuntimeException,不需要throws声明的，没有捕获 代码，一旦NoAgeException 发生，程序终止，并有jvm将信息显示到屏幕
 * 上，让调用者看到问题，修正代码。
 */
class NoAgeException extends RuntimeException{
	NoAgeException(){
		super();
	}
	NoAgeException(String m){
		super(m);//如果自定义异常需要异常信息，可以通过父类带有参数的构造器即可。
	}
}




class Persion{
	private String name;
	private int age;
	 Persion(String name, int age)
	{
		if(age<0)
		{
			throw new NoAgeException(age+"，年龄数值非法");
		}
	}
	
	}
