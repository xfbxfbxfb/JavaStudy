package ����;
/* ���һ���Ǿ�̬�ڲ������ֱ�ӷ����ⲿ��ĳ�Ա��
   ���������̬�ڲ���ԷǾ�̬���ã�ֱ�Ӵ���������У�����Ҫ����0uter�ⲿ�����
   ����������ʾ�̬���еľ�̬��Ա��
 */
public class Outer {//�ⲿ��
	int a =3;
	void math(){//�����ⲿ��ĳ�Ա
		inner in = new inner();
		in.show();
	}
class inner{//�Ǿ�̬�ڲ��࣬�������徲̬��Ա��ֻ�ܶ��徲̬����static final.
	int b =4;
		
void  show(){
	System.out.println(a+b);
	
	}
		
	}
static  class inner2{//��̬�ڲ��������ⲿ��ļ�����֮���أ��൱��һ���ⲿ�ࣻ��̬�಻�ܵ��÷Ǿ�̬�ĳ�Ա
    int a =10;
 void 	show2()
 {
	 System.out.println(a);
 }
 static void  staticshow(){
	 System.out.println("��̬�еĳ�Ա");
	 
 }
}
public static void main(String[] args) {
/*    	  �Ǿ�̬�ڲ������ֱ�ӷ����ⲿ��ĳ�Ա��*/
//	  Outer out = new Outer();
//	  out.math();
	  Outer.inner in =new Outer().new inner();//�ȼ����ⲿ�֮࣬����طǾ�̬
	  in.show();
	 
	/* Outer.inner2 in2 =new Outer.inner2();//��̬�ڲ���ԷǾ�̬���ã�ֱ�Ӵ���������У�����Ҫ����0uter�ⲿ�����
	 in2.show2();*/
	  
	  
	  Outer.inner2.staticshow();//��Ϊ��̬�ڲ��������ⲿ��һ����أ���̬��ԱҲһ��һ����ء����Բ���Ҫ��������ֱ�ӵ��ü���
	  
	  
}
}
 
  
 