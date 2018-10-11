package cn.xfb.api.IO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 用字符流出现乱码的原因为不知道文件的编码表所以用字节来复制是最正确的
 * InputStreamReader是将字节转为字符，然后OutputStreamWriter将字符转为字节
 * 
 */
public class 文件只有字符复制 {

	public static void main(String[] args) throws IOException {
		//通用版复制
		//需要复制的文件
		FileInputStream fis = new FileInputStream(new File("E:\\java上传图片\\1\\1.doc"));
		//复制后的文件	
		FileOutputStream fos = new FileOutputStream(new File("E:\\java上传图片\\1\\1复制.doc"));
		//字节缓存区
		byte[] b = new byte[fis.available()];
		int len = fis.read(b);
		fos.write(b, 0, len);
		fis.close();
		fos.close();
		/*
		 * 自己觉得可行
		 * 出现乱码
		 */
//		File f = new File("E:\\java上传图片\\1\\1.doc");
//		InputStreamReader isr = new InputStreamReader(new FileInputStream(f),"gbk");
//		OutputStreamWriter osw = new OutputStreamWriter(
//				new FileOutputStream(new File("E:\\java上传图片\\1\\33复制.doc")), "gbk");
//		char[] ch = new char[1024];
//		int len = 0;
//		while((len=isr.read(ch))!=-1) {
//			osw.write(ch,0,len);
//		}
//		isr.close();
//		osw.close();
		/*
		 * 最简单用的是默认编码表
		 * 
		 */
//		FileReader fr = new FileReader(new File("E:\\java上传图片\\1\\1.doc"));
//		FileWriter fw = new FileWriter(new File("E:\\java上传图片\\1\\4.doc"));
//		char[] ch = new char[1024];
//		int len = 0;
//		while((len=fr.read(ch))!=-1) {
//			fw.write(ch,0,len);
//		}
//		fr.close();
//		fw.close();
	}

}
