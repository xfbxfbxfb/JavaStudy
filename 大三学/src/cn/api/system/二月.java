package cn.api.system;

import java.util.Calendar;


public class 二月 {
	public static void main(String[] args) {
		// 得到一个日历
		Calendar c = Calendar.getInstance();
		//设置日期
		c.set(2018, 2, 1);
		//设置偏移量
		c.add(Calendar.DATE, -1);
		// 获得时间日期
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1 ;
		int day = c.get(Calendar.DAY_OF_MONTH);
		String week = getweek(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(year + "年" + month + "月" + day + "日" + week);

	}

	private static String getweek(int i) {
		if (i < 0 || i > 7) {
			throw new RuntimeException("没有这个星期");
		}
		String weeks[] = { "", "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
		return weeks[i];
	}

}
