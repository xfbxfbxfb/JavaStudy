package StringMy;

public class ���� {
	public static void main(String[] args) {
		String s1 = "asdd";
		String s2 = "asdd";
		System.out.println(s1==s2);
		System.out.println("--------");
		String s3 = "asdd";
		String s4 = new String("asdd");
		//s3������һ������  "asdd"Ϊһ������
		//s4��������������   new��һ������String���󣬽���asdd����Ϊ�����˽���
		
		System.out.println(s3==s4);//false ��ַ��һ��
		//��ΪString��д��equals.
		//�����ַ����Լ����ж���ͬ�����ݣ�ͨ���ַ��������е��������ж�
		System.out.println(s3.equals(s3));
	}

}
