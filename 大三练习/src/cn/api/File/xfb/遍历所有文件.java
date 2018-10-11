package cn.api.File.xfb;

import java.io.File;

public class 遍历所有文件 {

	public static void main(String[] args) {
		File dir = new File("E:\\java\\第一次作业");
		
		getAlldir(dir);

	}
/**
 * 找出所有文件及文件名
 * @param dir
 */
	private static void getAlldir(File dir) {
		// 获取目录存入
		File[] file = dir.listFiles();
		// 遍历目录
		for(File f1 : file){
			if(f1.isDirectory()){//如果是目录则
				System.out.println("文件夹名：："+f1.getName());
				//继续调用此方法来遍历
				getAlldir(f1);
			}
			else{
				System.out.println("文件："+f1.getName());
			}
		}

	}
}
