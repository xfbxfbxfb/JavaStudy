package ���Ͽ��;
/*
 * 	LinkedList�еĶ�ջ���Ƚ����
 */

import java.util.LinkedList;

public class LinkedListTest1 {
	public static void main(String[] args) {
		Duizhang  dz = new Duizhang();
		dz.myGet("1");
		dz.myGet("2");
		dz.myGet("3");
		while(!dz.isnull()){
			System.out.println(dz.myRemove());
		}
	}
}

class Duizhang{
	private LinkedList link;
	//��ʼ��LinkedList����
	public  Duizhang(){
		link = new LinkedList();
	}
	//Ԫ�ص����
	public void myGet(Object o){
		 link.addFirst(o);
	}
	//Ԫ�صĻ�ȡ
	public Object myRemove(){
		return link.removeFirst();
		
	}
	
	//����Ϊ��ʱ
	public boolean isnull(){
		return link.isEmpty();
	}
	
	
	
	
	
}

