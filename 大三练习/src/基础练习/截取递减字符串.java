package 基础练习;
//打印截取逐渐减少的字符串
public class 截取递减字符串 {
	public static void main(String[] args) {
		String strs = "goodmorning";
	 
	System.out.println( PrintString(strs));
	}

	private static String PrintString(String strs) {
		//三角型原理
		for (int i = 0; i < strs.length(); i++) {
			for (int star = 0, end =strs.length()-i;end <=strs.length(); star++,end++) {
				System.out.println(strs.substring(star,end)); 
			}
			
		}
		
		return null;
	}
}
