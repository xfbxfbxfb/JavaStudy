package cn.api.xfb.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


/*
 * ���õ����ı����GBK��UTF-8
 * ��һ���ַ���UTF-8���ı����������
 */
public class �ֽ��ַ�ת�� {
	public static void main(String[] args) throws IOException {
		String str = "���лл�ټ�";
		//����
		/*
		 * ���ַ���תΪ�ֽ���
		 * ��д���ַ���д�����������б��룬����utf-8�ı�������ࡣ
		 */
		OutputStreamWriter osw = new OutputStreamWriter(
				new FileOutputStream("E:\\list\\1.txt"), "utf-8");
		osw.write(str);
		osw.flush();
		osw.close();
		//����
		/*
		 * ���ֽ���תΪ�ַ���
		 * �����յ��ֽ����ڻ��������н���Ϊutf-8��ʽ
		 */
		InputStreamReader isr = new InputStreamReader(
				new FileInputStream("E:\\list\\1.txt"), "utf-8");
		char[] buf = new char[1024];
		int line=isr.read(buf);
		System.out.println("utf-8�����utf-8--"+new String(buf,0,line));
		isr.close();
		//FileReaderĬ�ϵ���GBK���
		FileReader fr = new FileReader("E:\\list\\1.txt");
		char[] buf1 = new char[1024];
		int line1 = fr.read(buf1);
		System.out.println("GBK�����utf-8--"+new String(buf1,0,line1));
		fr.close();
	}
}
