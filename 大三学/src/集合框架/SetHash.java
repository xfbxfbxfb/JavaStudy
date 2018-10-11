package 集合框架;
/*
 * Set 不包含重复元素集合，不保证顺序方法和Collection一致,Set集合取元素的方式只有一种就是：迭代器
 * 储存元素时，先调用元素对象的HashCode();而每个学生都是新建立的对象，所以哈希值不通所以不需要判断equals();
 * 若要唯一性，重写HashCode()
 * 优点：查询速度快
 * 缺点：只能存储元素唯一性
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetHash {
	public static void main(String[] args) {
		Set set = new HashSet();
	//不重复不排序
//		set.add("1");
//		set.add("4");
//		set.add("2");
//		set.add("3");
//		set.add("3");
		set.add(new Student("sfsd", 1));
		set.add(new Student("asa", 5));
		set.add(new Student("gsd", 1));
		set.add(new Student("gsd", 1));
		
		for (Iterator it = set.iterator(); it.hasNext();) {
			System.out.println(it.next());
			
		}
		
	}
}
