package ������;
/*
 * ˼·��
 * 		1������socket����ȷ��ַ�Ͷ˿�
 * 		2��Դ:����¼�룬��ȡ��Ҫת�������ݡ�
 * 		3��Ŀ�ģ�����,socket���������¼������ݷ��͵�����ˡ�
 * 		4��Դ��socket,socket��ȡ������ȡ����˷������Ĵ�д���ݡ�
 * 		5��Ŀ�ģ� �ͻ�����ʾ��������д������ʾ������
 * 		6��Ƶ���Ķ�д����
 * 		7���ر���Դ��
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TCP��д�ͻ��� {
	public static void main(String[] args) throws IOException {
		// 1������socket����ȷ��ַ�Ͷ˿�
		Socket s = new Socket("127.0.0.1", 10002);
		// 2��Դ:����¼�룬��ȡ��Ҫת�������ݡ�
		while (true) {
			System.out.println("�ͻ�������..");
			BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
			// 3��Ŀ�ģ�����,socket���������¼������ݷ��͵�����ˡ�
			PrintWriter pw = new PrintWriter(s.getOutputStream(), true);//true�ǲ���ˢ��
			// 4��Դ��socket,socket��ȡ������ȡ����˷������Ĵ�д���ݡ�
			BufferedReader bufin = new BufferedReader(new InputStreamReader(s.getInputStream()));
			// 5��Ŀ�ģ� �ͻ�����ʾ��������д������ʾ������
			String text = null;
			while ((text = bufr.readLine()) != null) {
				if(text.equals("886")){
					break;
				}
				pw.println(text);
				String hui = bufin.readLine();
				System.out.print(hui);
			}
			// 7���ر���Դ��
			s.close();

		}
	}

}
