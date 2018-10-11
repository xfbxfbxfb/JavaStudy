package 基础练习;

import java.util.Arrays;

//目的：将字符串数组进行排序
/*
 * 思路：
 * 1.首先将字符串数组进行转换成字符数组
 * 2.将字符数组进行排序
 * 3.将字符数组进行转换成字符串数组打印出来
 */
public class 字符串排序2 {
	public static void main(String[] args) {
		String str = "fedcba";
		// 将字符串数组进行转换成字符数组
		char a[] = getArray(str);
		// 将字符数组进行排序
		Arrays.sort(a);
		// 将字符数组进行转换字符串数组再打印
		String b = printArray(a);
		System.out.println(b);
	}

	private static String printArray(char[] a) {
		return new String(a);
	}

	private static char[] getArray(String str) {
		char a[] = str.toCharArray();
		return a;
	}

}
