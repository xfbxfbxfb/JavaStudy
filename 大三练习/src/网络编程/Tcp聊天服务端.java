package ������;
/*
 * �˴�ʵ�鷢��һ�����⣬����buffere..ʱ��һ�ж�д���Բ���һ��дһ�ж��������PrintWrite֮����ˢ�¡�
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

public class Tcp�������� {
	public static void main(String[] args) throws IOException {
		// ����ServerSocket���ڼ����˿�
		ServerSocket ss = new ServerSocket(10000);
		System.out.println("���������....");
		int count =0;
		while (true) {
			Socket s = ss.accept();// �ȴ��ͻ��˽ӽ�
			count++;
			
			String ip = s.getInetAddress().getHostName();
			System.out.println(ip + "  �����������Ѿ���"+count+"�˼��������ң�");
			// ���տͻ�����Ϣ
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
				
			
				// ��������
				//�������ݴ���
				System.out.println("����ˣ�");
				BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
				//String buf = in.next();
				OutputStream out = s.getOutputStream();
				String lien = buf.readLine();
				byte[] len = lien.getBytes();
				out.write(len);
				// ��������
				InputStream in = s.getInputStream();
				byte[] buf1 = new byte[1024];
				int len1 = in.read(buf1);
				String text = new String(buf1, 0, buf1.length);
				String ip = s.getInetAddress().getHostName();
				System.out.println("�ͻ��ˣ�"+ip + text);
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
//				// System.out.println("�ͻ��� " + ip + " ���� " + text);
//				// break;
//
//			} catch (IOException e) {
//
//			}
//
//		}
//	}
//}

