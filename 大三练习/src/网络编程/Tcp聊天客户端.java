package 网络编程;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;

import java.net.Socket;
import java.util.Scanner;

public class Tcp聊天客户端 {
	public static void main(String[] args) throws IOException {
		System.out.println("客户端启动。。。");
		// 创建Socket用于绑定服务端地址和端口
		Socket s = new Socket("127.0.0.1", 10000);
		// 发送数据
		//new Thread(new send1(s)).start();
		// 接收数据
		new Thread(new resive1(s)).start();

	}
}

class resive1 implements Runnable {
	private Socket s;

	public resive1(Socket s) {
		super();
		this.s = s;
	}
	Scanner in =new Scanner(System.in);
	@Override
	public void run() {
		while (true) {
			try {
			
				InputStream in = s.getInputStream();
				byte[] buf1 = new byte[1024];
				int len1 = in.read(buf1);
				String text1 = new String(buf1, 0, buf1.length);
				String ip = s.getInetAddress().getHostName();
				System.out.println("服务端："+ip + text1);
				// 发送数据
				// 创建新的打印流，打印到发送到套字节socket.
				System.out.println("客户端：");
				BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
				OutputStream out = s.getOutputStream();
				String text = buf.readLine();
				byte[] len = text.getBytes();
				out.write(len);

//				//// 判断是否继续聊天
//				if (line.equals("886")) {
//					System.out.println("中止聊天");
//					s.close();
//					bu.close();
//					break;

				
			} catch (IOException e) {

			}
		}
	}
}

//class send1 implements Runnable {
//	private Socket s;
//
//	public send1(Socket s) {
//		super();
//		this.s = s;
//	}
//
//	// Scanner in = new Scanner(System.in);
//	@Override
//	public void run() {
//		while (true) {
//			try {
//				System.out.println("客户端：");
//				BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
//				// PrintWriter pw = new PrintWriter(s.getOutputStream());
//				OutputStream out = s.getOutputStream();
//
//				// String text = in.next();
//
//				byte[] len = buf.readLine().getBytes();
//
//				out.write(len);
//
//			} catch (IOException e) {
//
//			}
//		}
//	}
//
//}