package �쳣;

/*
 * дһ�����򣬳���Աxx���������ϰ࣬���ֵ��쳣��
 * �������������ַ�����һ�ֱ���ʱ�ڣ����������ܴ���һ������ʱ�ڣ��������д���
 */
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee em = new Employee();
		em.run();

	}

}

/*
 * �������ԣ� ����Ա��xx�����ܣ������ װ�������� ���ֵ����⣺1������������2�����Խ�ˮ�����ˡ� ��������1������������2��������ȥ������
 */
class LangPingException extends Exception {// �ܴ���

	LangPingException() {
		super();
	}

	LangPingException(String msg) {
		super(msg);
	}
}

class XiuLiException extends RuntimeException {// �ܴ���

	XiuLiException() {
		super();
	}

	XiuLiException(String msg) {
		super(msg);
	}
}

class HuaiLeException extends Exception {//Exception�޸�ΪRuntimeException ���ܴ���

	HuaiLeException() {
		super();
	}

	HuaiLeException(String msg) {
		super(msg);
	}
}

class Employee {
	String name = "��";
	private NotBook book;

	Employee() {
		book = new NotBook();
	}

	void run() {
		try {
			
				book.run();
			} 
		catch (LangPingException e) {
				e.printStackTrace();
				book.rest();
			}
		 
	    catch (HuaiLeException e) {
			System.out.println(e.toString());
			book.repair();
			}

		System.out.println("����Ա" + name + "�õ��Դ����");
	}

}

class NotBook {

	int state = 2;
	String zhuangbei = "����";

	void run() throws LangPingException, HuaiLeException {
		if (state == 1) {
			throw new LangPingException("����������");
		}
		if (state == 2) {
			throw new HuaiLeException("���Ի�����ֹ");
		}
		if (state == 3) {
			throw new XiuLiException("������������");
		}
		System.out.println("��������");
	}

	void rest() {
		state = 0;
		System.out.println("��������");
	}
	void repair(){
		state = 0;
		System.out.println("�����޺���");
	}
}
