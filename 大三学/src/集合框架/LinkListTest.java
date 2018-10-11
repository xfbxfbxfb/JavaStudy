package 集合框架;
/*
 * LinkedList中的队列：先进先出
 */
import java.util.LinkedList;

public class LinkListTest {
		public static void main(String[] args) {
				Quent q = new Quent();
				q.myAdd("1");
				q.myAdd("2");
				q.myAdd("3");
				
				while(!q.isNull()){
					System.out.println(q.myRemove());
				}
				
 		}
}

/**
 * LinkedList中的队列即先进先出
 * @author bo
 *
 */
class Quent{
	//对LinkedList进行封装
	private LinkedList link ;
	//对链表对象初始化
	public Quent( ) {
		link = new LinkedList();
	}

	/**
	 * 元素的获取
	 */
	public void myAdd(Object o){
		link.addFirst(o);
	}
	
	public  Object myRemove(){
		return link.removeLast();
	}
	public  boolean isNull(){
		return link.isEmpty();
	}
	
}