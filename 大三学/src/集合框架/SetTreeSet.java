package ���Ͽ��;
/*
 * TreeSet���ڲ�����add����ʵ��
 * ��Ԫ��ת��camparable����(�߱�����)
 * ������ר���и�camparato���ͷ���
 * ʹ�ô˷�����ʵ��ѧ������
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
		//��дCompareto
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
