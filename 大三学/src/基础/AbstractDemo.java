package ����;
/*
 * ���󷽷��ķ�����
 * 1��������ͳ��󷽷�����Ҫ��abstract���Σ����󷽷�һ��Ҫ�����ڳ������У�
 * 2�������಻�ɴ���ʵ����ԭ����ó��󷽷�û�����壬
 * 3.ֻ�и����˳����������еĳ��󷽷���������ſ���ʵ�������������໹��һ��������
 * ע�⣺
 * abstract���ܸ����¹ؼ��ֹ��棻
 * 1��final:final���ε��಻���������
 * 2��private��˽�к����಻�ܱ������ҵ�
 * 3��static:����static������������ļ��ض����أ�����������ֱ�ӵ��á�
 */
public class AbstractDemo {

	public static void main(String[] args) {
		Apple a = new Apple();
		a.color();
	}
}
   abstract class fruit{
	   abstract void color();//������abstract����
   }
   /*������д���෽��*/
   class Apple extends AbstractDemo{
	   void color(){
		   System.out.println("Apple����ɫΪ��ɫ");
	   }
	   
   }