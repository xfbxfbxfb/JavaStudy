package 网络编程;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpCS {
	public static void main(String[] args) throws IOException, InterruptedException {
		ServerSocket ss = new ServerSocket(10000);
		Socket s = new Socket("127.0.0.1", 10000);
		
		server ser = new server(ss);
		client c = new client(s);

		System.out.println("服务端启动。。。");
		Thread t1 = new Thread(ser);
		t1.start();
		Thread.sleep(1000);
		System.out.println("客户端启动。。。");
		Thread t2 = new Thread(c);
		t2.start();

	}
}

// 服务端线程
class server implements Runnable {
	private ServerSocket ss;

	public server(ServerSocket ss) {
		super();
		this.ss = ss;
	}

	@Override
	public void run() {

		try {

			while (true) {
				Socket s = ss.accept();// 监听等待
				String ip = s.getInetAddress().getHostName();
				int port = s.getPort();
				System.out.println(ip + "加入聊天室！");

				// 得到输入流，转为字符流，进行缓存
				// BufferedReader br = new BufferedReader(new
				// InputStreamReader(s.getInputStream()));
				// // 读取一行
				// String text = br.readLine();
				while (true) {
					InputStream in = s.getInputStream();// 获取输入流
					byte[] buf = new byte[1024];// 储存字节流
					in.read(buf);// 读字节流
					String text = new String(buf, 0, buf.length);// 将字节流转为字符串

					System.out.println(ip + "  " + "端口:" + port + "客户端：" + text);
				}
			}
		} catch (IOException e) {

		}
	}
}

// 客户端线程
class client implements Runnable {
	private Socket s ;
	public client(Socket s) {
		super();
		this.s = s;
	}
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
				System.out.println("客户端：");
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String text = br.readLine();
				OutputStream out = s.getOutputStream();
				byte[] buf = text.getBytes();
				out.write(buf);
				// OutputStream out = s.getOutputStream();
				// String text = "你好~";
				// byte[] buf = text.getBytes();
				// out.write(buf);

			} catch (IOException e) {

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
