package ���Ͽ��;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/*
 * ���ͼ��ܹ�ָ�������ض����ͼ��ڱ�дʱ����ȷ���������ⷢ����ȫ�������������ʱ���벻ͨ��
 * <?>�����������
 */
public class ����list {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();//<�������>��ָ����Ԫ������
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
//<?>��ʾΪͨ�������ʹ�÷������ӿ�ʱ���ݵľ������Ͳ�ȷ��ʱ������<?>
	private static void printCode(Collection<?> list1) {//Collection����Ϊ������Set��List
		for (Iterator<?> it = list1.iterator(); it.hasNext();) {
			System.out.println(it.next());
			
		}
	}

	
}
