package cn.api.xfb.file;

import java.io.File;
import java.text.SimpleDateFormat;


public class File����Ӧ�� {
	public static void main(String[] args) {
		//���ļ���װΪ����
		File f1 = new File("E:\\java�ϴ�ͼƬ\\File\\1");//��Linxϵͳ����/������Ŀ¼����΢��Windons ϵͳ����\\\\������
		System.out.println(f1);
		//��parenst��װΪ����
		File dir= new File("E:\\java�ϴ�ͼƬ\\File");
		File f2 = new File(dir,"1");
		System.out.println(f2);
		//���´�������������ϵͳ
		File f3  = new File("E:"+File.separator +"java�ϴ�ͼƬ"+File.separator +"File"+File.separator +"1");
		System.out.println(f3);
		
		/*
		 * ��ȡ�ļ��Ļ�����Ϣ
		 */
		File f4 = new File("E:\\java�ϴ�ͼƬ\\File\\1.txt");
		String abspath = f4.getAbsolutePath();//��ȡ����·��
		String path = f4.getPath();//��ȡ���·��
		long size = f4.length();//��ȡ�ļ��Ĵ�С
		long time = f4.lastModified();//��ȡ����޸�ʱ��
		
		System.out.println("abspath = "+abspath);
		System.out.println("path = "+path);
		System.out.println("size = "+size);
		System.out.println("time = "+time);
		
		//��ʱ���Ϊ�ı�
		String date = new SimpleDateFormat("yyyy��MM��dd�գ�HH��mm:ss").format(time);
		System.out.println(date);
		
		
		
		
	}

}
