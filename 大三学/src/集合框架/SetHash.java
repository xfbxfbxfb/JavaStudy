package ���Ͽ��;
/*
 * Set �������ظ�Ԫ�ؼ��ϣ�����֤˳�򷽷���Collectionһ��,Set����ȡԪ�صķ�ʽֻ��һ�־��ǣ�������
 * ����Ԫ��ʱ���ȵ���Ԫ�ض����HashCode();��ÿ��ѧ�������½����Ķ������Թ�ϣֵ��ͨ���Բ���Ҫ�ж�equals();
 * ��ҪΨһ�ԣ���дHashCode()
 * �ŵ㣺��ѯ�ٶȿ�
 * ȱ�㣺ֻ�ܴ洢Ԫ��Ψһ��
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetHash {
	public static void main(String[] args) {
		Set set = new HashSet();
	//���ظ�������
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
