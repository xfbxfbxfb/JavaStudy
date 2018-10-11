package cn.xfb.api.IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class 将学生的信息录入 {

	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) throws IOException {
		Set<StudentIO> set = new TreeSet<StudentIO>(Collections.reverseOrder());

		set.add(new StudentIO("小明", 20, 20, 20));
		set.add(new StudentIO("小波", 20, 56, 80));
		set.add(new StudentIO("小芳", 90, 80, 60));
		set.add(new StudentIO("小红", 80, 60, 70));

		// 遍历
		for (StudentIO stu : set) {
			System.out.println(stu);
		}
		/*
		 * 将数据写入文件中
		 * 
		 */
		// 创建目录
		File dir = new File("E:\\IO");
		if (!dir.exists()) {
			dir.mkdirs();
		}
		File file = new File(dir, "1.txt");
		writ2file(set, file);
	}

	private static void writ2file(Set<StudentIO> set, File file) throws IOException  {
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(file);
			for (StudentIO stu : set) {
				//将资源写入
				String info = stu.getName() + "\t" + stu.getSum() + LINE_SEPARATOR;
				out.write(info.getBytes());
			}
//最终需要关闭
		} finally {
			if (out != null) {
				try {
					out.close();
					//无法关闭时抛异常
				} catch (IOException e) {
					throw new RuntimeException("系统关闭资源失败");
				}

			}
		}

	}
}
