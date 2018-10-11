package 集合框架;

import java.util.Map;
import java.util.TreeMap;

/*
 * 练习
 * "wertyuiodfghjertyui",获取字符串中的每个字母出现的次数
 * 要求返回的格式为a(1)b(2)d(2...)
 * 
 * 
 * 
 */
public class Map练习 {
	public static void main(String[] args) {

		/*
		 * 思路： 1，获取每个字母 2，通过查表，如果查到存在的字母，将这个次数1+重新存回表中，如果没有查到则返回1存入表中 3，按照格式打印出来
		 */
		// * 1，获取每个字母
		String str = "wertyuiodfghjertyui";
		str = getCharcount(str);
		System.out.println(str);
		

		// * 3，按照格式打印出来

	}

	/**
	 * 将字符串中的字母进行查表和计数
	 * 
	 * @param str
	 * @return 返回字母及次数
	 */
	public static String getCharcount(String str) {
		char[] cha = str.toCharArray();
		// 创建表
		TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
		// 遍历
		for (int i = 0; i < cha.length; i++) {
			// 将遍历的字母去查询表map
			Integer value = map.get(cha[i]);
			// * 2，通过查表，如果查到存在的字母，将这个次数1+重新存回表中，如果没有查到则返回1存入表中
			if (value == null) {
				map.put(cha[i], 1);
			} else {
				value++;
				map.put(cha[i], value);
			}
		}
		//单线程 储存
		StringBuilder strr = new StringBuilder();
		for (char c : map.keySet()) {
			strr.append(c+"("+map.get(c)+")");
			
		}
		return strr.toString();
	}

	
}
