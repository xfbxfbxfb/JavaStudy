package cn.api.xfb.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIO�������� {
		private static final String LINE_SEPARATOR = System.getProperty("line.separator");

		public static void main(String[] args) throws IOException {
			//����Ŀ¼
			File dir = new File("tempfile");
			if(!dir.exists()){
				dir.mkdirs();
				System.out.println("������");
			}
			//�����ļ��洢����
			File file = new File(dir,"1.txt");
			//�����ֽ����������󣬽����ݱ���Ŀ����ȷ
			FileOutputStream out = new FileOutputStream(file);
			byte[] b = "��ã�".getBytes();
			String str = LINE_SEPARATOR+"��Ҳ�ã�";
			out.write(b);
			out.write(str.getBytes());
			out.close();
		}
}
