package ���Ͽ��;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * ȥ���ظ�˼·��
 * 1������һ����ʱ���������ڴ���Ԫ�ص�Ψһ��
 * 2������ԭ����������������Ԫ�ص���ʱ�������ж��Ƿ����
 * 3�������ڴ�������ʱ������
 * 4��������������ʱ��������Ԫ��Ψһ��
 * 5����ԭ������գ�����ʱ������Ԫ�ط��� ԭ������
 */
public class listȥ���ظ� {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("aa1");
		list.add("aa2");
		list.add("aa1");
		list.add("aa3");
		list.add("aa3");
		list.add("aa4");
//		 list.add(new Student("s",11));
//		 list.add(new Student("s",11));
//		 list.add(new Student("s23",15));
//		 list.add(new Student("s23",16));
		System.out.println(list);
		singelement(list);
		System.out.println(list);

	}

	public static void singelement(List list) {
		// 1������һ����ʱ���������ڴ���Ԫ�ص�Ψһ��
		List temp = new ArrayList();
		// 2������ԭ����������������Ԫ�ص���ʱ�������ж��Ƿ����
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Object object = iterator.next();
			if (!temp.contains(object)) {
				// 3�������ڴ�������ʱ������
				temp.add(object);
			}

		}
		list.clear();
		// 5����ԭ������գ�����ʱ������Ԫ�ط��� ԭ������
		list.add(temp);
	}
}