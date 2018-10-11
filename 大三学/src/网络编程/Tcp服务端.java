package 网络编程;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 思路：
 * 1，创建一个服务端口serversocke,用于监听一个端口
 * 2，服务端只要接收链接过来的客户端的就可以进行通信。	
 * 3，通过获取客户端读取流对象读取客户端数据。
 * 4,显示在屏幕上
 */
public class Tcp服务端 {
			public static void main(String[] args) throws IOException {
//				 1，创建一个服务端口serversocke,用于监听一个端口
				ServerSocket ss = new ServerSocket(10000);
				System.out.println("Tcp启动");
//				 2，服务端只要接收链接过来的客户端的就可以进行通信。	
				Socket s = ss.accept();
				System.out.println("链接成功");
//				 3，通过获取客户端读取流对象读取客户端数据。
				InputStream in = s.getInputStream();
				
//				 4,显示在屏幕上	
				byte [] buf = new byte[1024];
				int len = in.read(buf);
				String text = new String(buf,0,buf.length);
				String ip = s.getInetAddress().getHostAddress();
				int port = s.getPort();
				System.out.println(ip+"端口："+port+"发来："+text);
				
			}
}
