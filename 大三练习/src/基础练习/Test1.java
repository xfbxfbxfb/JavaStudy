package ������ϰ;
/*
 * ���ݣ�дһ�������ֵ��ӿƼ���ѧ��Ϣ�Ƽ�ѧԺ���������о���������飬��е���ӹ���Ф�������������̴߳�ӡ������
 */

public class Test1 {
	String str1 = "���ֵ��ӿƼ���ѧ��Ϣ�Ƽ�ѧԺ";
	String str2 = "�������о����������";
	String str3 = "��е���ӹ���Ф����";
	class school implements Runnable
	{
		char [] c1 = str1.toCharArray();
		@Override
		public void run() {
			for(int i =0;i<str1.length();i++)
			{
				System.out.print(c1[i]);
			}
			
		}
		
	}
	class zhong implements Runnable
	{
		char [] c2 = str2.toCharArray();
		@Override
		public void run() {
			for(int i =0;i<str2.length();i++)
			{
				System.out.print(c2[i]);
			}
			
		}
	}
	class names implements Runnable
	{
		char [] c3 = str3.toCharArray();
		@Override
		public void run() {
			
			for(int i =0;i<str3.length();i++)
			{
				System.out.print(c3[i]);
			}
			
		}
	}
	public static void main(String[] args) {
		Test1.school s1 =new Test1().new school();
		zhong s2 =new Test1().new zhong();
		names s3 =new Test1().new names();
		Thread t1 = new Thread(s1);
		Thread t2= new Thread(s2);
		Thread t3 = new Thread(s3);
		t1.start();
		t2.start();
		t3.start();
	}
}


