package 集合框架;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 泛型限定
 * 内容：
 * 求最大值
 */
public class Max {
	public static void main(String[] args) {
		Collection<Student> c = new ArrayList<Student>();
		c.add(new Student("hj", 10));
		c.add(new Student("bbb", 12));
		c.add(new Student("aaa", 11));
		Student stu = getMax(c);
		System.out.println(stu);
		
		Collection<String> c1 = new ArrayList<String>();
		c1.add("aas");
		c1.add("java");
		c1.add("nba");
		c1.add("z");
		String str = getMax(c1);
		System.out.println("c1=="+str);
		

	}
	/*
	 * 最后升级
	 * 在无法确定传入来的元素类型，我们可以对类型定义，此类型必须具备Comparable的子类，自然排序
	 */
	//<T extends Comparable<T>>限定类型T继承Comparable.<T extends Comparable<? super T>>也可以用T的父类来接收
	public static <T extends Comparable<? super T>> T getMax(Collection<? extends T> c) {//	没打<>的T是定义泛型
	//Collection<T>	传进来的集合Collection<? extends T>也可以用T的子类
		Iterator<? extends T>  it = c.iterator();
		T Max = it.next();
		
		while(it.hasNext()){
			T temp = it.next();
			if(temp.compareTo(Max)>0){
				Max=temp;
			}
		}
		
		return Max;
	}
	
	
	
	/*
	 * 对方法进行升级：对未知的类型的进行
	 * 使得有Comparator方法的类能够使用此方法
	 * 不加泛型时，无法明确传入来的元素类型，这时为了便于操作用Object
	 */
//	public static Object getMax(Collection c) {
//		Iterator it = c.iterator();
//		Object Max =  it.next();
//		while(it.hasNext()){
//			Object o =  it.next();
//			Comparable temp = (Comparable) o;//拿到的元素转为Comarable
//			if(temp.compareTo(Max)>0){
//				Max = temp;
//			}
//			
//			
//		}
//		return Max;
//	}
	
	
///*
// * 对泛型的不确定，无法确定集合元素的类型
// */
//	public static Student getMax(Collection c) {
//		Iterator it = c.iterator();
//		Student Max = (Student) it.next();
//		while(it.hasNext()){
//			Student temp = (Student) it.next();
//			if(temp.compareTo(Max)>0){
//				Max = temp;
//			}
//			
//		}
//		return Max;
//	}
	
}









