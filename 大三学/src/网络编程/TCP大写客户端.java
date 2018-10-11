package 网络编程;
/*
 * 思路：
 * 		1，创建socket，明确地址和端口
 * 		2，源:键盘录入，获取需要转换的数据。
 * 		3，目的：网络,socket输出流。将录入的数据发送到服务端。
 * 		4，源：socket,socket读取流，读取服务端发回来的大写数据。
 * 		5，目的： 客户端显示器，将大写数据显示出来。
 * 		6，频繁的读写操作
 * 		7，关闭资源。
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TCP大写客户端 {
	public static void main(String[] args) throws IOException {
		// 1，创建socket，明确地址和端口
		Socket s = new Socket("127.0.0.1", 10002);
		// 2，源:键盘录入，获取需要转换的数据。
		while (true) {
			System.out.println("客户端启动..");
			BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
			// 3，目的：网络,socket输出流。将录入的数据发送到服务端。
			PrintWriter pw = new PrintWriter(s.getOutputStream(), true);//true是不断刷新
			// 4，源：socket,socket读取流，读取服务端发回来的大写数据。
			BufferedReader bufin = new BufferedReader(new InputStreamReader(s.getInputStream()));
			// 5，目的： 客户端显示器，将大写数据显示出来。
			String text = null;
			while ((text = bufr.readLine()) != null) {
				if(text.equals("886")){
					break;
				}
				pw.println(text);
				String hui = bufin.readLine();
				System.out.print(hui);
			}
			// 7，关闭资源。
			s.close();

		}
	}

}
