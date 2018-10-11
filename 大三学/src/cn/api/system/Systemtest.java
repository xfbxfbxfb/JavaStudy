package cn.api.system;

import java.util.Set;

public class Systemtest {
		public static void main(String[] args) {
			//获取系统属性
			Set<String> keyset =System.getProperties().stringPropertyNames();
			for (String key : keyset) {
				String s = System.getProperty(key);
				System.out.println(key+"::"+s);
			}
			
		}
}
