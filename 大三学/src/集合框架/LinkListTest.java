package ���Ͽ��;
/*
 * LinkedList�еĶ��У��Ƚ��ȳ�
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
 * LinkedList�еĶ��м��Ƚ��ȳ�
 * @author bo
 *
 */
class Quent{
	//��LinkedList���з�װ
	private LinkedList link ;
	//����������ʼ��
	public Quent( ) {
		link = new LinkedList();
	}

	/**
	 * Ԫ�صĻ�ȡ
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