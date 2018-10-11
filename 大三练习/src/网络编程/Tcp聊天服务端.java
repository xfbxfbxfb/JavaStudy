package 网络编程;
/*
 * 此次实验发现一个问题，当用buffere..时是一行读写所以不能一行写一行读，最好用PrintWrite之中有刷新。
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Tcp聊天服务端 {
	public static void main(String[] args) throws IOException {
		// 创建ServerSocket由于监听端口
		ServerSocket ss = new ServerSocket(10000);
		System.out.println("服务端启动....");
		int count =0;
		while (true) {
			Socket s = ss.accept();// 等待客户端接近
			count++;
			
			String ip = s.getInetAddress().getHostName();
			System.out.println(ip + "  加入聊天室已经有"+count+"人加入聊天室！");
			// 接收客户端信息
			//new Thread(new resive(s)).start();
			 new Thread(new send(s)).start();

		}

	}

}
class send implements Runnable {
	private Socket s;

	public send(Socket s) {
		super();
		this.s = s;
	}

	Scanner in = new Scanner(System.in);

	@Override
	public void run() {
		while (true) {
			try {
				
			
				// 发送数据
				//发送数据代码
				System.out.println("服务端：");
				BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
				//String buf = in.next();
				OutputStream out = s.getOutputStream();
				String lien = buf.readLine();
				byte[] len = lien.getBytes();
				out.write(len);
				// 接收数据
				InputStream in = s.getInputStream();
				byte[] buf1 = new byte[1024];
				int len1 = in.read(buf1);
				String text = new String(buf1, 0, buf1.length);
				String ip = s.getInetAddress().getHostName();
				System.out.println("客户端："+ip + text);
			} catch (IOException e) {

			}
		}

	}

}

//class resive implements Runnable {
//	private Socket s;
//
//	public resive(Socket s) {
//		super();
//		this.s = s;
//	}
//
//	Scanner in = new Scanner(System.in);
//
//	@Override
//	public void run() {
//		while (true) {
//			try {
//				InputStream in = s.getInputStream();
//				byte[] buf = new byte[1024];
//				int len = in.read(buf);
//				String text = new String(buf, 0, buf.length);
//				// BufferedReader buf = new BufferedReader(new
//				// InputStreamReader(s.getInputStream()));
//				// String text = null;
//				// text = buf.readLine();
//				// while(text!=null){
//				// String ip = s.getInetAddress().getHostName();
//				// System.out.println("客户端 " + ip + " 发来 " + text);
//				// break;
//
//			} catch (IOException e) {
//
//			}
//
//		}
//	}
//}

