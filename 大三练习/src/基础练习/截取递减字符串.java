package ������ϰ;
//��ӡ��ȡ�𽥼��ٵ��ַ���
public class ��ȡ�ݼ��ַ��� {
	public static void main(String[] args) {
		String strs = "goodmorning";
	 
	System.out.println( PrintString(strs));
	}

	private static String PrintString(String strs) {
		//������ԭ��
		for (int i = 0; i < strs.length(); i++) {
			for (int star = 0, end =strs.length()-i;end <=strs.length(); star++,end++) {
				System.out.println(strs.substring(star,end)); 
			}
			
		}
		
		return null;
	}
}
