package cn.api.xfb.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


/*
 * 常用的中文编码表GBK与UTF-8
 * 将一串字符用UTF-8中文编码表来解码
 */
public class 字节字符转换 {
	public static void main(String[] args) throws IOException {
		String str = "你好谢谢再见";
		//编码
		/*
		 * 将字符流转为字节流
		 * 将写的字符串写到缓存区进行编码，按照utf-8的编码表来编。
		 */
		OutputStreamWriter osw = new OutputStreamWriter(
				new FileOutputStream("E:\\list\\1.txt"), "utf-8");
		osw.write(str);
		osw.flush();
		osw.close();
		//解码
		/*
		 * 将字节流转为字符流
		 * 将接收的字节流在缓存区进行解码为utf-8格式
		 */
		InputStreamReader isr = new InputStreamReader(
				new FileInputStream("E:\\list\\1.txt"), "utf-8");
		char[] buf = new char[1024];
		int line=isr.read(buf);
		System.out.println("utf-8解码的utf-8--"+new String(buf,0,line));
		isr.close();
		//FileReader默认的是GBK码表
		FileReader fr = new FileReader("E:\\list\\1.txt");
		char[] buf1 = new char[1024];
		int line1 = fr.read(buf1);
		System.out.println("GBK解码的utf-8--"+new String(buf1,0,line1));
		fr.close();
	}
}
