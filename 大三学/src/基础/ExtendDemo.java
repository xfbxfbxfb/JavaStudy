package ����;
/*
 * 1.��д��Ҫ��ͬ�ĺ��������������������������Ȩ�޴��ڻ���ڸ����Ȩ�ޣ�
 * 2.���캯������ִ�и���Ĺ��캯��
 * 3.��������Ĭ�ϵĿղ���super();Ϊ��ʽ��һ���ǲ�д��
 * ��������ø���ǿղ���������дsuper(x);Ϊ��ʾ
 * 4.�����캯����this();��û��super()��
 * ��Ϊthis();super();����д�ڵ�һ����ֻ��һ����
 */
public class ExtendDemo {
	public static void main(String[] args) {
		Zi z  = new Zi();
	    z.show();
	}

}
class Fu{
	
	int money = 10;//����ĳ�Ա����
	//���๹�캯��
	Fu(int x){
		System.out.println("���Ǹ�������"+money+"��1"+x);
	};
	//���෽��
	void show(int y){
		System.out.println("������"+money+"��2"+y);
	}
	
}
class Zi extends Fu{//���๹�캯��
	Zi()
	{//super();��ʽ
		super(2);//��ʾ����
		System.out.println("��Ҳ��"+money+"�����Ҹ��׵�3");
	}
	//����ķ���
  public  int show()//��д�����ǣ����෽����Ҫ��ͬ�ĺ�����(show)�������������ͣ�int���������Ȩ�޴��ڻ���ڸ����Ȩ�ޣ�
  { 
	  //super.show(2);//���ø��෽�� 
	  System.out.println("����Ҳ��"+money+"�������ӵ�4");
	  return 1;
  }
}







