package cn.xfb.api.IO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���ַ������������ԭ��Ϊ��֪���ļ��ı�����������ֽ�������������ȷ��
 * InputStreamReader�ǽ��ֽ�תΪ�ַ���Ȼ��OutputStreamWriter���ַ�תΪ�ֽ�
 * 
 */
public class �ļ�ֻ���ַ����� {

	public static void main(String[] args) throws IOException {
		//ͨ�ð渴��
		//��Ҫ���Ƶ��ļ�
		FileInputStream fis = new FileInputStream(new File("E:\\java�ϴ�ͼƬ\\1\\1.doc"));
		//���ƺ���ļ�	
		FileOutputStream fos = new FileOutputStream(new File("E:\\java�ϴ�ͼƬ\\1\\1����.doc"));
		//�ֽڻ�����
		byte[] b = new byte[fis.available()];
		int len = fis.read(b);
		fos.write(b, 0, len);
		fis.close();
		fos.close();
		/*
		 * �Լ����ÿ���
		 * ��������
		 */
//		File f = new File("E:\\java�ϴ�ͼƬ\\1\\1.doc");
//		InputStreamReader isr = new InputStreamReader(new FileInputStream(f),"gbk");
//		OutputStreamWriter osw = new OutputStreamWriter(
//				new FileOutputStream(new File("E:\\java�ϴ�ͼƬ\\1\\33����.doc")), "gbk");
//		char[] ch = new char[1024];
//		int len = 0;
//		while((len=isr.read(ch))!=-1) {
//			osw.write(ch,0,len);
//		}
//		isr.close();
//		osw.close();
		/*
		 * ����õ���Ĭ�ϱ����
		 * 
		 */
//		FileReader fr = new FileReader(new File("E:\\java�ϴ�ͼƬ\\1\\1.doc"));
//		FileWriter fw = new FileWriter(new File("E:\\java�ϴ�ͼƬ\\1\\4.doc"));
//		char[] ch = new char[1024];
//		int len = 0;
//		while((len=fr.read(ch))!=-1) {
//			fw.write(ch,0,len);
//		}
//		fr.close();
//		fw.close();
	}

}
