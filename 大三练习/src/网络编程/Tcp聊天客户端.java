package ������;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;

import java.net.Socket;
import java.util.Scanner;

public class Tcp����ͻ��� {
	public static void main(String[] args) throws IOException {
		System.out.println("�ͻ�������������");
		// ����Socket���ڰ󶨷���˵�ַ�Ͷ˿�
		Socket s = new Socket("127.0.0.1", 10000);
		// ��������
		//new Thread(new send1(s)).start();
		// ��������
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
				System.out.println("����ˣ�"+ip + text1);
				// ��������
				// �����µĴ�ӡ������ӡ�����͵����ֽ�socket.
				System.out.println("�ͻ��ˣ�");
				BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
				OutputStream out = s.getOutputStream();
				String text = buf.readLine();
				byte[] len = text.getBytes();
				out.write(len);

//				//// �ж��Ƿ��������
//				if (line.equals("886")) {
//					System.out.println("��ֹ����");
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
//				System.out.println("�ͻ��ˣ�");
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