package ������;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * ˼·��
 * 	1,���������socket ,��ȷ��;
 *  2,Դ��socket������  ��ȡ�ͻ��˷��������ݡ�
 *  3��Ŀ�ģ� socket���������ת�ɴ�д���͸��ͻ��ˡ�
 *  4��Ƶ���Ķ�д������
 */

public class TCP��д����� {
	public static void main(String[] args) throws IOException {
		System.out.println("���������.....");
		// 1,���������socket ,��ȷ��;
		ServerSocket ss = new ServerSocket(10002);
		while (true) {
			
			Socket s = ss.accept();
			System.out.println(s.getInetAddress().getHostAddress() + "...connet");
			// 2,Դ��socket������ ��ȡ�ͻ��˷��������ݡ�
			BufferedReader bufr = new BufferedReader(new InputStreamReader(s.getInputStream()));
			// 3��Ŀ�ģ� socket���������ת��0��д���͸��ͻ��ˡ�
			PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
			// 4��Ƶ���Ķ�д������
			String line = null;
			while ((line = bufr.readLine()) != null) {
				if(line.equals("886")){
					break;
				}
				System.out.println(line);
				//����ȡ��������תΪ��д���ط����
				pw.println(line.toUpperCase());
				
			}
			s.close();
		}
	}

}
