package cn.api.system;

import java.util.Calendar;


public class ���� {
	public static void main(String[] args) {
		// �õ�һ������
		Calendar c = Calendar.getInstance();
		//��������
		c.set(2018, 2, 1);
		//����ƫ����
		c.add(Calendar.DATE, -1);
		// ���ʱ������
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1 ;
		int day = c.get(Calendar.DAY_OF_MONTH);
		String week = getweek(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(year + "��" + month + "��" + day + "��" + week);

	}

	private static String getweek(int i) {
		if (i < 0 || i > 7) {
			throw new RuntimeException("û���������");
		}
		String weeks[] = { "", "������", "����һ", "���ڶ�", "������", "������", "������", "������" };
		return weeks[i];
	}

}
