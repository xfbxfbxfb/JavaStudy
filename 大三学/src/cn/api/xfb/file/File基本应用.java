package cn.api.xfb.file;

import java.io.File;
import java.text.SimpleDateFormat;


public class File基本应用 {
	public static void main(String[] args) {
		//将文件封装为对象
		File f1 = new File("E:\\java上传图片\\File\\1");//在Linx系统中用/来区分目录，在微软Windons 系统中用\\\\来区分
		System.out.println(f1);
		//将parenst封装为对象
		File dir= new File("E:\\java上传图片\\File");
		File f2 = new File(dir,"1");
		System.out.println(f2);
		//如下代码适用于两种系统
		File f3  = new File("E:"+File.separator +"java上传图片"+File.separator +"File"+File.separator +"1");
		System.out.println(f3);
		
		/*
		 * 获取文件的基本信息
		 */
		File f4 = new File("E:\\java上传图片\\File\\1.txt");
		String abspath = f4.getAbsolutePath();//获取绝对路径
		String path = f4.getPath();//获取相对路径
		long size = f4.length();//获取文件的大小
		long time = f4.lastModified();//获取最后修改时间
		
		System.out.println("abspath = "+abspath);
		System.out.println("path = "+path);
		System.out.println("size = "+size);
		System.out.println("time = "+time);
		
		//将时间变为文本
		String date = new SimpleDateFormat("yyyy年MM月dd日，HH：mm:ss").format(time);
		System.out.println(date);
		
		
		
		
	}

}
