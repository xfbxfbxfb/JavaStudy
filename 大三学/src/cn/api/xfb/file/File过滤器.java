package cn.api.xfb.file;

import java.io.File;

public class File������ {

	public static void main(String[] args) {
		
		File file = new File("E:\\java�ϴ�ͼƬ\\File");
		File[] f1 = file.listFiles(new FeilFilterByjava());//����һ��������,�����Ƿ���Ŀ¼
		//File[] f1 = file.listFiles(new FeilnameFilterByjava(".txt"));//����һ���������������ض����ļ�
		for(File f2 : f1){
			System.out.println(f2);
		}
				

	}

}
