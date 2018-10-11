package ������;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class udp������ {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds1 = new DatagramSocket();// ���Ͷ�
		DatagramSocket ds2 = new DatagramSocket(10000);// ���ն�
		sendd s = new sendd(ds1);
		resive r = new resive(ds2);
		Thread t1 = new Thread(s);
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();

	}

}

// *���Ͷ�*/
class sendd implements Runnable {
	// ��ʼ������
	private DatagramSocket ds;

	public sendd(DatagramSocket ds) {
		super();
		this.ds = ds;
	}

	@Override
	public void run() {
		System.out.println("udp��ʼ");
		try {
			// ����¼��
			BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
			String text = null;
			while ((text = buf.readLine()) != null) {

				// �ַ���תΪ�ֽ���
				byte[] b = text.getBytes();
				// ������͸�ָ��ip,�˿�
				DatagramPacket dp = new DatagramPacket(b, b.length, 
						InetAddress.getByName("192.168.0.3"), 10000);
				// ���Ͱ�
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

// ���ն�
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
				// �������ݰ���������
				byte[] buf = new byte[1024];
				DatagramPacket dp = new DatagramPacket(buf, buf.length);

				ds.receive(dp);//���յȴ�

				// �������ݰ�,��ȡ1024����Ч������
				String text = new String(dp.getData(), 0, dp.getLength());
				// ��ȡ�Է���ip�Ͷ˺�
				String ip = dp.getAddress().getHostAddress();
				int port = dp.getPort();
				System.out.println(ip + "  " + port + "  " + text);

				if (text.equals("886"))
					System.out.println(ip + "....�뿪");

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
