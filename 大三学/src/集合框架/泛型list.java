package 集合框架;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/*
 * 泛型即能够指定传入特定类型即在编写时可以确定类型以免发生安全隐患：传入错误时编译不通过
 * <?>编译完后会擦除
 */
public class 泛型list {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();//<传入参数>即指定的元素类型
		list.add("sdasad");
		list.add("sada");
		list.add("sadas");
		
		printCode(list);
		
		Set<String> list1 = new HashSet<String>();
		list1.add("sadfsad");
		list1.add("sasad");
		list1.add("sadfd");
		
		printCode(list1);
	}
//<?>表示为通配符即当使用泛型类或接口时传递的具体类型不确定时可以用<?>
	private static void printCode(Collection<?> list1) {//Collection提升为能容纳Set和List
		for (Iterator<?> it = list1.iterator(); it.hasNext();) {
			System.out.println(it.next());
			
		}
	}

	
}
