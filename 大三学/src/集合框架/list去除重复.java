package 集合框架;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 去除重复思路：
 * 1，创建一个临时储存器用于储存元素的唯一性
 * 2，遍历原容器，将遍历到的元素到临时容器中判断是否存在
 * 3，不存在储存在临时容器中
 * 4，遍历结束后临时容器储存元素唯一性
 * 5，将原容器清空，将临时容器的元素放入 原容器中
 */
public class list去除重复 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("aa1");
		list.add("aa2");
		list.add("aa1");
		list.add("aa3");
		list.add("aa3");
		list.add("aa4");
//		 list.add(new Student("s",11));
//		 list.add(new Student("s",11));
//		 list.add(new Student("s23",15));
//		 list.add(new Student("s23",16));
		System.out.println(list);
		singelement(list);
		System.out.println(list);

	}

	public static void singelement(List list) {
		// 1，创建一个临时储存器用于储存元素的唯一性
		List temp = new ArrayList();
		// 2，遍历原容器，将遍历到的元素到临时容器中判断是否存在
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Object object = iterator.next();
			if (!temp.contains(object)) {
				// 3，不存在储存在临时容器中
				temp.add(object);
			}

		}
		list.clear();
		// 5，将原容器清空，将临时容器的元素放入 原容器中
		list.add(temp);
	}
}