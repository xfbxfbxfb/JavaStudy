package cn.api.xfb.file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 * ͨ��FileReader,���ֽڱ���Ϊ�ַ�
 */
public class FileReader������ {

	public static void main(String[] args) throws IOException {
		int count = 0;
		File dir = new File("E:\\list\\�嵥�б�.txt");
		FileReader fr = new FileReader(dir);//�˵ײ����õ���FileInputStream���������еı�����ֽڴ��Ϊ�ַ���
		int read = 0;
		while((read=fr.read())!=-1) {
			if(read=='ϰ') {
				count++;
			}
		}
		System.out.println("���ĵ��й���ϰ��"+count+"��");
		System.out.println(read);
		fr.close();
	}

}
