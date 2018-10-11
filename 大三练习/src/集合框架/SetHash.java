package 集合框架;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetHash {
		public static void main(String[] args) {
			Set set = new LinkedHashSet();//哈希此方法可以让输入与输出的顺序一样
			set.add("aav");
			set.add("dava5");
			set.add("caa3");
			set.add("eaa8");
			for (Iterator it = set.iterator(); it.hasNext();) {
				System.out.println(it.next());
				
			}
		}
}
