package 异常;
/*
 * 写一个程序，长乘宽得出面积，要求面积为负时，报错且终止程序运行
 */




public class Test1 {
	public static void main(String[] args){
		area a;
		try {
			a = new area(-3,4);
			int mian = a.Res();
			System.out.println("面积为"+mian);
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
			throw new NoValaeException("长度或宽度数值非法");
		}
	}
    public int Res(){
		return lengh*weith;
    	
    }
	
}