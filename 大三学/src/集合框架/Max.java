package ���Ͽ��;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * �����޶�
 * ���ݣ�
 * �����ֵ
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
	 * �������
	 * ���޷�ȷ����������Ԫ�����ͣ����ǿ��Զ����Ͷ��壬�����ͱ���߱�Comparable�����࣬��Ȼ����
	 */
	//<T extends Comparable<T>>�޶�����T�̳�Comparable.<T extends Comparable<? super T>>Ҳ������T�ĸ���������
	public static <T extends Comparable<? super T>> T getMax(Collection<? extends T> c) {//	û��<>��T�Ƕ��巺��
	//Collection<T>	�������ļ���Collection<? extends T>Ҳ������T������
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
	 * �Է���������������δ֪�����͵Ľ���
	 * ʹ����Comparator���������ܹ�ʹ�ô˷���
	 * ���ӷ���ʱ���޷���ȷ��������Ԫ�����ͣ���ʱΪ�˱��ڲ�����Object
	 */
//	public static Object getMax(Collection c) {
//		Iterator it = c.iterator();
//		Object Max =  it.next();
//		while(it.hasNext()){
//			Object o =  it.next();
//			Comparable temp = (Comparable) o;//�õ���Ԫ��תΪComarable
//			if(temp.compareTo(Max)>0){
//				Max = temp;
//			}
//			
//			
//		}
//		return Max;
//	}
	
	
///*
// * �Է��͵Ĳ�ȷ�����޷�ȷ������Ԫ�ص�����
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









