package ���Ͽ��;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection���� {
	public static void main(String[] args) {
		Collection coll = new ArrayList();
		//���Ԫ��
		coll.add("qwerty");
		coll.add("qwerty1");
		coll.add("qwerty2");
		//ɾ��Ԫ��
		coll.remove("qwerty1");
		
		//ͨ��Iterator��������ȡ�����ĵ���������
		Iterator it = coll.iterator();
				System.out.println(it.next());
				
				
//		for (Iterator it = coll.iterator(); it.hasNext();) {
//			
//			System.out.println(it.next());
//			
//		}
		
		
		
	}
}
