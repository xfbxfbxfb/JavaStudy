package cn.api.xfb.io;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class propertiesӦ�� {
	public static void main(String[] args) throws IOException {
		
		/*
		 * ����������д��������������д����ﵽָ���Ĵ�����������ô����ѵ�����ע��
		 */
		
		if(isStop()) {
			System.out.println("���ô����ѵ���ע�ᣡ");
		}
		else {
		
		runcode();
		}
	}

	private static boolean isStop() throws IOException {
		//�����ļ�
		File configFile = new File("E:\\IO\\�½��ļ���\\1.txt");
		if(!configFile.exists()) {
			configFile.mkdirs();
		}
		//�������Լ�
		Properties prop = new Properties();
		
		//�����ȡ���������ļ�����//��ȡ�ļ�
		FileInputStream fis = new FileInputStream(configFile);
		
		//���������ݶ�ȡ�����Լ���
		prop.load(fis);
		
		//�������Լ�ָ���ļ�����ȡ����Ĵ���
		String value = prop.getProperty("count");
		int count = 0 ;
		if(value!=null) {
			
			count = Integer.parseInt(value);//תΪ����
			if(count>3) {
				return true;
			}
		}
		count++;
		//������ֵ�ŵ����Լ���
		prop.setProperty("count", Integer.toString(count));
		//�����Լ��ŵ��ļ���
		FileOutputStream fos = new FileOutputStream(configFile);
		prop.store(fos, "������еĴ�����");
		//�ر���
		fos.close();
		fis.close();
		return false;
	}

	private static void runcode() {
		System.out.println("���������У�");
		
	}

}







