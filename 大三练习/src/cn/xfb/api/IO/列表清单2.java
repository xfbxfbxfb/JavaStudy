package cn.xfb.api.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class �б��嵥2 {

	private static final String Line_SEPARATOR = System.getProperty("line.separator");
	public static void main(String[] args) throws IOException {
		/*
		 * ���ݲ��裺
		 * 1������Ŀ���ļ�
		 * 2��������
		 * 3����ȡ�ļ����뼯����
		 * 4�������嵥�ļ�
		 * 5�����������ݴ����嵥�ļ���
		 */
//		 1������Ŀ���ļ�·��
		File dir = new File("E:\\BaiduNetdiskDownload\\����java\\����Java������Ƶ�̳̹��02");
//		 2��������
		FileFilter filter = new Filefilterbymy2(".avi"); 
		List<File> list = new ArrayList<File>();
//		 3����ȡ�ļ����뼯����
		getfile(dir,filter,list);
//		 4�������嵥�ļ�
		File dir2 = new File("E:\\list");
		if(!dir2.exists()){
			dir2.mkdirs();
		}
		File file = new File(dir2,"java��Ƶ�б��嵥.txt");
//		 5�����������ݴ����嵥�ļ���
		write2list(list,file);
		 
	}
	
	/**
	 * ��ȡ�ļ����뼯����
	 * @param dir
	 * @param filter
	 * @param list
	 */
	private static void getfile(File dir, FileFilter filter, List<File> list) {
		//���ļ��ŵ������ļ�����
		File[] filelist = dir.listFiles();
		//�����ļ���
		for(File file : filelist){
			if(file.isDirectory()){
				getfile(file,filter,list);
			}else{
				if(filter.accept(file)){//����ļ����Ϲ�����������뼯����
					list.add(file);
				}
			}
		}
 		
	}
/**
 *  5�����������ݴ����嵥�ļ���
 * @param list
 * @param file
 * @throws IOException 
 */
	private static void write2list(List<File> list, File file) throws IOException  {
		//���������
		FileOutputStream fos = null;
		BufferedOutputStream buf = null;
		try {
			fos =new FileOutputStream(file);
			//�����ݷ��뻺����
			buf = new BufferedOutputStream(fos);
			//��������
			for(File f2 : list){
				String info = f2.getAbsolutePath()+Line_SEPARATOR;
				buf.write(info.getBytes());
				buf.flush();//ÿдһ��·��ˢ��һ��
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			if(buf!=null){
				try {
					buf.close();
					fos.close();
					System.out.println("�б����ɹ���");
				} catch (IOException e) {
					throw new RuntimeException("ϵͳ������ر�ʧ�ܣ�");
				}
			}
		}
		
	}

}
