package �쳣;
/*
 * дһ�����򣬳��˿�ó������Ҫ�����Ϊ��ʱ����������ֹ��������
 */




public class Test1 {
	public static void main(String[] args){
		area a;
		try {
			a = new area(-3,4);
			int mian = a.Res();
			System.out.println("���Ϊ"+mian);
		} catch (NoValaeException e) {
			
		System.out.println(e.toString());
		e.printStackTrace();
		}
		
		
	}

}
class NoValaeException extends Exception{
	
	NoValaeException(){
		super();
	}
	NoValaeException(String msg){
		super(msg);
	}
}
class  area{
	private int lengh;
	private int weith;
	
	public area(int weith,int lengh) throws NoValaeException{
		this.weith= weith;
		this.lengh=lengh;
		if(weith<0||lengh<0){
			throw new NoValaeException("���Ȼ�����ֵ�Ƿ�");
		}
	}
    public int Res(){
		return lengh*weith;
    	
    }
	
}