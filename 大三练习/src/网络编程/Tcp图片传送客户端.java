package ������;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;


public class TcpͼƬ���Ϳͻ��� {
	public static void main(String[] args) throws IOException {
		
		//���������Socket���ڰ󶨷���˵�ַ�Ͷ˿�
		Socket s = new Socket("127.0.0.1",10000);
		System.out.println("�ϴ�ͼƬ�ͻ���������.....");
		//��ȡͼƬ�ļ�
		File fi = new File("tempfile\\1.jpg");
		FileInputStream fin = new FileInputStream(fi);
		
		//�����˷���ͼƬ
		OutputStream out = s.getOutputStream();
		byte[] buf = new byte[1024];
		int len = 0;
		while((len=fin.read(buf))!=-1){
			out.write(buf,0,len);
		}
		s.shutdownOutput();
		//���շ���˷��ص�����
			BufferedReader bufr = new BufferedReader( new InputStreamReader(s.getInputStream()));
			String text = bufr.readLine();
			System.out.println(text);
		//�ر���Դ
			s.close();
			fin.close();
		
	}

}
