package ���Ͽ��;

import java.util.Comparator;

public class TreeSetByLengh implements Comparator{
	public static void main(String[] args) {
		
	}

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = (String)o1;
		String s2 = (String)o2;
		//�Ƚ��ַ�������
		int temp = s1.length()-s2.length();
		return temp==0?s1.compareTo(s2):temp;//�������ʱ�ٱȽ������Ƿ����
	}
}
