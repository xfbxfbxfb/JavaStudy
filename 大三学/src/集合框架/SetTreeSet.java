package 集合框架;
/*
 * TreeSet中内部方法add最终实现
 * 将元素转成camparable类型(具备排序)
 * 这类型专门有个camparato类型方法
 * 使用此方法来实现学生排序
 */
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTreeSet {
	public static void main(String[] args) {
		Set set = new TreeSet();
//		
//		set.add("a");
//		set.add("cf");
//		set.add("bb");
//		set.add("sdt");
		//重写Compareto
		set.add(new Student("sfsd", 1));
		set.add(new Student("asa", 5));
		set.add(new Student("gsd", 2));
		set.add(new Student("gnd", 3));
		set.add(new Student("gnd", 1));
		
		for (Iterator it = set.iterator(); it.hasNext();) {
			System.out.println(it.next());
			
		}
	}
}
