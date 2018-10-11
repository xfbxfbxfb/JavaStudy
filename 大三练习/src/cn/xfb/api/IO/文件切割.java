package cn.xfb.api.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���ļ����зָ�ɼ�������
 * ����
 * ���븴�Ƶķ������ƣ�ָ���ֵĲ���Ϊ����
 */
public class �ļ��и� {
	private static final int ONE_M = 1024*1024;
	private static final String LINE_SEPASPTOR = System.getProperty("line.separator");

	public static void main(String[] args) throws IOException {
		//����Դ�ļ���Ŀ���ļ���Ŀ¼
		File srcFile = new File("E:\\IO\\1.mp3");
		File slipFile = new File("E:\\IO\\tempFile");
		//���巽��
		partFile(srcFile,slipFile);
					
		
	}

	private static void partFile(File srcFile, File slipFile) throws IOException {
		//���ļ����м��
		if(!(srcFile.exists()&&srcFile.isFile())) {
			throw new RuntimeException("���ļ�����ȷ�򲻴���!");
		}
		if(!(slipFile.exists())) {
			slipFile.mkdir();
		}
		//���ļ�
		FileInputStream fis = new FileInputStream(srcFile);
//		//�����ļ���Ŀ��
//		FileOutputStream fos = new FileOutputStream(srcFile);
		
		//����������
		byte[]  buff = new byte[ONE_M];//��Ϊһ��
		int len = 0;
		int count =1;
		while((len=fis.read(buff))!=-1) {
			//�����ļ���Ŀ��
			FileOutputStream fos = new FileOutputStream(new File(slipFile,count+++".part"));
			//�����ļ�
			fos.write(buff, 0, len);
			fos.close();	
		}
		/*
		 * д�����ļ�
		 */
		String filename =srcFile.getName();
		int partcount = count;
		
		//�������λ��
		FileOutputStream fospart = new FileOutputStream(new File(slipFile,count+".partconfig" ));
		fospart.write(("filename ="+filename+LINE_SEPASPTOR).getBytes());
		fospart.write(("partcount ="+Integer.toString(partcount)).getBytes());
		
		fospart.close();
		fis.close();
	}

}






