package cn.xfb.api.IO;
/*
 * ����ֻ�ܱ���һ���ļ���
 */
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * ˼·��
 * 1���ҳ����ļ�Ŀ¼�е�������Ҫ���ļ�������βΪ.java
 * 2,���ļ�������һ��txt�ļ���
 */
public class �б��嵥 {
	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) throws IOException {

		/*
		 * ��Ѱ�ļ��������ļ�
		 */
		// ���ҵ��ļ�Ŀ¼
		File dir = new File("E:\\java\\������ϰ");
		// ��ȷһ��������
		FileFilter filter = new Filefilterbymy(".java");
		// �嵥�б���ļ�
		File dir2 = new File("E:\\list");
		if (!dir2.exists())
			dir2.mkdirs();
		// �ļ�����
		File file2 = new File(dir2, "�嵥�б�.txt");
		// ���ļ��ü���װ����һ�������ݿ��������
		List<File> list = new ArrayList<File>();

		// ���ļ����뼯����
		getFile(dir, filter, list);
		// �Ѽ��ϵ��ļ�д���ļ���
		write2file(list, file2);

	}
/**
 * �����ϵ��ļ�д��ָ�����ļ���
 * @param list
 * @param file2
 */
	private static void write2file(List<File> list, File file2) {
		FileOutputStream out = null;
		// �û���ʹ֮���ĸ���
		BufferedOutputStream buf = null;
		try {
			out = new FileOutputStream(file2);
			buf = new BufferedOutputStream(out);
			// ��������
			for (File f2 : list) {
				String info = f2.getAbsolutePath() + LINE_SEPARATOR;
				buf.write(info.getBytes());
				buf.flush();//ÿдһ������·��ˢ��һ��
			}
		} catch (IOException e) {

		} finally {
			if (buf != null)
				try {
					buf.close();
				} catch (IOException e) {
					throw new RuntimeException("ϵͳ�ر�ʧ�ܣ�");
				}
		}

	}

	/**
	 * ���ļ����뼯����
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
		// ��������
		for (File f1 : file) {
			if (f1.isDirectory()) {
				// ���õݹ�
				getFile(f1, filter, list);
			} else {
				// ������ļ��򴫵��������й���
				if (filter.accept(f1)) {
					// ���ļ����������
					list.add(f1);
				}

			}
			
		}

	}

}
