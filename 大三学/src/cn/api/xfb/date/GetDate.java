package cn.api.xfb.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetDate {
	public static void main(String[] args) throws ParseException {
		long time = System.currentTimeMillis();// �����Ժ���Ϊ��λ�ĵ�ǰʱ�䡣
		System.out.println(time);
		/*
		 *  �ı��ַ���תΪ����
		 */
		Date date = new Date();
		System.out.println(date);
		// ��ʽ�������� FULL��LONG��MEDIUM �� SHORT
		DateFormat dateformat = DateFormat.getDateInstance(DateFormat.FULL);// ���ڸ�ʽ
		dateformat = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);// ʱ���ʽ
		String l = dateformat.format(time);
		System.out.println(l);
		/*
		 * ����תΪ�ı��ַ���
		 */
//		String it = "2018-4-4";
//		//��ͬ�����ڷ���Ӧ��ͬ�ĸ�ʽ��
//		DateFormat dateFormat2 =  DateFormat.getDateInstance(DateFormat.MEDIUM);
		String it = "2018/4/4 20:59:21";
		//�����ڷ�񲻴���ʱ����ʹ������SimpleDateFormat
		DateFormat dateFormat2 =  new SimpleDateFormat("yy/MM/dd HH:mm:ss");
		Date i = dateFormat2.parse(it);
		System.out.println(i);
	}
}
