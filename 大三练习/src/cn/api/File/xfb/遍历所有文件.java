package cn.api.File.xfb;

import java.io.File;

public class ���������ļ� {

	public static void main(String[] args) {
		File dir = new File("E:\\java\\��һ����ҵ");
		
		getAlldir(dir);

	}
/**
 * �ҳ������ļ����ļ���
 * @param dir
 */
	private static void getAlldir(File dir) {
		// ��ȡĿ¼����
		File[] file = dir.listFiles();
		// ����Ŀ¼
		for(File f1 : file){
			if(f1.isDirectory()){//�����Ŀ¼��
				System.out.println("�ļ���������"+f1.getName());
				//�������ô˷���������
				getAlldir(f1);
			}
			else{
				System.out.println("�ļ���"+f1.getName());
			}
		}

	}
}
