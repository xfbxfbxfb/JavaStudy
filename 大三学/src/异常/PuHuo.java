package 异常;

/* 
 * 
 * 异常的声明与捕获
 * 
 * 声明：将问题标识出来，报告给调用者。
 * 如果函数内通过throw抛出了编译时异常，而捕获，那么必须通过throws进行声明，让调用者去处理。
 * 
 * 捕获：java中对异常有针对性的语句进行捕获。
 * 语句为：
 * try
 * {
 //需要被检测的语句
 * }
 * catch(异常类 变量)
 * {
 //异常处理的语句
 }
 finally
 {
 //一定会被执行的语句
 }
 */

public class PuHuo {
	public static void main(String[] args) //throws Exception //在调用者上继续声明
	{
		Demo1  d =  new Demo1();
		try {
			d.show(1);//将Exception丢个给catch
		} catch (Exception e) {//Exception e = new Exception()
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("异常发生了");//处理问题
		}
		finally{
			System.out.println("解决");//一定会执行的语句
		}
	}

}
class Demo1 
{
void show(int x) throws Exception 
{
	if(x==1){
    throw new Exception();
	}
	}

}
