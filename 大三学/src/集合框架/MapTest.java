package ���Ͽ��;

import java.util.Map;
import java.util.TreeMap;

/*
 * ��ϰ1��
 * ѧ���������������䣩�����Լ��Ĺ�����
 * ��ѧ������͹����ش���Map��
 */
public class MapTest {
	public static void main(String[] args) {
//		Map<Student,String> map = new HashMap<Student, String>();//��������
//		map.put(new Student("Ф", 20), "����");//���Ԫ��
//		map.put(new Student("��", 21), "����");
//		map.put(new Student("��", 22), "�ŷ�");
//		map.put(new Student("��", 22), "�ŷ�");
		//��ӡ
//		Set<Student> set = map.keySet();//���뼯��Set
//		for(Student s :set){	//��������
//			String str = map.get(s);
//			System.out.println(s+":"+str);//��ӡ
//		}
		
		Map<Student,String> map1 = new TreeMap<Student, String>();//����������Ҫ�Ƚ������Ŀ�Newһ��compator
		map1.put(new Student("Ф", 20), "����");//���Ԫ��
		map1.put(new Student("��", 21), "����");
		map1.put(new Student("��", 22), "�ŷ�");
		map1.put(new Student("��", 22), "�ŷ�");
		
		for(Map.Entry<Student, String> stu: map1.entrySet() ){
			Student key = stu.getKey();
			String value = stu.getValue();
			System.out.println(key+"::"+value);
		}
	}

}
