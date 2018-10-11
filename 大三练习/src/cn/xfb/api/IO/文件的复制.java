package cn.xfb.api.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 内容：将某个文件利用io原理复制到某个地方
 */
public class 文件的复制 {
	public static void main(String[] args) throws IOException {
		//源文件位置
		File fist = new File("E:\\音乐\\Centuries.mp3");
		FileInputStream in = new FileInputStream(fist);
		
		//目的文件
		File second = new File("E:\\音乐\\37copy.mp3");
		FileOutputStream out = new FileOutputStream(second );
		
		//缓存区
		byte[] buf = new byte[in.available()];//in.available对源文件进行了固定容器刚好装下文件
		int len = in.read(buf);
		out.write(buf, 0, len);//写buf里的数据，从0到读到的长度	
//		byte[] buf = new byte[1024];
//		int len = 0;
//		while((len=in.read(buf))!=-1){//-1为读到标识符时所返回的数，
//			//将文件写进去
//			out.write(buf,0, len);
//		}
		out.close();
		in.close();
		
	}

}
