package cn.api.xfb.file;

import java.io.File;
import java.io.IOException;

public class File����Ӧ��2 {
		public static void main(String[] args) throws IOException {
			/*
			 * Ŀ¼�Ĵ�����ɾ��
			 */
			File dir = new File("E:\\Filetemp\\text");
			boolean i = dir.mkdirs();//��������ڴ���Ŀ¼�ļ��з���true��������ڷ���false
			System.out.println("�ļ����Ƿ񴴽���"+i);
		
	//		dir.delete();//ֻ��ɾ��Ŀ¼��Ϊ�յ��ļ���,��������վ
			
			/*
			 * �ļ��Ĵ�����ɾ��
			 */
			File file = new File("E:\\Filetemp\\1.text");
			boolean j = file.createNewFile();//��������ڴ����ļ�����true��������ڷ���false
			//file.delete();//��������վ
			System.out.println("�ļ��Ƿ񴴽���"+j);
			
//			�ж��Ƿ���Ŀ¼���ļ�
			System.out.println("dir�Ƿ���Ŀ¼"+dir.isDirectory());
			System.out.println("file�Ƿ���Ŀ¼"+file.isDirectory());
			System.out.println("dir�Ƿ����ļ�"+dir.isFile());
			System.out.println("file�Ƿ����ļ�"+file.isFile());
			
		}
}
