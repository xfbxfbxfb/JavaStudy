package cn.xfb.api.IO;
/*
 * ���������
 * ���ಿ�ֵ���Ƭ����������ϳ�һ���ļ�
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
 * SequenceInputStream ��ʾ�������������߼����������������������򼯺Ͽ�ʼ�����ӵ�һ����������ʼ��ȡ��ֱ�������ļ�ĩβ��
 * ���Ŵӵڶ�����������ȡ���������ƣ�ֱ��������������һ�����������ļ�ĩβΪֹ�� 
 */

public class �ļ��ϲ� {

	public static void main(String[] args) throws IOException {
		File partDir = new File("E:\\IO\\tempFile");
		//ʹ��io����SequenceInputStream,�������ȡ���ϲ���һ����
		List<FileInputStream> list = new ArrayList<FileInputStream>();
		//���ļ���Ƭװ������
		for (int i = 1; i < 7; i++) {
			list.add(new FileInputStream(new File(partDir,i+".part")));
		}
		//�õ�Enumeration����list�����޷���ȡEnumeration���󣬿��ǵ�Collactionsȥ.
		Enumeration<FileInputStream> em = Collections.enumeration(list);
		//����Դ ������
		SequenceInputStream sis = new SequenceInputStream(em);
		//�����Ŀ��
		FileOutputStream fos = new FileOutputStream(new File(partDir,"000.mp3"));
		
		//Ƶ����д����
		
		byte []  buff = new byte[1024];//�˴���������д��С
		int len = 0 ;
		while((len = sis.read(buff))!=-1) {
			fos.write(buff, 0, len);
		}
		
		//�ر���
		sis.close();
		fos.close();

	}

}
