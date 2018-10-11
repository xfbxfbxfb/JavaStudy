package 基础;

/*
 * 【接口特点】
 * 1，接口不可以创建对象
 * 2，子类必须覆盖接口的所有方法后，子类才可以实例化，否则子类就是一个抽象类；
 * 3，能够多实现，与多继承不同，多继承的父类中功能有主体，而导致子类调用时不知道调用哪个主体
 * 但多实现解决了，因为他没有主体。
 */
public class InterfaceDemo {
	public static void main(String[] args) {
       D d = new D();
       d.show1();
       d.w1();
	}
}
interface inter1 {//接口1
	public void show1();
	public void show2();
	public void show3();
	public void show4();
}
interface inter2 {//接口2
	public void w1();
	public void w2();
	public void w3();
	public void w4();
	
}
class Fu1{//创建父类
	public void f(){};
}
//普通的实现接口1
class A implements inter1{//接口实现需要覆盖所有的方法和抽象一样。
	public void show1(){};
	public void show2(){};
	public void show3(){};
	public void show4(){};
}
//接口扩展，继承父类同时多实现接口
class B extends Fu1 implements inter1,inter2{
	public void f(){};
	public void show1(){};
	public void show2(){};
	public void show3(){};
	public void show4(){};
	public void w1(){};
	public void w2(){};
	public void w3(){};
	public void w4(){};
	
}
//若要实现俩接口的某一个方法
//为了简便可以先创建一个类实现所有的方法。
abstract class C implements inter1,inter2{//因为这类不需要创建对象所以可以加abstract.
	public void show1(){};
	public void show2(){};
	public void show3(){};
	public void show4(){};
	public void w1(){};
	public void w2(){};
	public void w3(){};
	public void w4(){};
}
//然后我们可以创建一个类继承C实现其中一个方法即可；
class D extends C{
	public void show1(){
		System.out.println("接口");
	}
	public void w1(){
		System.out.println("实现");
	}
}

























