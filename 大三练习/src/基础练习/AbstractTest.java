package ������ϰ;
/*
 * Ҫ��С�������䣬���֣�����ҵ��С�������䣬���֣�����ҵ��˯����
 * дһ����������
 */

public class AbstractTest {
	public static void main(String[] args) {

		XiaoMing xm = new XiaoMing(20, "С��");
		xm.work();

		XiaoBo xb = new XiaoBo(21, "С��");
		xb.work();
	}
}

abstract class Student {

	private int age;
	private String name;

	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}

	abstract void work();
}

class XiaoMing extends Student {

	public XiaoMing(int age, String name) {
		super(age, name);
		System.out.println("����" + name + "�ҽ���" + age + "��");
	}

	@Override
	void work() {
		System.out.println("�����ڹ���");

	}
}

class XiaoBo extends Student {
	private String w = "���";

	public XiaoBo(int age, String name) {
		super(age, name);
		// TODO Auto-generated constructor stub
		System.out.println("����" + name + "�ҽ���" + age + "��");
	}

	@Override
	void work() {
		// TODO Auto-generated method stub
		System.out.println("�����ڹ�������ʱ��" + w);

	}

}