package ����;

/*
 * ���ӿ��ص㡿
 * 1���ӿڲ����Դ�������
 * 2��������븲�ǽӿڵ����з���������ſ���ʵ�����������������һ�������ࣻ
 * 3���ܹ���ʵ�֣����̳в�ͬ����̳еĸ����й��������壬�������������ʱ��֪�������ĸ�����
 * ����ʵ�ֽ���ˣ���Ϊ��û�����塣
 */
public class InterfaceDemo {
	public static void main(String[] args) {
       D d = new D();
       d.show1();
       d.w1();
	}
}
interface inter1 {//�ӿ�1
	public void show1();
	public void show2();
	public void show3();
	public void show4();
}
interface inter2 {//�ӿ�2
	public void w1();
	public void w2();
	public void w3();
	public void w4();
	
}
class Fu1{//��������
	public void f(){};
}
//��ͨ��ʵ�ֽӿ�1
class A implements inter1{//�ӿ�ʵ����Ҫ�������еķ����ͳ���һ����
	public void show1(){};
	public void show2(){};
	public void show3(){};
	public void show4(){};
}
//�ӿ���չ���̳и���ͬʱ��ʵ�ֽӿ�
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
//��Ҫʵ�����ӿڵ�ĳһ������
//Ϊ�˼������ȴ���һ����ʵ�����еķ�����
abstract class C implements inter1,inter2{//��Ϊ���಻��Ҫ�����������Կ��Լ�abstract.
	public void show1(){};
	public void show2(){};
	public void show3(){};
	public void show4(){};
	public void w1(){};
	public void w2(){};
	public void w3(){};
	public void w4(){};
}
//Ȼ�����ǿ��Դ���һ����̳�Cʵ������һ���������ɣ�
class D extends C{
	public void show1(){
		System.out.println("�ӿ�");
	}
	public void w1(){
		System.out.println("ʵ��");
	}
}

























