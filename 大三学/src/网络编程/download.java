package ������;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class download implements Runnable {
private Socket s ;
	public download(Socket s) {
	super();
	this.s = s;
}
	@Override
	public void run() {
		try{
		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip+"....connet");

		// ��ȡͼƬ����
		InputStream in = s.getInputStream();

		// дͼƬ���ݵ��ļ�
		
		//����Ŀ¼
		File dir = new File("E://java�ϴ�ͼƬ");
		if(!dir.exists()){
			dir.mkdirs();
		}
		int count = 0;
		//���ļ�����
		File f1 = new File(dir,ip+".jpg");
		while(f1.exists()){
			count++;
			f1= new File(dir,ip+"("+count+")"+".jpg");
		}
		FileOutputStream fpic = new FileOutputStream(f1);
		
		byte[] buf = new byte[1024];
		int len = 0;
		while((len=in.read(buf))!=-1){
			fpic.write(buf, 0, len);
		}
		//s.shutdownOutput();
		//���ؿͻ�����Ϣ
		OutputStream out = s.getOutputStream();
		out.write("�ϴ��ɹ�".getBytes());
		
		//�ر���Դ
		s.close();
		fpic.close();
		}catch(IOException e){
			
		}
	}

}
