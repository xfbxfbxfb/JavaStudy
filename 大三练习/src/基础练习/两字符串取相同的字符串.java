package ������ϰ;
//��ҵ1���������ַ���ȡ���������ͬ�ַ���

//˼·��1��ȷ�������ַ����Ĵ�С���ȣ����̴��ڳ������У�������̴���
//�������������ַ����ݼ��ķ�������ɸѡ�ҳ������ͬ�ַ���

public class ���ַ���ȡ��ͬ���ַ��� {
	public static void main(String[] args) {
		String s1 = "jkhdfakjgoodklasd";
		String s2 = "aiwergoodjr";

		System.out.println(printZfc(s1, s2));
	}

	public static String printZfc(String s1, String s2) {
		// �ж��ַ����ĳ��ȡ�
		String max = (s1.length() >= s2.length()) ? s1 : s2;//��s1�ַ����ĳ��ȴ���s2�ַ����ĳ�����ȡs1������ȡs2
		String min = max.equals(s1) ? s2 : s1;//������ֵ��s1�������Сֵȡs2��
		for (int i = 0; i < min.length(); i++) {
			for (int start = 0, end = min.length() - i; end <= min.length(); start++, end++) {
				String temp = min.substring(start, end);//ȡ�ַ���
				if (max.contains(temp)) {//���ַ���������ַ�������temp
					return temp;//����
				}
			}
		}
		return null;
	}
}
