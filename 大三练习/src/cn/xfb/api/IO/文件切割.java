package cn.xfb.api.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 将文件进行分割成几个部分
 * 方法
 * 将与复制的方法相似，指定分的部分为多少
 */
public class 文件切割 {
	private static final int ONE_M = 1024*1024;
	private static final String LINE_SEPASPTOR = System.getProperty("line.separator");

	public static void main(String[] args) throws IOException {
		//创建源文件与目的文件的目录
		File srcFile = new File("E:\\IO\\1.mp3");
		File slipFile = new File("E:\\IO\\tempFile");
		//定义方法
		partFile(srcFile,slipFile);
					
		
	}

	private static void partFile(File srcFile, File slipFile) throws IOException {
		//对文件进行检测
		if(!(srcFile.exists()&&srcFile.isFile())) {
			throw new RuntimeException("此文件不正确或不存在!");
		}
		if(!(slipFile.exists())) {
			slipFile.mkdir();
		}
		//读文件
		FileInputStream fis = new FileInputStream(srcFile);
//		//复制文件的目的
//		FileOutputStream fos = new FileOutputStream(srcFile);
		
		//建立缓存区
		byte[]  buff = new byte[ONE_M];//设为一兆
		int len = 0;
		int count =1;
		while((len=fis.read(buff))!=-1) {
			//复制文件的目的
			FileOutputStream fos = new FileOutputStream(new File(slipFile,count+++".part"));
			//复制文件
			fos.write(buff, 0, len);
			fos.close();	
		}
		/*
		 * 写配置文件
		 */
		String filename =srcFile.getName();
		int partcount = count;
		
		//创建输出位置
		FileOutputStream fospart = new FileOutputStream(new File(slipFile,count+".partconfig" ));
		fospart.write(("filename ="+filename+LINE_SEPASPTOR).getBytes());
		fospart.write(("partcount ="+Integer.toString(partcount)).getBytes());
		
		fospart.close();
		fis.close();
	}

}






