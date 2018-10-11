package 网络编程;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 思路：
 * 	1,创建服务端socket ,明确端;
 *  2,源：socket输入流  读取客户端发来的数据。
 *  3，目的： socket输出流。将转成大写发送给客户端。
 *  4，频繁的读写操作。
 */

public class TCP大写服务端 {
	public static void main(String[] args) throws IOException {
		System.out.println("服务端启动.....");
		// 1,创建服务端socket ,明确端;
		ServerSocket ss = new ServerSocket(10002);
		while (true) {
			
			Socket s = ss.accept();
			System.out.println(s.getInetAddress().getHostAddress() + "...connet");
			// 2,源：socket输入流 读取客户端发来的数据。
			BufferedReader bufr = new BufferedReader(new InputStreamReader(s.getInputStream()));
			// 3，目的： socket输出流。将转成0大写发送给客户端。
			PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
			// 4，频繁的读写操作。
			String line = null;
			while ((line = bufr.readLine()) != null) {
				if(line.equals("886")){
					break;
				}
				System.out.println(line);
				//将读取到的数据转为大写返回服务端
				pw.println(line.toUpperCase());
				
			}
			s.close();
		}
	}

}
