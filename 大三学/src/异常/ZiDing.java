package 异常;

public class ZiDing {
	public static void main(String[] args) {
		Persio p = new Persio("d");
		
	}
	
}


//自定义异常
/*
* 构造函数到底抛出这个NoAgeException是继承Exception呢还是继承 RuntimeException呢？
* 1，继承Exception,必须要有throws声明，后调用者进行捕获，一旦问题处理了程序继续执行。
* 2，继续RuntimeException,不需要throws声明的，没有捕获 代码，一旦NoAgeException 发生，程序终止，并有jvm将信息显示到屏幕
* 上，让调用者看到问题，修正代码。
*/
class NoMingException extends RuntimeException{
	NoMingException(){
		super();
	}
	
	NoMingException(String n){
		super(n);
	}
}
class Persio{
	String name ;
	Persio(String name){
		
		if(name!=null) {
			throw new  NoMingException( name+"有名字异常！");
		
		}
	}
	
	
}


