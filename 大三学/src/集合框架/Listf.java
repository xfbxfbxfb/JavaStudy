package ���Ͽ��;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Listf {
	public static void main(String[] args) {
		List list = new ArrayList();
		Student stu = new Student("sda",12);
		list.add(stu);
		list.add(new Student("Ф",21));
		list.add(new Student("Ф",22));
		list.add("sb");
		
		/*
		 * �ڵ��������У�ʹ���˼��Ϸ�����Ԫ�ؽ��в��������µ���������֪�����ϵı仯���������ݲ��ȶ���
		 * ���������ʱ��Ҫʹ�ü��ϵķ�������������ʹ�õ������ķ���������
		 */
		//Iterator it = list.iterator();
		ListIterator it = list.listIterator();
		while(it.hasNext()){
			Object obj = it.next();
			if("sb".equals(obj))
				//list.add("java");
				//it.add("java");//�����������Ԫ��
				//it.set("sbb");//���������޸�Ԫ��
				it.remove();//��������ɾ��Ԫ��
		}
		System.out.println(list);
		
	}
}