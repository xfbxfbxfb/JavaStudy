package ������;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpͼƬ���ͷ���� {
	public static void main(String[] args) throws IOException {
		System.out.println("�ϴ�ͼƬ�����������.....");
		// ���������ServerSocket���ڼ����˿�
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
				// ���տͻ���
				Socket s = ss.accept();
				String ip = s.getInetAddress().getHostAddress();
				System.out.println(ip + "....connect");
				// ��ȡͼƬ����
				InputStream in = s.getInputStream();
				// ����ͼƬ����Ŀ¼
				File f1 = new File("e://javaͼƬ");
				if (!f1.exists()) {
					f1.mkdirs();
				}
				int count = 0;
				// ���ļ�����
				File f2 = new File(f1, "��Ů.jpg");
				while (f2.exists()) {
					count++;
					f2 = new File(f1, "��Ů(" + count + ").jpg");
				}
				// ��ͼƬд��
				FileOutputStream fout = new FileOutputStream(f2);
				byte[] buf = new byte[1024];
				int len = 0;
				while ((len = in.read(buf)) != -1) {
					fout.write(buf, 0, len);
				}
				// �Կͻ��˽��з���
				OutputStream out = s.getOutputStream();
				out.write("�ϴ��ɹ�".getBytes());
				// �ر���Դ
				s.close();
				fout.close();
			} catch (IOException e) {

			}
		}
	}

}
