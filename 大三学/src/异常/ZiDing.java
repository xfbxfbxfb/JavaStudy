package �쳣;

public class ZiDing {
	public static void main(String[] args) {
		Persio p = new Persio("d");
		
	}
	
}


//�Զ����쳣
/*
* ���캯�������׳����NoAgeException�Ǽ̳�Exception�ػ��Ǽ̳� RuntimeException�أ�
* 1���̳�Exception,����Ҫ��throws������������߽��в���һ�����⴦���˳������ִ�С�
* 2������RuntimeException,����Ҫthrows�����ģ�û�в��� ���룬һ��NoAgeException ������������ֹ������jvm����Ϣ��ʾ����Ļ
* �ϣ��õ����߿������⣬�������롣
*/
class NoMingException extends RuntimeException{
	NoMingException(){
		super();
	}
	
	NoMingException(String n){
		super(n);
	}
}
class Persio{
	String name ;
	Persio(String name){
		
		if(name!=null) {
			throw new  NoMingException( name+"�������쳣��");
		
		}
	}
	
	
}


