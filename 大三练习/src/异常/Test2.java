package 异常;

/*
 * 写一个程序，程序员xx，带电脑上班，出现的异常。
 * 程序运用了两种方法，一种编译时期：不声明不能处理，一种运行时期：声明进行处理
 */
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee em = new Employee();
		em.run();

	}

}

/*
 * 分析属性： 程序员：xx，功能：打代码 装备：电脑 出现的问题：1，电脑蓝屏，2，电脑进水，坏了。 处理方法：1，蓝屏重启，2，坏了拿去店里修
 */
class LangPingException extends Exception {// 能处理

	LangPingException() {
		super();
	}

	LangPingException(String msg) {
		super(msg);
	}
}

class XiuLiException extends RuntimeException {// 能处理

	XiuLiException() {
		super();
	}

	XiuLiException(String msg) {
		super(msg);
	}
}

class HuaiLeException extends Exception {//Exception修改为RuntimeException 不能处理

	HuaiLeException() {
		super();
	}

	HuaiLeException(String msg) {
		super(msg);
	}
}

class Employee {
	String name = "波";
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

		System.out.println("程序员" + name + "用电脑打代码");
	}

}

class NotBook {

	int state = 2;
	String zhuangbei = "电脑";

	void run() throws LangPingException, HuaiLeException {
		if (state == 1) {
			throw new LangPingException("电脑蓝屏了");
		}
		if (state == 2) {
			throw new HuaiLeException("电脑坏了终止");
		}
		if (state == 3) {
			throw new XiuLiException("电脑正在修理");
		}
		System.out.println("电脑运行");
	}

	void rest() {
		state = 0;
		System.out.println("电脑重启");
	}
	void repair(){
		state = 0;
		System.out.println("电脑修好了");
	}
}
