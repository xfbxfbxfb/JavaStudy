package 集合框架;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionTools {
      public static void main(String[] args) {
//		Collection<Student> c = new ArrayList<Student>();
//		
//		c.add(new Student("xfb", 12));
//		c.add(new Student("sgsd", 11));
//		c.add(new Student("bb", 13));
		
    	  Collection<String> c = new ArrayList<String>();
    	  c.add("sfsdf");
    	  c.add("sff");
    	  c.add("afsdfsd");
    	  c.add("bbsdfsd");
    	  //求字符串的长度的最大值
		 String str = Collections.max(c,new ComparatorBylength());//new后面的是比较器的方法，根据比较器来比较最大值
		 System.out.println("Str="+str);
		 //自然排序
		 List<String> list = new ArrayList<>();
		 list.add("sisi");
		 list.add("xixi");
		 list.add("java");
		 Collections.sort(list);
		 System.out.println("-----自然排序---");
		 System.out.println(list);
		 System.out.println("-----自然倒序----");
		 Collections.sort(list,Collections.reverseOrder());
		 System.out.println(list);
		 System.out.println("----线程同步---");
		 List<String> list1 = Collections.synchronizedList(new ArrayList<String>());
		 list1.add("sdf");
		 list1.add("sdfs");
		 list1.add("sdfds");
		 System.out.println(list1);
	
		
		
	}
}
class ComparatorBylength implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
	  int temp = o1.length()-o2.length();
		
		return temp==0?o1.compareTo(o2):temp;
	}

	
	
	
	
	
}