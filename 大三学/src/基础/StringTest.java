package ����;
/*
 Sting�ķ���ʹ��
 1.String�ĳ���length()��
 2.����ĳ�ַ���λ��index;
 3.��ȡ�ַ���substring;
 4.�ַ����Ƿ�����ָ�����ַ�����ͷ���β��startsWith,	endsWith;
 5.�ַ������滻��replase
 6.���ַ����ĳ�������ֽڣ�char [];
 7,���ַ�����Ϊ��д����Сд��
 */

public class StringTest {
	public static void main(String[] args) {
		String str = "StringDemoJava.net";
// 1.��Ϊ���ص�ֵ��int����		
		int len = str.length();
		System.out.println("����Ϊ"+len);
//2.����ĳ���ַ���λ��  
		int index = str.indexOf('a');
		System.out.println("��һ��a��λ����"+index);
		int index1 = str.indexOf('a', index+1);
		System.out.println("�ڶ���a��λ����"+index1);
//3.��ȡ�ַ���substring;
		String s = str.substring(6,10);//�ӵ���������10-1�����ַ���
		System.out.println("��ȡ���ַ�����"+s);
// 4.�ַ����Ƿ�����ָ�����ַ�����ͷ���β��startsWith,	endsWith
		boolean b = str.startsWith("Sring");//false
		System.out.println(b);
		boolean b1 = str.endsWith("net");//ture
		System.out.println(b1);
//	 5.�ַ������滻��replase	
		String s1 = str.replace("net", "io");
		System.out.println("�޸ĺ���ַ���"+s1);
//	 6.���ַ����ĳ�������ֽڣ�	
		char [] c = str.toCharArray();

		byte [] bytes = str.getBytes(); 
		
//	 7,���ַ�����Ϊ��д����Сд��	
		String s2 = str.toUpperCase();
		System.out.println("ȫ��Ϊ��дΪ"+s2);
		String s3 = str.toLowerCase();
		System.out.println("ȫ��ΪСдΪ"+s3);
// 8 .���ַ�������ָ���ķ��������䣬"li ming,xiao bo,xiao ming "
		String str1 = "li ming,xiao bo,xiao ming";
		String[] names =str1.split(",");
		for (int i =0;i<names.length;i++)
		{
			System.out.println(names[i]);	
		}
//9.���ַ������бȽ�
		int result = "ab".compareTo("ad");//�ַ���"ab"�롰ad���Ƚ�
		System.out.println(result);//���0��ǰһ����
		
		
		
	}

}
