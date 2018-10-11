package cn.xfb.api.date;
/*
 * 练习
 * 要求：将时间为“2018-3-4”到时间“2018年4月5日”之间的有多少天？
 * 思考：
 * 因为时间的格式不一样所以需要两种格式将字符串文本转化为时间毫秒值
 */

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class 求天数 {
	public static void main(String[] args) throws ParseException {
		//时间
		String date1 = "1995-11-25";
		String date2 = "2018年4月5日";
		//确认格式
		//DateFormat dateFormat1 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		//DateFormat dateFormat2 = DateFormat.getDateInstance(DateFormat.LONG);
		//以后用这种
		DateFormat dateFormat1 = new SimpleDateFormat("yy-MM-dd");
		DateFormat dateFormat2 = new SimpleDateFormat("yy年MM月dd日");
		//解析
		Date time1 = dateFormat1.parse(date1); 
		Date time2 = dateFormat2.parse(date2); 
		//返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
		//毫秒值
		long haomiao = time1.getTime();
		long haomiao1 = time2.getTime();
		//相差的毫秒值
		long all = Math.abs(haomiao1-haomiao);
		//相差的天数
		int day = (int) (all/1000/60/60/24);
		System.out.println(day);
		
	}
}
