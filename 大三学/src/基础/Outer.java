package 基础;
/* 情况一：非静态内部类可以直接访问外部类的成员，
   情况二：静态内部类对非静态调用，直接创建对象就行，不需要创建0uter外部类对象。
   情况三：访问静态类中的静态成员，
 */
public class Outer {//外部类
	int a =3;
	void math(){//属于外部类的成员
		inner in = new inner();
		in.show();
	}
class inner{//非静态内部类，不允许定义静态成员，只能定义静态常量static final.
	int b =4;
		
void  show(){
	System.out.println(a+b);
	
	}
		
	}
static  class inner2{//静态内部类随着外部类的加载随之加载，相当与一个外部类；静态类不能调用非静态的成员
    int a =10;
 void 	show2()
 {
	 System.out.println(a);
 }
 static void  staticshow(){
	 System.out.println("静态中的成员");
	 
 }
}
public static void main(String[] args) {
/*    	  非静态内部类可以直接访问外部类的成员，*/
//	  Outer out = new Outer();
//	  out.math();
	  Outer.inner in =new Outer().new inner();//先加载外部类，之后加载非静态
	  in.show();
	 
	/* Outer.inner2 in2 =new Outer.inner2();//静态内部类对非静态调用，直接创建对象就行，不需要创建0uter外部类对象。
	 in2.show2();*/
	  
	  
	  Outer.inner2.staticshow();//因为静态内部类随着外部类一起加载，静态成员也一样一起加载。所以不需要创建对象，直接调用即可
	  
	  
}
}
 
  
 