package 集合框架;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection基本 {
	public static void main(String[] args) {
		Collection coll = new ArrayList();
		//添加元素
		coll.add("qwerty");
		coll.add("qwerty1");
		coll.add("qwerty2");
		//删除元素
		coll.remove("qwerty1");
		
		//通过Iterator方法，获取容器的迭代器方法
		Iterator it = coll.iterator();
				System.out.println(it.next());
				
				
//		for (Iterator it = coll.iterator(); it.hasNext();) {
//			
//			System.out.println(it.next());
//			
//		}
		
		
		
	}
}
