package cn.xfb.api.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���ݣ���ĳ���ļ�����ioԭ���Ƶ�ĳ���ط�
 */
public class �ļ��ĸ��� {
	public static void main(String[] args) throws IOException {
		//Դ�ļ�λ��
		File fist = new File("E:\\����\\Centuries.mp3");
		FileInputStream in = new FileInputStream(fist);
		
		//Ŀ���ļ�
		File second = new File("E:\\����\\37copy.mp3");
		FileOutputStream out = new FileOutputStream(second );
		
		//������
		byte[] buf = new byte[in.available()];//in.available��Դ�ļ������˹̶������պ�װ���ļ�
		int len = in.read(buf);
		out.write(buf, 0, len);//дbuf������ݣ���0�������ĳ���	
//		byte[] buf = new byte[1024];
//		int len = 0;
//		while((len=in.read(buf))!=-1){//-1Ϊ������ʶ��ʱ�����ص�����
//			//���ļ�д��ȥ
//			out.write(buf,0, len);
//		}
		out.close();
		in.close();
		
	}

}
