package cn.api.xfb.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetDate {
	public static void main(String[] args) throws ParseException {
		long time = System.currentTimeMillis();// 返回以毫秒为单位的当前时间。
		System.out.println(time);
		/*
		 *  文本字符串转为日期
		 */
		Date date = new Date();
		System.out.println(date);
		// 格式化风格包括 FULL、LONG、MEDIUM 和 SHORT
		DateFormat dateformat = DateFormat.getDateInstance(DateFormat.FULL);// 日期格式
		dateformat = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);// 时间格式
		String l = dateformat.format(time);
		System.out.println(l);
		/*
		 * 日期转为文本字符串
		 */
//		String it = "2018-4-4";
//		//不同的日期风格对应不同的格式器
//		DateFormat dateFormat2 =  DateFormat.getDateInstance(DateFormat.MEDIUM);
		String it = "2018/4/4 20:59:21";
		//当日期风格不存在时可以使用子类SimpleDateFormat
		DateFormat dateFormat2 =  new SimpleDateFormat("yy/MM/dd HH:mm:ss");
		Date i = dateFormat2.parse(it);
		System.out.println(i);
	}
}
