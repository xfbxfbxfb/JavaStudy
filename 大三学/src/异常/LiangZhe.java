package �쳣;

public class LiangZhe {

	public static void main(String[] args) {
		 Persion p  = new  Persion("Ф", -20);

	}

}
//�Զ����쳣
/*
 * ���캯�������׳����NoAgeException�Ǽ̳�Exception�ػ��Ǽ̳� RuntimeException�أ�
 * 1���̳�Exception,����Ҫ��throws������������߽��в���һ�����⴦���˳������ִ�С�
 * 2������RuntimeException,����Ҫthrows�����ģ�û�в��� ���룬һ��NoAgeException ������������ֹ������jvm����Ϣ��ʾ����Ļ
 * �ϣ��õ����߿������⣬�������롣
 */
class NoAgeException extends RuntimeException{
	NoAgeException(){
		super();
	}
	NoAgeException(String m){
		super(m);//����Զ����쳣��Ҫ�쳣��Ϣ������ͨ��������в����Ĺ��������ɡ�
	}
}




class Persion{
	private String name;
	private int age;
	 Persion(String name, int age)
	{
		if(age<0)
		{
			throw new NoAgeException(age+"��������ֵ�Ƿ�");
		}
	}
	
	}
