package 网络编程;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class udp聊天室 {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds1 = new DatagramSocket();// 发送端
		DatagramSocket ds2 = new DatagramSocket(10000);// 接收端
		sendd s = new sendd(ds1);
		resive r = new resive(ds2);
		Thread t1 = new Thread(s);
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();

	}

}

// *发送端*/
class sendd implements Runnable {
	// 初始化插座
	private DatagramSocket ds;

	public sendd(DatagramSocket ds) {
		super();
		this.ds = ds;
	}

	@Override
	public void run() {
		System.out.println("udp开始");
		try {
			// 键盘录入
			BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
			String text = null;
			while ((text = buf.readLine()) != null) {

				// 字符流转为字节流
				byte[] b = text.getBytes();
				// 打包发送给指定ip,端口
				DatagramPacket dp = new DatagramPacket(b, b.length, 
						InetAddress.getByName("192.168.0.3"), 10000);
				// 发送包
				ds.send(dp);
				if(text.equals("886")){
					break;
					
				}

			}
			ds.close();
		} catch (IOException e) {

		}
		ds.close();
	}

}

// 接收端
class resive implements Runnable {
	private DatagramSocket ds;

	public resive(DatagramSocket ds) {
		super();
		this.ds = ds;
	}

	@Override
	public void run() {
		while (true) {
			try {
				// 建立数据包储存数据
				byte[] buf = new byte[1024];
				DatagramPacket dp = new DatagramPacket(buf, buf.length);

				ds.receive(dp);//接收等待

				// 解析数据包,截取1024中有效的数据
				String text = new String(dp.getData(), 0, dp.getLength());
				// 获取对方的ip和端号
				String ip = dp.getAddress().getHostAddress();
				int port = dp.getPort();
				System.out.println(ip + "  " + port + "  " + text);

				if (text.equals("886"))
					System.out.println(ip + "....离开");

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
