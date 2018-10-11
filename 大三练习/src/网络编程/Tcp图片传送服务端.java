package 网络编程;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Tcp图片传送服务端 {
	public static void main(String[] args) throws IOException {
		System.out.println("上传图片服务端启动中.....");
		// 创建服务端ServerSocket用于监听端口
		ServerSocket ss = new ServerSocket(10000);
		new Thread(new updown(ss)).start();

	}
}

class updown implements Runnable {
	private ServerSocket ss;

	public updown(ServerSocket ss) {
		super();
		this.ss = ss;
	}

	@Override
	public void run() {
		while (true) {
			try {
				// 接收客户端
				Socket s = ss.accept();
				String ip = s.getInetAddress().getHostAddress();
				System.out.println(ip + "....connect");
				// 读取图片数据
				InputStream in = s.getInputStream();
				// 创建图片保存目录
				File f1 = new File("e://java图片");
				if (!f1.exists()) {
					f1.mkdirs();
				}
				int count = 0;
				// 将文件命名
				File f2 = new File(f1, "美女.jpg");
				while (f2.exists()) {
					count++;
					f2 = new File(f1, "美女(" + count + ").jpg");
				}
				// 将图片写入
				FileOutputStream fout = new FileOutputStream(f2);
				byte[] buf = new byte[1024];
				int len = 0;
				while ((len = in.read(buf)) != -1) {
					fout.write(buf, 0, len);
				}
				// 对客户端进行反馈
				OutputStream out = s.getOutputStream();
				out.write("上传成功".getBytes());
				// 关闭资源
				s.close();
				fout.close();
			} catch (IOException e) {

			}
		}
	}

}
