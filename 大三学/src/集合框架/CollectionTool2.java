package ���Ͽ��;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionTool2 {
	public static void main(String[] args) {
		//-----------����תΪ����-------//
		/*��Arrays������������aslist()����
		 * Ŀ���Ǿ���Ϊ�˼��ϵķ���������Ԫ�ؽ��в���,ȱ�㣺���ܽ�����ɾ�ı䳤�ȵķ���
		 */
//		�������� 
		String[] arr = {"sad","ser","fdesed"};
		System.out.println(Arrays.toString(arr));
//		�������Ͻ�����תΪ����
		List<String> list  = Arrays.asList(arr);
		System.out.println(list);
//		list.add("asd");//����ĳ�����һ���ģ�תΪ���ϳ���Ҳ��һ���ģ����Բ��ܽ�����ɾ�ȸı䳤�ȵķ�����
		
		//----------����תΪ����------//
		/*
		 * ʹ��Collection�е�toArray������תΪ����
		 * Ŀ�ģ�Ϊ�����Ƽ���Ԫ�ص���ɾ
		 */
		Collection<String> list1 =new ArrayList<String>();
		list1.add("xixi");
		list1.add("haha");
		list1.add("hehe");
		System.out.println("--------����ת����------");
		String[] str = list1.toArray(new String[list.size()]);
		//һ������ת���飬�������鳤��С�ڼ��ϵĳ���ʱ�����ϻᴴ��һ��������һ���ĳ��ȵļ��ϣ�list.size()Ϊ���ݼ��ϵĳ���
		System.out.println(Arrays.toString(str));
		
	}
}
