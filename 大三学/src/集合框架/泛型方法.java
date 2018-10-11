package 集合框架;

public class 泛型方法 {
	public static void main(String[] args) {
		Demo d = new Demo();
//		Demo<String> d = new Demo<String>();
		d.show("sda");
		Demo.show1(3);//方法用的静态所以可以用类来调用
	}
}
 
class  Demo{
//	class  Demo<E>{
	 
	 public void show(String e){//指定传入的类型
		System.out.println("字符串print:"+e);
	 }
	 public  static void show1(Integer e){
		 System.out.println("整数print:"+e);
	 }
	
}