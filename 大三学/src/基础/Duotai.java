package ����;

/*
 * 1.��Ա���������뿴��ߣ����벻�����������д������󣩣��ο����������ͱ������������Ƿ��б����õĳ�Ա������û�б���ʧ��
 * ����ʱ�ڣ�Ҳ�ǵ��������ͱ�����������ĳ�Ա������������ߡ�
 * 2.��Ա���������뿴��ߣ�û�к�������ʧ�ܣ����п��ұߡ�������ʱ����û�к���ʱ�����и���ġ�
 * ���ڳ�Ա����ʱ��̬�󶨵������ϡ�
 * 3.��̬����
 * ��̬�����Ǿ�̬�İ󶨵����ϡ���ֻ�����
 */

public class Duotai {
	public static void main(String[] args) {
		FuDuoTai f = new ZiDuoTai();// ��̬//����ת�ͣ�����ʹ���������еķ���
		System.out.println(f.num);// ���ö�̬ʱ�ο���ߣ��е��õĳ�Ա�������ܱ������С�
		f.show();//���뿴��ߣ�����ʱ���ұߣ���Ϊ��������д�������������µ��������û�У����и��ࡣ
		f.method();//���ྲ̬����
		ZiDuoTai z = new ZiDuoTai();
		System.out.println(z.num);
		z.show();
		ZiDuoTai l = (ZiDuoTai)f;//����ת��
		System.out.println(l.num);
		l.show();
	}
}

class FuDuoTai {
	int num = 3;

	void show() {
		System.out.println("��������");
	}
	static void method()
	{
		System.out.println("��̬��������");
	}
}






class ZiDuoTai extends FuDuoTai {
	int num = 5;

	void show() {
		System.out.println("��������");
	}
	static void method()
	{
		System.out.println("��̬��������");
	}
	void te() {
		
		
		System.out.println("�������еķ�����");
		
	}
}