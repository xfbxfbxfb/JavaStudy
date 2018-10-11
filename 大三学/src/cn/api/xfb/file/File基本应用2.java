package cn.api.xfb.file;

import java.io.File;
import java.io.IOException;

public class File基本应用2 {
		public static void main(String[] args) throws IOException {
			/*
			 * 目录的创建与删除
			 */
			File dir = new File("E:\\Filetemp\\text");
			boolean i = dir.mkdirs();//如果不存在创建目录文件夹返回true，如果存在返回false
			System.out.println("文件夹是否创建？"+i);
		
	//		dir.delete();//只能删除目录下为空的文件夹,不进回收站
			
			/*
			 * 文件的创建与删除
			 */
			File file = new File("E:\\Filetemp\\1.text");
			boolean j = file.createNewFile();//如果不存在创建文件返回true，如果存在返回false
			//file.delete();//不进回收站
			System.out.println("文件是否创建？"+j);
			
//			判断是否是目录和文件
			System.out.println("dir是否是目录"+dir.isDirectory());
			System.out.println("file是否是目录"+file.isDirectory());
			System.out.println("dir是否是文件"+dir.isFile());
			System.out.println("file是否是文件"+file.isFile());
			
		}
}
