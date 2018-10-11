package cn.xfb.api.IO;

import java.io.File;
/*
 * 此处的删除不会放回回收站中
 */
public class 删除一个目录 {
	public static void main(String[] args) {
		File dir = new File("E:\\test");
		if(dir!=null){
		File[] file = dir.listFiles();
		
		for(File f1 : file ){
			if(f1.isDirectory()){
				removedir(f1);
			}else{
				//删除文件
				System.out.println(f1+"::"+f1.delete());
			}
		}
		System.out.println(dir+"--"+dir.delete());
	 }
	}

	private static void removedir(File f1) {
		if(f1!=null){
		File[] file = f1.listFiles();
		for(File f2 : file){
			if(f2.isDirectory()){
				removedir(f2);
			}else{
				//删除文件
				System.out.println(f2+"::"+f2.delete());
			}
		}	
	}
		System.out.println(f1+"文件夹"+f1.delete());
	}
}
