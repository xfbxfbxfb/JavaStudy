package cn.api.xfb.file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 * 通过FileReader,将字节编码为字符
 */
public class FileReader查字数 {

	public static void main(String[] args) throws IOException {
		int count = 0;
		File dir = new File("E:\\list\\清单列表.txt");
		FileReader fr = new FileReader(dir);//此底层流用的是FileInputStream，将它进行的编码把字节打包为字符。
		int read = 0;
		while((read=fr.read())!=-1) {
			if(read=='习') {
				count++;
			}
		}
		System.out.println("此文档中共有习字"+count+"个");
		System.out.println(read);
		fr.close();
	}

}
