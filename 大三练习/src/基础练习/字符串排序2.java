package ������ϰ;

import java.util.Arrays;

//Ŀ�ģ����ַ��������������
/*
 * ˼·��
 * 1.���Ƚ��ַ����������ת�����ַ�����
 * 2.���ַ������������
 * 3.���ַ��������ת�����ַ��������ӡ����
 */
public class �ַ�������2 {
	public static void main(String[] args) {
		String str = "fedcba";
		// ���ַ����������ת�����ַ�����
		char a[] = getArray(str);
		// ���ַ������������
		Arrays.sort(a);
		// ���ַ��������ת���ַ��������ٴ�ӡ
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
