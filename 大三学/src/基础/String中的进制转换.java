package ����;
/*�����������Ͱ�װ�ࣺjava��������������ֵ��װ�ɶ���
 * byte  	Byte	
 * short 	Short
 * int     	Integer
 * loog		Loog
 * float	Float
 * double 	Double
 * boolean 	Boolean
 * char		Character
 * �������������ص�
 * 1�����ڻ������ݺ��ַ���֮�����ת��
 * 
 */
/**
 * Integer����
 * @author bo
 *
 */
public class String�еĽ���ת�� {
	public static void main(String[] args) {
		System.out.println("ʮ����תʮ������,11  "+Integer.toHexString(11));//ʮ����תʮ������
		System.out.println("ʮ����ת������,8   "+Integer.toBinaryString(8));
		System.out.println("ʮ����ת�˽���10   "+Integer.toOctalString(10));
		
		//��������תʮ����,�ַ���תΪ����
		System.out.println(Integer.parseInt("a", 16));//����16Ϊ������Ϊ����
		System.out.println(Integer.parseInt("1000",2));
		
		System.out.println(2+3);
		System.out.println(Integer.parseInt("2",10)+Integer.parseInt("3",10));
		System.out.println(Integer.parseInt("2")+3 );
		System.out.println("5"+2);
	}
}
