package ���Ͽ��;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
 * Properties ���ʾ��һ���־õ����Լ���Properties �ɱ��������л�����м��ء������б���ÿ���������Ӧֵ����һ���ַ�����
 * (û�з���) 
 */

public class Map����property {
	public static void main(String[] args) throws IOException {

		// ����һ��propertise
		Properties pp = new Properties();
		// �������
		pp.setProperty("xixi", "30");
		pp.setProperty("haha", "32");
		
		//ȫ��ȡ��map- set-- itertor
		Set<String> set = pp.stringPropertyNames();
		
		for (String name : set) {
			String value = pp.getProperty(name);
			System.out.println(name+"::"+value);
		}
		
		methodDeno();
		methodDeno2();

	}
	/**
	 * ʹ��	Properties�е�store�����е����ݽ��зָ�
	 * @throws IOException 
	 * 
	 */
	private static void methodDeno2() throws IOException {
		Properties ppt = new Properties();
		ppt.setProperty("xixi", "30");
		ppt.setProperty("haha", "32");
		FileWriter fw = new FileWriter("E:\\IO\\tempFile\\info.properties");
		ppt.store(fw, "info");
		
	}
	/**
	 *  ���������ж�ȡ�����б�����Ԫ�ضԣ���ʹ��	Properties�е�load���������е����ݶ�ȡ�ҽ��зָ
	 * @throws IOException
	 */
	private static void methodDeno() throws IOException {
		
		Properties ppt = new Properties();
		
		FileReader fr = new FileReader("E:\\IO\\tempFile\\7.partconfig");	
		ppt.load(fr);
		System.out.println(ppt);
		fr.close();
	}
}





