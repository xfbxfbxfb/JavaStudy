package ������;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;

/*
 *  
 */
public class Udpsend {
		public static void main(String[] args) throws IOException {
			DatagramSocket ds = new DatagramSocket();//����udp��socket
		/*	//����¼��
			InputStream i = System.in;
			//���ֽ���תΪ�ַ���
			InputStreamReader ins = new InputStreamReader(i);
			//�����ݽ��л���
			BufferedReader bf = new BufferedReader(ins);
			*/
			//ǰ����תΪһ��
			System.out.println("���Ͷ�");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			byte[] buf = br.readLine().getBytes();
			DatagramPacket  dp = new DatagramPacket(buf,buf.length,InetAddress.getByName("127.0.0.1"),10000);
			ds.send(dp);
		}
}
