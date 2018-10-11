package 基础练习;

import java.util.Arrays;

/*
 * 将字符串String[] strs = {"aaffds","bdwd","csd","ddfae"}
 * 按照Ascll表进行排列 
 * 以下是将字符串进行首地址进行排列
 */
public class 字符串排列 {
	public static void main(String[] args) {
		String[] strs = {"daffds","cdwd","bsd","adfae"};
		//打印排序之前的字符串
		printArray(strs);
		//排序
		sortArray(strs);
		//打印排完的字符串
		printArray(strs);
		
	}

	private static void printArray(String[] strs) {
		for (int i = 0; i < strs.length; i++) {
			System.out.print(strs[i]+" ");
		}
		System.out.println();
	}

	public static void sortArray(String[] strs) {
		/*for (int i = 0; i < strs.length-1; i++) {
			for (int j = i+1; j < strs.length; j++) {
				if(strs[i].compareTo(strs[j])>0)
					swap(strs,i,j);
			}
		}*/
		
		Arrays.sort(strs);//别人已经编好的程序，直接可以使用的方法
	}

/*	private static void swap(String[] strs, int i, int j) {
		String temp=strs[i];
		strs[i]=strs[j];
		strs[j]=temp;	
	}*/
}
