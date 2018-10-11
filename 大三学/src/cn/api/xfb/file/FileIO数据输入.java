package cn.api.xfb.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIO数据输入 {
		private static final String LINE_SEPARATOR = System.getProperty("line.separator");

		public static void main(String[] args) throws IOException {
			//创建目录
			File dir = new File("tempfile");
			if(!dir.exists()){
				dir.mkdirs();
				System.out.println("不存在");
			}
			//创建文件存储数据
			File file = new File(dir,"1.txt");
			//创建字节输入流对象，将数据保存目的明确
			FileOutputStream out = new FileOutputStream(file);
			byte[] b = "你好！".getBytes();
			String str = LINE_SEPARATOR+"你也好！";
			out.write(b);
			out.write(str.getBytes());
			out.close();
		}
}
