package cn.xfb.api.IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class ��ѧ������Ϣ¼�� {

	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) throws IOException {
		Set<StudentIO> set = new TreeSet<StudentIO>(Collections.reverseOrder());

		set.add(new StudentIO("С��", 20, 20, 20));
		set.add(new StudentIO("С��", 20, 56, 80));
		set.add(new StudentIO("С��", 90, 80, 60));
		set.add(new StudentIO("С��", 80, 60, 70));

		// ����
		for (StudentIO stu : set) {
			System.out.println(stu);
		}
		/*
		 * ������д���ļ���
		 * 
		 */
		// ����Ŀ¼
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
				//����Դд��
				String info = stu.getName() + "\t" + stu.getSum() + LINE_SEPARATOR;
				out.write(info.getBytes());
			}
//������Ҫ�ر�
		} finally {
			if (out != null) {
				try {
					out.close();
					//�޷��ر�ʱ���쳣
				} catch (IOException e) {
					throw new RuntimeException("ϵͳ�ر���Դʧ��");
				}

			}
		}

	}
}
