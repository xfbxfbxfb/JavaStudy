package ������ϰ;

import ������ϰ.NiMing1.Niming2;

class NiMing1 {
	// ����������һ��ʹ�������ڲ��࣬����ֻ��һ����������ʹ�������ڲ������
	// ����һ�����ڲ���
	/*
	 * public static Inter method()//��������ΪInter { //���������ڲ��� return new
	 * Inter()//����Inter�Ķ��� { public void show() { System.out.println("ok"); } };
	 * }
	 */
	// �����������ڲ���
	static class Niming2 implements Inter {
		public void show() {
			System.out.println("sok");
		}
	}

	public static Inter method()// ��������ΪInter,��ֻ̬�ܵ��þ�̬����Niming2�Ǿ�̬
	{
		return new Niming2();
	}
}

interface Inter {
	public void show();
}



//���Գ�����
class Niming3{
public void method()
{
	new Object()
	{
		public void show(){};
	}.show();//�����ܳɹ�
	
/*	Object o= new Object ()//���ö�̬
			{
		public void show(){}
			};
			o.show();
 //����ʧ��
/*
 * ʧ���ܽ�
 * Object ��û��show()����  ���ﲻ��Ҫ����̬
 */

}
	
}

public class NinMing {
	public static void main(String[] args) {
		NiMing1.method().show();// Ŀ��
	}

}



