package ������ϰ;

import java.util.Arrays;

/*
 * ���ַ���String[] strs = {"aaffds","bdwd","csd","ddfae"}
 * ����Ascll��������� 
 * �����ǽ��ַ��������׵�ַ��������
 */
public class �ַ������� {
	public static void main(String[] args) {
		String[] strs = {"daffds","cdwd","bsd","adfae"};
		//��ӡ����֮ǰ���ַ���
		printArray(strs);
		//����
		sortArray(strs);
		//��ӡ������ַ���
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
		
		Arrays.sort(strs);//�����Ѿ���õĳ���ֱ�ӿ���ʹ�õķ���
	}

/*	private static void swap(String[] strs, int i, int j) {
		String temp=strs[i];
		strs[i]=strs[j];
		strs[j]=temp;	
	}*/
}
