package ����;
/*
 * �����ڲ��ࣺ1��new�������ڶ�����ʵ�ַ������ڵ��ã�ȱ��ֻ��ʵ��һ��������
 * 2.����������ת��������չ�ԣ�����̬����ʵ�ַ������ٵ��á�
 */

public class NiMing {

	public static void main(String[] args) {
	
		Outer1 o = new Outer1();
		o.method();

	}

}

interface inter {
	void show1();

	void show2();
}

class Outer1 {
	int num = 3;

	// ��һ������ʹ�ýӿڵĶ��󡣿���ͨ���ڲ�����ʵ�֡�
public	class inner implements inter {
		public void show1() {System.out.println();}
		public void show2() {System.out.println();}
	}

public  void method ()
{/*
	inner in  = new inner();
	in.show1();
	in.show2();
	*/
    //����򻯡��������������ڲ���
	new  inner()
	{
	public void show1(){System.out.println("3");};	
	public void show2(){System.out.println("4");};
	}.show1();//���ô������ڲ�����Ȼ���Լ򻯵�Ҳ��һ����ȱ��ֻ����һ��������

    //Ϊ���ܹ��ö�������ͼ򻯣��������˶�̬�������ڲ���
	inter in = new inner()//����ת��
	{
		public void show1(){System.out.println("5");};
		public void show2(){System.out.println("6");};
	};
	in.show1();
	in.show2();
	
}
}












