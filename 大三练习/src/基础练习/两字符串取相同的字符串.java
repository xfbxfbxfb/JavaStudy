package 基础练习;
//作业1，将两个字符串取其中最长的相同字符串

//思路：1，确定两个字符串的大小长度，若短串在长串中有，则输出短串，
//若不存在则用字符串递减的方法进行筛选找出最长的相同字符串

public class 两字符串取相同的字符串 {
	public static void main(String[] args) {
		String s1 = "jkhdfakjgoodklasd";
		String s2 = "aiwergoodjr";

		System.out.println(printZfc(s1, s2));
	}

	public static String printZfc(String s1, String s2) {
		// 判断字符串的长度、
		String max = (s1.length() >= s2.length()) ? s1 : s2;//当s1字符串的长度大于s2字符串的长度则取s1，否则取s2
		String min = max.equals(s1) ? s2 : s1;//若最大的值与s1相等则最小值取s2。
		for (int i = 0; i < min.length(); i++) {
			for (int start = 0, end = min.length() - i; end <= min.length(); start++, end++) {
				String temp = min.substring(start, end);//取字符串
				if (max.contains(temp)) {//若字符串在最大字符串中有temp
					return temp;//返回
				}
			}
		}
		return null;
	}
}
