package ���Ͽ��;

import java.util.Map;
import java.util.TreeMap;

/*
 * ��ϰ
 * "wertyuiodfghjertyui",��ȡ�ַ����е�ÿ����ĸ���ֵĴ���
 * Ҫ�󷵻صĸ�ʽΪa(1)b(2)d(2...)
 * 
 * 
 * 
 */
public class Map��ϰ {
	public static void main(String[] args) {

		/*
		 * ˼·�� 1����ȡÿ����ĸ 2��ͨ���������鵽���ڵ���ĸ�����������1+���´�ر��У����û�в鵽�򷵻�1������� 3�����ո�ʽ��ӡ����
		 */
		// * 1����ȡÿ����ĸ
		String str = "wertyuiodfghjertyui";
		str = getCharcount(str);
		System.out.println(str);
		

		// * 3�����ո�ʽ��ӡ����

	}

	/**
	 * ���ַ����е���ĸ���в��ͼ���
	 * 
	 * @param str
	 * @return ������ĸ������
	 */
	public static String getCharcount(String str) {
		char[] cha = str.toCharArray();
		// ������
		TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
		// ����
		for (int i = 0; i < cha.length; i++) {
			// ����������ĸȥ��ѯ��map
			Integer value = map.get(cha[i]);
			// * 2��ͨ���������鵽���ڵ���ĸ�����������1+���´�ر��У����û�в鵽�򷵻�1�������
			if (value == null) {
				map.put(cha[i], 1);
			} else {
				value++;
				map.put(cha[i], value);
			}
		}
		//���߳� ����
		StringBuilder strr = new StringBuilder();
		for (char c : map.keySet()) {
			strr.append(c+"("+map.get(c)+")");
			
		}
		return strr.toString();
	}

	
}
