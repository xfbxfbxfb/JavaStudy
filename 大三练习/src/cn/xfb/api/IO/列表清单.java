package cn.xfb.api.IO;
/*
 * 问题只能遍历一个文件夹
 */
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * 思路：
 * 1，找出此文件目录中的所有需要的文件，即结尾为.java
 * 2,将文件保存在一个txt文件中
 */
public class 列表清单 {
	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) throws IOException {

		/*
		 * 搜寻文件及过滤文件
		 */
		// 查找的文件目录
		File dir = new File("E:\\java\\大三练习");
		// 明确一个过滤器
		FileFilter filter = new Filefilterbymy(".java");
		// 清单列表的文件
		File dir2 = new File("E:\\list");
		if (!dir2.exists())
			dir2.mkdirs();
		// 文件名称
		File file2 = new File(dir2, "清单列表.txt");
		// 将文件用集合装起来一般用数据库存起来的
		List<File> list = new ArrayList<File>();

		// 把文件存入集合中
		getFile(dir, filter, list);
		// 把集合的文件写入文件中
		write2file(list, file2);

	}
/**
 * 将集合的文件写入指定的文件中
 * @param list
 * @param file2
 */
	private static void write2file(List<File> list, File file2) {
		FileOutputStream out = null;
		// 用缓存使之传的更快
		BufferedOutputStream buf = null;
		try {
			out = new FileOutputStream(file2);
			buf = new BufferedOutputStream(out);
			// 遍历集合
			for (File f2 : list) {
				String info = f2.getAbsolutePath() + LINE_SEPARATOR;
				buf.write(info.getBytes());
				buf.flush();//每写一个绝对路径刷新一次
			}
		} catch (IOException e) {

		} finally {
			if (buf != null)
				try {
					buf.close();
				} catch (IOException e) {
					throw new RuntimeException("系统关闭失败！");
				}
		}

	}

	/**
	 * 把文件存入集合中
	 * 
	 * @param dir
	 * @param filter
	 * @param list
	 */
	private static void getFile(File dir, FileFilter filter, List<File> list) {

		File[] file = dir.listFiles();
		if(file==null){
			return;
		}
		// 遍历集合
		for (File f1 : file) {
			if (f1.isDirectory()) {
				// 利用递归
				getFile(f1, filter, list);
			} else {
				// 如果是文件则传到过滤器中过滤
				if (filter.accept(f1)) {
					// 将文件存进集合中
					list.add(f1);
				}

			}
			
		}

	}

}
