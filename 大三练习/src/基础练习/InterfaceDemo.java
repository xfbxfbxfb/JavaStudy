package »ù´¡Á·Ï°;

public class InterfaceDemo {
	public static void main(String[] args) {
		C c= new C();
		c.show();
	}

}
class A{
	void show(){};
}
class B{
	void show(){};
}
class C extends A{
	public void show(){
		System.out.println("jfdsf");
	}
}