package ������;
//GET / HTTP/1.1
//Accept: image/gif, image/jpeg, image/pjpeg, application/x-ms-application, application/xaml+xml, application/x-ms-xbap, application/vnd.ms-excel, application/vnd.ms-powerpoint, application/msword, */*
//Accept-Language: zh-CN
//User-Agent: Mozilla/5.0 (Windows NT 10.0; WOW64; Trident/7.0; rv:11.0; 2345Explorer/8.8.3.16721) like Gecko
//Accept-Encoding: gzip, deflate
//Host: 192.168.0.14:10000
//Connection: Keep-Alive


import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPMy����̨ {
	public static void main(String[] args) throws IOException {
		System.out.println("����̨����...");
		//��������˿�
		ServerSocket ss = new ServerSocket(10000);
		//���տͻ���
		while(true){
		Socket s = ss.accept();
		System.out.println(s.getInetAddress().getHostAddress()+"...connect");
		
		//��ȡ�ͻ�������
		InputStream in = s.getInputStream();
		byte[] buf = new byte[1024];
		int len = in.read(buf);
		String text = new String(buf, 0, len);
		System.out.println(text);
		
		//���ͻ��˷�������
		PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
		pw.println("<font color='red' size='8'> Ф������ӭ����</font>");
		//�ر���Դ
		s.close();
		ss.close();
		}
	}

}
