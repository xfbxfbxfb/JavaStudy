package 网络编程;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * 思路
 * 1,建立客户端socket绑定服务端的地址和端口。
 * 2，连接成功出现socket io 流，客户要做的是获取io流中的输出流进行数据发送服务端。
 * 3，通过socket 输出流发送给服务端。
 * 4，关闭资源
 */

public class Tcp客户端 {
	public static void main(String[] args) throws IOException {
////		 1,建立客户端socket绑定服务端的地址和端口。
	Socket s = new Socket("127.0.0.1",10000);
//		 2，连接成功出现socket io 流，客户要做的是获取io流中的输出流进行数据发送服务端。
		OutputStream out = s.getOutputStream();
		String text = "tcp来了";
		//byte [] buf = text.getBytes();
		out.write(text.getBytes());
//		 3，通过socket 输出流发送给服务端。
	
//		 4，关闭资源
		s.close();
		
		
	}

}
