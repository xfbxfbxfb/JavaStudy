package ���Ͽ��;

public class ���ͷ��� {
	public static void main(String[] args) {
		Demo d = new Demo();
//		Demo<String> d = new Demo<String>();
		d.show("sda");
		Demo.show1(3);//�����õľ�̬���Կ�������������
	}
}
 
class  Demo{
//	class  Demo<E>{
	 
	 public void show(String e){//ָ�����������
		System.out.println("�ַ���print:"+e);
	 }
	 public  static void show1(Integer e){
		 System.out.println("����print:"+e);
	 }
	
}