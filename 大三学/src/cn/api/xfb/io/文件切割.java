package cn.api.xfb.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class �ļ��и� {
	private static final int ONE_M = 1024*1024;
	/*
	 * ��һ����ý���ļ����зָ�ɶ���ļ��С�
	 * �ָ������֣�һ�ǰ������֣������ļ��Ĵ�С��
	 * һ����������Ӧ��������
	 * 
	 */

	public static void main(String[] args) throws IOException {
		//Դ�ļ�
		File srcFile = new File("E:\\IO\\1.mp3");
		//��Ƭ�ļ�Ŀ¼
		File partFile = new File("E:\\IO\\partFile");
		//���ļ������и�
		Silpfile(srcFile,partFile);
		
		
		
		
	}
	/**
	 * �ļ����и�
	 * @param srcFile
	 * @param partFile
	 * @throws IOException
	 */

	private static void Silpfile(File srcFile, File partFile) throws IOException {
		//��׳���ж�
		if(!(srcFile.exists()&&srcFile.isFile())) {
			throw new RuntimeException("Դ�ļ�����ȷ�򲻴��ڣ�");
		}
		//��Ŀ���ļ��н��д���
		if(!partFile.exists()) {
			partFile.mkdirs();
		}
		
		//ʹ���ֽڶ�ȡ����Դ�ļ����й���
		FileInputStream fis = new FileInputStream(srcFile);
		//��ȷĿ�ģ�Ŀ��������ж����ֻ��������
		FileOutputStream fos = null;
		//����
		byte[] buf = new byte[ONE_M];
		
		//Ƶ����д
		int len = 0;
		int count = 0;
		while((len=fis.read(buf))!=-1) {
			fos = new FileOutputStream(new File(partFile,(++count)+".part"));
			fos.write(buf, 0, len);
			fos.close();
		}
		fis.close();
		
		
		
	}

}
