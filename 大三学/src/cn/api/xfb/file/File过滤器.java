package cn.api.xfb.file;

import java.io.File;

public class File过滤器 {

	public static void main(String[] args) {
		
		File file = new File("E:\\java上传图片\\File");
		File[] f1 = file.listFiles(new FeilFilterByjava());//传入一个过滤器,过滤是否是目录
		//File[] f1 = file.listFiles(new FeilnameFilterByjava(".txt"));//传入一个过滤器，过滤特定的文件
		for(File f2 : f1){
			System.out.println(f2);
		}
				

	}

}
