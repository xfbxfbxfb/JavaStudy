package 基础;
/*
 Sting的方法使用
 1.String的长度length()；
 2.查找某字符的位置index;
 3.截取字符串substring;
 4.字符串是否是以指定的字符串开头或结尾；startsWith,	endsWith;
 5.字符串的替换，replase
 6.将字符串改成数组或字节；char [];
 7,将字符串改为大写，或小写；
 */

public class StringTest {
	public static void main(String[] args) {
		String str = "StringDemoJava.net";
// 1.因为返回的值是int类型		
		int len = str.length();
		System.out.println("长度为"+len);
//2.查找某个字符的位置  
		int index = str.indexOf('a');
		System.out.println("第一个a的位置在"+index);
		int index1 = str.indexOf('a', index+1);
		System.out.println("第二个a的位置在"+index1);
//3.截取字符串substring;
		String s = str.substring(6,10);//从第六个到第10-1个的字符串
		System.out.println("截取的字符串是"+s);
// 4.字符串是否是以指定的字符串开头或结尾；startsWith,	endsWith
		boolean b = str.startsWith("Sring");//false
		System.out.println(b);
		boolean b1 = str.endsWith("net");//ture
		System.out.println(b1);
//	 5.字符串的替换，replase	
		String s1 = str.replace("net", "io");
		System.out.println("修改后的字符串"+s1);
//	 6.将字符串改成数组或字节；	
		char [] c = str.toCharArray();

		byte [] bytes = str.getBytes(); 
		
//	 7,将字符串改为大写，或小写；	
		String s2 = str.toUpperCase();
		System.out.println("全改为大写为"+s2);
		String s3 = str.toLowerCase();
		System.out.println("全改为小写为"+s3);
// 8 .将字符串按照指定的方法来分配，"li ming,xiao bo,xiao ming "
		String str1 = "li ming,xiao bo,xiao ming";
		String[] names =str1.split(",");
		for (int i =0;i<names.length;i++)
		{
			System.out.println(names[i]);	
		}
//9.将字符串进行比较
		int result = "ab".compareTo("ad");//字符串"ab"与“ad”比较
		System.out.println(result);//结果0则前一个大
		
		
		
	}

}
