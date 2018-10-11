package ������;

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

		System.out.println("���������������");
		Thread t1 = new Thread(ser);
		t1.start();
		Thread.sleep(1000);
		System.out.println("�ͻ�������������");
		Thread t2 = new Thread(c);
		t2.start();

	}
}

// ������߳�
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
				Socket s = ss.accept();// �����ȴ�
				String ip = s.getInetAddress().getHostName();
				int port = s.getPort();
				System.out.println(ip + "���������ң�");

				// �õ���������תΪ�ַ��������л���
				// BufferedReader br = new BufferedReader(new
				// InputStreamReader(s.getInputStream()));
				// // ��ȡһ��
				// String text = br.readLine();
				while (true) {
					InputStream in = s.getInputStream();// ��ȡ������
					byte[] buf = new byte[1024];// �����ֽ���
					in.read(buf);// ���ֽ���
					String text = new String(buf, 0, buf.length);// ���ֽ���תΪ�ַ���

					System.out.println(ip + "  " + "�˿�:" + port + "�ͻ��ˣ�" + text);
				}
			}
		} catch (IOException e) {

		}
	}
}

// �ͻ����߳�
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
				System.out.println("�ͻ��ˣ�");
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String text = br.readLine();
				OutputStream out = s.getOutputStream();
				byte[] buf = text.getBytes();
				out.write(buf);
				// OutputStream out = s.getOutputStream();
				// String text = "���~";
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
