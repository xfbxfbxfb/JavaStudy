package 集合框架;
/*
 * 	LinkedList中的堆栈：先进后出
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
	//初始化LinkedList对象
	public  Duizhang(){
		link = new LinkedList();
	}
	//元素的添加
	public void myGet(Object o){
		 link.addFirst(o);
	}
	//元素的获取
	public Object myRemove(){
		return link.removeFirst();
		
	}
	
	//链表为空时
	public boolean isnull(){
		return link.isEmpty();
	}
	
	
	
	
	
}

