package 集合框架;

import java.util.Map;
import java.util.TreeMap;

/*
 * 练习1，
 * 学生对象（姓名，年龄）都有自己的归属地
 * 将学生对象和归属地存在Map中
 */
public class MapTest {
	public static void main(String[] args) {
//		Map<Student,String> map = new HashMap<Student, String>();//创建容器
//		map.put(new Student("肖", 20), "江西");//添加元素
//		map.put(new Student("芳", 21), "赣州");
//		map.put(new Student("波", 22), "信丰");
//		map.put(new Student("波", 22), "信丰");
		//打印
//		Set<Student> set = map.keySet();//放入集合Set
//		for(Student s :set){	//遍历集合
//			String str = map.get(s);
//			System.out.println(s+":"+str);//打印
//		}
		
		Map<Student,String> map1 = new TreeMap<Student, String>();//创建容器如要比较其他的可New一个compator
		map1.put(new Student("肖", 20), "江西");//添加元素
		map1.put(new Student("芳", 21), "赣州");
		map1.put(new Student("波", 22), "信丰");
		map1.put(new Student("波", 22), "信丰");
		
		for(Map.Entry<Student, String> stu: map1.entrySet() ){
			Student key = stu.getKey();
			String value = stu.getValue();
			System.out.println(key+"::"+value);
		}
	}

}
