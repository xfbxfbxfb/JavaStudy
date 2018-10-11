package cn.xfb.api.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class 列表清单2 {

	private static final String Line_SEPARATOR = System.getProperty("line.separator");
	public static void main(String[] args) throws IOException {
		/*
		 * 内容步骤：
		 * 1，定义目标文件
		 * 2，过滤器
		 * 3，获取文件存入集合中
		 * 4，创建清单文件
		 * 5，将集合数据存入清单文件中
		 */
//		 1，定义目标文件路径
		File dir = new File("E:\\BaiduNetdiskDownload\\毕向东java\\毕向东Java基础视频教程光碟02");
//		 2，过滤器
		FileFilter filter = new Filefilterbymy2(".avi"); 
		List<File> list = new ArrayList<File>();
//		 3，获取文件存入集合中
		getfile(dir,filter,list);
//		 4，创建清单文件
		File dir2 = new File("E:\\list");
		if(!dir2.exists()){
			dir2.mkdirs();
		}
		File file = new File(dir2,"java视频列表清单.txt");
//		 5，将集合数据存入清单文件中
		write2list(list,file);
		 
	}
	
	/**
	 * 获取文件存入集合中
	 * @param dir
	 * @param filter
	 * @param list
	 */
	private static void getfile(File dir, FileFilter filter, List<File> list) {
		//将文件放到集合文件夹中
		File[] filelist = dir.listFiles();
		//遍历文件夹
		for(File file : filelist){
			if(file.isDirectory()){
				getfile(file,filter,list);
			}else{
				if(filter.accept(file)){//如果文件符合过滤器的则存入集合中
					list.add(file);
				}
			}
		}
 		
	}
/**
 *  5，将集合数据存入清单文件中
 * @param list
 * @param file
 * @throws IOException 
 */
	private static void write2list(List<File> list, File file) throws IOException  {
		//创建输出流
		FileOutputStream fos = null;
		BufferedOutputStream buf = null;
		try {
			fos =new FileOutputStream(file);
			//将数据放入缓存区
			buf = new BufferedOutputStream(fos);
			//遍历集合
			for(File f2 : list){
				String info = f2.getAbsolutePath()+Line_SEPARATOR;
				buf.write(info.getBytes());
				buf.flush();//每写一个路径刷新一次
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			if(buf!=null){
				try {
					buf.close();
					fos.close();
					System.out.println("列表创建成功！");
				} catch (IOException e) {
					throw new RuntimeException("系统输出流关闭失败！");
				}
			}
		}
		
	}

}
