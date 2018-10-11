package 网络编程;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Udpresive {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket(10000);
		System.out.println("接收端");
		//定义数据包
		//接收数据将数据储存在数据包中
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf,buf.length);
		ds.receive(dp);
	    String ip =	dp.getAddress().getHostAddress();
		int port = dp.getPort();
		
		String ss = new String(dp.getData(),0,dp.getLength());
		System.out.println(ip+"   "+port+ss);
	}
}
