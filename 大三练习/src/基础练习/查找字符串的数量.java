package ������ϰ;

public class �����ַ��������� {
	public static void main(String[] args) {
		String strs = "agoodsdagoodjkhkgoodkjgood";
		String key ="good";
	/*	int x = strs.indexOf(key,0);//��ͷ��ʼ��
		System.out.println("x="+x);
		int y = strs.indexOf(key,x+key.length());//��ָ��λ�ÿ�ʼ��
		System.out.println("y="+y);
		int z = strs.indexOf(key,y+key.length());//��ָ��λ�ÿ�ʼ��
		System.out.println("z="+z);
		int e = strs.indexOf(key,z+key.length());//��ָ��λ�ÿ�ʼ��
		System.out.println("e="+e);
		int f = strs.indexOf(key,e+key.length());//��ָ��λ�ÿ�ʼ��
		System.out.println("f="+f);//�����ָ���ʱ�Ѿ��������*/	
/**
 * �����ַ�����������
 */
		
		System.out.println(KeyCount(strs,key));
	}

	public static int KeyCount(String strs, String key) {
		int count = 0;//����ؼ�������
		int index = 0;//�����ʼλ��
		while(strs.indexOf(key,index)!=-1){
			count++;
			index = strs.indexOf(key,index)+key.length();
		}
		return count;	
	}
}
