package 集合框架;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionTool2 {
	public static void main(String[] args) {
		//-----------数组转为集合-------//
		/*用Arrays工具来操作即aslist()方法
		 * 目的是就是为了集合的方法对数组元素进行操作,缺点：不能进行增删改变长度的方法
		 */
//		定义数组 
		String[] arr = {"sad","ser","fdesed"};
		System.out.println(Arrays.toString(arr));
//		创建集合将数组转为集合
		List<String> list  = Arrays.asList(arr);
		System.out.println(list);
//		list.add("asd");//数组的长度是一定的，转为集合长度也是一定的，所以不能进行增删等改变长度的方法。
		
		//----------集合转为数组------//
		/*
		 * 使用Collection中的toArray将集合转为数组
		 * 目的：为了限制集合元素的增删
		 */
		Collection<String> list1 =new ArrayList<String>();
		list1.add("xixi");
		list1.add("haha");
		list1.add("hehe");
		System.out.println("--------集合转数组------");
		String[] str = list1.toArray(new String[list.size()]);
		//一个集合转数组，传递数组长度小于集合的长度时，集合会创建一个和数组一样的长度的集合，list.size()为传递集合的长度
		System.out.println(Arrays.toString(str));
		
	}
}
