package ������ϰ;
/*
 * ģ��String�е�trim����
 * ����֪��trim�ķ�������
 * trim����������API֪����Ϊ���ַ�����ǰ��հ׼��ո����ɾ�������ַ�����
 */
public class ģ��String��trim���� {
		public static void main(String[] args) {
			String str = "   jkhkjfsd   ";
			//String str2 = str.trim();
			String str2 =getArray(str);
			System.out.println("--"+str2+"--");
		}

		private static String getArray(String str) {
			//˼·����β�����ж��Ƿ�Ϊ�ո�
			int start = 0;
			int end = str.length()-1;
			//����ʼλ�ò����ڿգ����ҿ�ʼ��ַ�����ڽ�����ַ��ʼλ��++
			while(str.charAt(start)==' '&& start<=end)
				start++;
			while(str.charAt(end)==' '&& start<=end)
				end--;
			//��ȡ��ʼ���β�ַ���
			String str3 = str.substring(start,end);
			return str3;
		}
}
