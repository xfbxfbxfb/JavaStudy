package 集合框架;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Listf {
	public static void main(String[] args) {
		List list = new ArrayList();
		Student stu = new Student("sda",12);
		list.add(stu);
		list.add(new Student("肖",21));
		list.add(new Student("肖",22));
		list.add("sb");
		
		/*
		 * 在迭代过程中，使用了集合方法对元素进行操作，导致迭代器并不知道集合的变化，引发数据不稳定。
		 * 解决：迭代时不要使用集合的方法，但还可以使用跌代器的方法操作。
		 */
		//Iterator it = list.iterator();
		ListIterator it = list.listIterator();
		while(it.hasNext()){
			Object obj = it.next();
			if("sb".equals(obj))
				//list.add("java");
				//it.add("java");//迭代器的添加元素
				//it.set("sbb");//迭代器的修改元素
				it.remove();//迭代器的删除元素
		}
		System.out.println(list);
		
	}
}