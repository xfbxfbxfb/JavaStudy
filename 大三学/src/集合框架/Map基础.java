package 集合框架;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Map中储存的是一个关键字和一个值是成对的，不同于List和Set是单个的
 * 
 */
public class Map基础 {

	public static void main(String[] args) {
		Map<String, String> m = new HashMap<String, String>();

		// 元素传入
		m.put("星期一", "Monday");
		System.out.println(m.put("星期日", "Sunday"));//
		System.out.println(m.put("星期日", "Sunday"));// 如果键相同，则值覆盖，put方法返回旧值，如果没有旧值返回null
		// m.put("星期日", "Sunday");
		// 获取关键字
		String s = m.get("星期日");
		System.out.println(m);
		// 打印关键字对应的值
		System.out.println("s+" + s);
		// 删除元素
		m.remove("星期日");
		System.out.println(m);
		/*
		 * Map取出元素的方法 1,keySet Map没有迭代器需要将Map集合转化成单列Set集合，再用迭代器来取出
		 * Map集合也不能用Foreach直接遍历
		 */
		System.out.println("--------Map取元素----");
		m.put("1", "肖");
		m.put("2", "芳");
		m.put("3", "波");
		/*，方法keyset()获取的是Map集合的关键字
		 * 
		 */
		// 将Map元素放入单列集合Set，方法keyset()
		Set<String> keyset = m.keySet();
		// 遍历集合Set
		for (Iterator<String> it = keyset.iterator(); it.hasNext();) {
			String key = (String) it.next();// 获取关键字
			String value = m.get(key);// 获取值
			System.out.println(key + "::" + value);
			 //foreach集合遍历
//			 for (String mm: m.keySet()) {
//			 String key1 = (String) it.next();//获取关键字
//			 String value1 = m.get(key1);//获取值
//			 System.out.println(key1+"::"+value1);
//			 }
			System.out.println("---Map.Entry--");
			/*
			 * Map.Entry方法获取的是一组对象
			 */
			Set<Map.Entry<String, String>> entry = m.entrySet();//将Map集合放在单列Set集合中操作
			Iterator<Map.Entry<String, String>> i = entry.iterator();//获取迭代器
			System.out.println("---Map.entry遍历---");
			while(i.hasNext()){
				Entry<String, String> my =i.next();//获取关系对象
				String key3 = my.getKey();
				String value3 = my.getValue();
				System.out.println(key3+"：："+value3);
			}
			
			
			for(Map.Entry<String, String> me :m.entrySet()){
				//获取关键字
				String key2 = me.getKey();
				//获取值
				String value2 = me.getValue();
				System.out.println(key2+":"+value2);
			}
			System.out.println("----获取Map中的所有的值--");
			//获取所有的值用Collection不用Set是因为值可重复
			Collection<String> c = m.values();
			System.out.println(c);
			
		}

	}

}
