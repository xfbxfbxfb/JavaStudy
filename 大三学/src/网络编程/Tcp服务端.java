package ������;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * ˼·��
 * 1������һ������˿�serversocke,���ڼ���һ���˿�
 * 2�������ֻҪ�������ӹ����Ŀͻ��˵ľͿ��Խ���ͨ�š�	
 * 3��ͨ����ȡ�ͻ��˶�ȡ�������ȡ�ͻ������ݡ�
 * 4,��ʾ����Ļ��
 */
public class Tcp����� {
			public static void main(String[] args) throws IOException {
//				 1������һ������˿�serversocke,���ڼ���һ���˿�
				ServerSocket ss = new ServerSocket(10000);
				System.out.println("Tcp����");
//				 2�������ֻҪ�������ӹ����Ŀͻ��˵ľͿ��Խ���ͨ�š�	
				Socket s = ss.accept();
				System.out.println("���ӳɹ�");
//				 3��ͨ����ȡ�ͻ��˶�ȡ�������ȡ�ͻ������ݡ�
				InputStream in = s.getInputStream();
				
//				 4,��ʾ����Ļ��	
				byte [] buf = new byte[1024];
				int len = in.read(buf);
				String text = new String(buf,0,buf.length);
				String ip = s.getInetAddress().getHostAddress();
				int port = s.getPort();
				System.out.println(ip+"�˿ڣ�"+port+"������"+text);
				
			}
}
