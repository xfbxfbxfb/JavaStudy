package cn.xfb.api.date;
/*
 * ��ϰ
 * Ҫ�󣺽�ʱ��Ϊ��2018-3-4����ʱ�䡰2018��4��5�ա�֮����ж����죿
 * ˼����
 * ��Ϊʱ��ĸ�ʽ��һ��������Ҫ���ָ�ʽ���ַ����ı�ת��Ϊʱ�����ֵ
 */

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ������ {
	public static void main(String[] args) throws ParseException {
		//ʱ��
		String date1 = "1995-11-25";
		String date2 = "2018��4��5��";
		//ȷ�ϸ�ʽ
		//DateFormat dateFormat1 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		//DateFormat dateFormat2 = DateFormat.getDateInstance(DateFormat.LONG);
		//�Ժ�������
		DateFormat dateFormat1 = new SimpleDateFormat("yy-MM-dd");
		DateFormat dateFormat2 = new SimpleDateFormat("yy��MM��dd��");
		//����
		Date time1 = dateFormat1.parse(date1); 
		Date time2 = dateFormat2.parse(date2); 
		//������ 1970 �� 1 �� 1 �� 00:00:00 GMT ������ Date �����ʾ�ĺ�������
		//����ֵ
		long haomiao = time1.getTime();
		long haomiao1 = time2.getTime();
		//���ĺ���ֵ
		long all = Math.abs(haomiao1-haomiao);
		//��������
		int day = (int) (all/1000/60/60/24);
		System.out.println(day);
		
	}
}
