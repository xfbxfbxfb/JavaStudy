package StringMy;

public class 两种 {
	public static void main(String[] args) {
		String s1 = "asdd";
		String s2 = "asdd";
		System.out.println(s1==s2);
		System.out.println("--------");
		String s3 = "asdd";
		String s4 = new String("asdd");
		//s3创建了一个对象  "asdd"为一个对想
		//s4创建了两个对象   new了一个对象String对象，将“asdd”作为对象传了进来
		
		System.out.println(s3==s4);//false 地址不一样
		//因为String复写了equals.
		//建立字符串自己的判断相同的依据，通过字符串对象中的内容来判断
		System.out.println(s3.equals(s3));
	}

}
