package 基础;
/*基本数据类型包装类：java将基本数据类型值包装成对象
 * byte  	Byte	
 * short 	Short
 * int     	Integer
 * loog		Loog
 * float	Float
 * double 	Double
 * boolean 	Boolean
 * char		Character
 * 基本数据类型特点
 * 1，用在基本数据和字符串之间进行转换
 * 
 */
/**
 * Integer举列
 * @author bo
 *
 */
public class String中的进制转换 {
	public static void main(String[] args) {
		System.out.println("十进制转十六进制,11  "+Integer.toHexString(11));//十进制转十六进制
		System.out.println("十进制转二进制,8   "+Integer.toBinaryString(8));
		System.out.println("十进制转八进制10   "+Integer.toOctalString(10));
		
		//其他进制转十进制,字符串转为整形
		System.out.println(Integer.parseInt("a", 16));//后面16为基数作为进制
		System.out.println(Integer.parseInt("1000",2));
		
		System.out.println(2+3);
		System.out.println(Integer.parseInt("2",10)+Integer.parseInt("3",10));
		System.out.println(Integer.parseInt("2")+3 );
		System.out.println("5"+2);
	}
}
