package cn.api.xfb.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class 文件切割 {
	private static final int ONE_M = 1024*1024;
	/*
	 * 将一个多媒体文件进行分割成多个文件中。
	 * 分割有两种，一是按个数分，二按文件的大小分
	 * 一个输入流对应多个输出流
	 * 
	 */

	public static void main(String[] args) throws IOException {
		//源文件
		File srcFile = new File("E:\\IO\\1.mp3");
		//碎片文件目录
		File partFile = new File("E:\\IO\\partFile");
		//将文件进行切割
		Silpfile(srcFile,partFile);
		
		
		
		
	}
	/**
	 * 文件的切割
	 * @param srcFile
	 * @param partFile
	 * @throws IOException
	 */

	private static void Silpfile(File srcFile, File partFile) throws IOException {
		//健壮性判断
		if(!(srcFile.exists()&&srcFile.isFile())) {
			throw new RuntimeException("源文件不正确或不存在！");
		}
		//对目的文件夹进行创建
		if(!partFile.exists()) {
			partFile.mkdirs();
		}
		
		//使用字节读取流将源文件进行关联
		FileInputStream fis = new FileInputStream(srcFile);
		//明确目的，目的输出流有多个，只创建引用
		FileOutputStream fos = null;
		//缓存
		byte[] buf = new byte[ONE_M];
		
		//频繁读写
		int len = 0;
		int count = 0;
		while((len=fis.read(buf))!=-1) {
			fos = new FileOutputStream(new File(partFile,(++count)+".part"));
			fos.write(buf, 0, len);
			fos.close();
		}
		fis.close();
		
		
		
	}

}
