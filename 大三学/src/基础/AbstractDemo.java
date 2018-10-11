package 基础;
/*
 * 抽象方法的方法：
 * 1，抽象类和抽象方法都需要被abstract修饰，抽象方法一定要定义在抽象类中；
 * 2，抽象类不可创建实例，原因调用抽象方法没有意义，
 * 3.只有覆盖了抽象类中所有的抽象方法后，其子类才可以实例化，否则子类还是一个抽象类
 * 注意：
 * abstract不能跟以下关键字共存；
 * 1，final:final修饰的类不能子类调用
 * 2，private：私有后子类不能被子类找到
 * 3，static:用了static，函数随着类的加载而加载，可以用类名直接调用。
 */
public class AbstractDemo {

	public static void main(String[] args) {
		Apple a = new Apple();
		a.color();
	}
}
   abstract class fruit{
	   abstract void color();//必须用abstract修饰
   }
   /*子类重写父类方法*/
   class Apple extends AbstractDemo{
	   void color(){
		   System.out.println("Apple的颜色为红色");
	   }
	   
   }