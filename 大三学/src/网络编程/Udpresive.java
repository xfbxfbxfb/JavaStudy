package ������;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Udpresive {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket(10000);
		System.out.println("���ն�");
		//�������ݰ�
		//�������ݽ����ݴ��������ݰ���
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf,buf.length);
		ds.receive(dp);
	    String ip =	dp.getAddress().getHostAddress();
		int port = dp.getPort();
		
		String ss = new String(dp.getData(),0,dp.getLength());
		System.out.println(ip+"   "+port+ss);
	}
}
