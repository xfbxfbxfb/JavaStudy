package �쳣;

/* 
 * 
 * �쳣�������벶��
 * 
 * �������������ʶ����������������ߡ�
 * ���������ͨ��throw�׳��˱���ʱ�쳣����������ô����ͨ��throws�����������õ�����ȥ����
 * 
 * ����java�ж��쳣������Ե������в���
 * ���Ϊ��
 * try
 * {
 //��Ҫ���������
 * }
 * catch(�쳣�� ����)
 * {
 //�쳣��������
 }
 finally
 {
 //һ���ᱻִ�е����
 }
 */

public class PuHuo {
	public static void main(String[] args) //throws Exception //�ڵ������ϼ�������
	{
		Demo1  d =  new Demo1();
		try {
			d.show(1);//��Exception������catch
		} catch (Exception e) {//Exception e = new Exception()
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("�쳣������");//��������
		}
		finally{
			System.out.println("���");//һ����ִ�е����
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
