package ������ϰ;
/*
 * ������Ӧ��
 * ������ʵ�ֶԶ���Ŀ��ƣ�������������ͬһ������
 * �����ķ������裺1�����캯��˽�л���2.�ڱ��ഴ�����󣨶���ʽ���ڷ�����
 * ������������ʽ����3.�ڷ����е��ö���
 * 
 * �������ö���ʽ���õĵ���
 */

public class SingleDemo {
	public static void main(String[] args) {
		Demo ss = Demo.getInstant();// ��������÷���

	}

}

class Demo {
	 private Demo() {
		 System.out.println("22��1");	
		 s.get();
	 }// ���캯��˽�л���

	private static Demo s = new Demo();// ����Ĵ���

	public static Demo getInstant() {
		System.out.println("22��3");

		return s; // �������ض���

	}
	public static void get() {
		System.out.println("22��2");

		 // �������ض���

	}
}
