package ���Ͽ��;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Map�д������һ���ؼ��ֺ�һ��ֵ�ǳɶԵģ���ͬ��List��Set�ǵ�����
 * 
 */
public class Map���� {

	public static void main(String[] args) {
		Map<String, String> m = new HashMap<String, String>();

		// Ԫ�ش���
		m.put("����һ", "Monday");
		System.out.println(m.put("������", "Sunday"));//
		System.out.println(m.put("������", "Sunday"));// �������ͬ����ֵ���ǣ�put�������ؾ�ֵ�����û�о�ֵ����null
		// m.put("������", "Sunday");
		// ��ȡ�ؼ���
		String s = m.get("������");
		System.out.println(m);
		// ��ӡ�ؼ��ֶ�Ӧ��ֵ
		System.out.println("s+" + s);
		// ɾ��Ԫ��
		m.remove("������");
		System.out.println(m);
		/*
		 * Mapȡ��Ԫ�صķ��� 1,keySet Mapû�е�������Ҫ��Map����ת���ɵ���Set���ϣ����õ�������ȡ��
		 * Map����Ҳ������Foreachֱ�ӱ���
		 */
		System.out.println("--------MapȡԪ��----");
		m.put("1", "Ф");
		m.put("2", "��");
		m.put("3", "��");
		/*������keyset()��ȡ����Map���ϵĹؼ���
		 * 
		 */
		// ��MapԪ�ط��뵥�м���Set������keyset()
		Set<String> keyset = m.keySet();
		// ��������Set
		for (Iterator<String> it = keyset.iterator(); it.hasNext();) {
			String key = (String) it.next();// ��ȡ�ؼ���
			String value = m.get(key);// ��ȡֵ
			System.out.println(key + "::" + value);
			 //foreach���ϱ���
//			 for (String mm: m.keySet()) {
//			 String key1 = (String) it.next();//��ȡ�ؼ���
//			 String value1 = m.get(key1);//��ȡֵ
//			 System.out.println(key1+"::"+value1);
//			 }
			System.out.println("---Map.Entry--");
			/*
			 * Map.Entry������ȡ����һ�����
			 */
			Set<Map.Entry<String, String>> entry = m.entrySet();//��Map���Ϸ��ڵ���Set�����в���
			Iterator<Map.Entry<String, String>> i = entry.iterator();//��ȡ������
			System.out.println("---Map.entry����---");
			while(i.hasNext()){
				Entry<String, String> my =i.next();//��ȡ��ϵ����
				String key3 = my.getKey();
				String value3 = my.getValue();
				System.out.println(key3+"����"+value3);
			}
			
			
			for(Map.Entry<String, String> me :m.entrySet()){
				//��ȡ�ؼ���
				String key2 = me.getKey();
				//��ȡֵ
				String value2 = me.getValue();
				System.out.println(key2+":"+value2);
			}
			System.out.println("----��ȡMap�е����е�ֵ--");
			//��ȡ���е�ֵ��Collection����Set����Ϊֵ���ظ�
			Collection<String> c = m.values();
			System.out.println(c);
			
		}

	}

}
