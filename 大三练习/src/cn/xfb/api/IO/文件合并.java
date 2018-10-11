package cn.xfb.api.IO;
/*
 * 解决的问题
 * 将多部分的碎片进行排序组合成一个文件
 * 
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

/*
 * SequenceInputStream 表示其他输入流的逻辑串联。它从输入流的有序集合开始，并从第一个输入流开始读取，直到到达文件末尾，
 * 接着从第二个输入流读取，依次类推，直到到达包含的最后一个输入流的文件末尾为止。 
 */

public class 文件合并 {

	public static void main(String[] args) throws IOException {
		File partDir = new File("E:\\IO\\tempFile");
		//使用io包的SequenceInputStream,将多个读取流合并成一个流
		List<FileInputStream> list = new ArrayList<FileInputStream>();
		//将文件碎片装进集合
		for (int i = 1; i < 7; i++) {
			list.add(new FileInputStream(new File(partDir,i+".part")));
		}
		//拿到Enumeration对象？list本身无法获取Enumeration对象，考虑到Collactions去.
		Enumeration<FileInputStream> em = Collections.enumeration(list);
		//排序源 即大流
		SequenceInputStream sis = new SequenceInputStream(em);
		//输出流目的
		FileOutputStream fos = new FileOutputStream(new File(partDir,"000.mp3"));
		
		//频繁读写操作
		
		byte []  buff = new byte[1024];//此处可以随意写大小
		int len = 0 ;
		while((len = sis.read(buff))!=-1) {
			fos.write(buff, 0, len);
		}
		
		//关闭流
		sis.close();
		fos.close();

	}

}
