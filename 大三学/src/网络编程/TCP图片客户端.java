package ������;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class TCPͼƬ�ͻ��� {
		public static void main(String[] args) throws  IOException {
			System.out.println("�ͻ�������...");
			//�����ͻ���Socket�������ӷ���˵ĵ�ַ�Ͷ˿�
			Socket  s = new Socket("192.168.0.14",10000);
			
			//��ȡԴͼƬ
			File fp = new File("tempfile//2.jpg");
			FileInputStream fin = new FileInputStream(fp);
			
			//Ŀ����Socket�������
			OutputStream out = s.getOutputStream();
			byte[] buf = new byte[1024];
			int len = 0;
			while((len=fin.read(buf))!=-1){
				out.write(buf,0,len); 
			}
			//���߷���˲�Ҫ���Ŷ���
			s.shutdownOutput();//������־
			//���շ���˷�������
//			InputStream in= s.getInputStream();
//			byte[] bufin =new byte[1024];
//			int lenin = in.read(bufin);
//			System.out.println(new String(bufin,0,lenin));
			BufferedReader bufr = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String tt = bufr.readLine();
			System.out.println(tt);
			//�ر���Դ
			s.close();
			fin.close();
		}
}
