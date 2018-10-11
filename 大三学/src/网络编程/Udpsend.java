package 网络编程;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;

/*
 *  
 */
public class Udpsend {
		public static void main(String[] args) throws IOException {
			DatagramSocket ds = new DatagramSocket();//建立udp的socket
		/*	//键盘录入
			InputStream i = System.in;
			//将字节流转为字符流
			InputStreamReader ins = new InputStreamReader(i);
			//将数据进行缓存
			BufferedReader bf = new BufferedReader(ins);
			*/
			//前三句转为一句
			System.out.println("发送端");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			byte[] buf = br.readLine().getBytes();
			DatagramPacket  dp = new DatagramPacket(buf,buf.length,InetAddress.getByName("127.0.0.1"),10000);
			ds.send(dp);
		}
}
