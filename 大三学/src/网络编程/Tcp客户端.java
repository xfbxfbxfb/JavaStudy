package ������;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * ˼·
 * 1,�����ͻ���socket�󶨷���˵ĵ�ַ�Ͷ˿ڡ�
 * 2�����ӳɹ�����socket io �����ͻ�Ҫ�����ǻ�ȡio���е�������������ݷ��ͷ���ˡ�
 * 3��ͨ��socket ��������͸�����ˡ�
 * 4���ر���Դ
 */

public class Tcp�ͻ��� {
	public static void main(String[] args) throws IOException {
////		 1,�����ͻ���socket�󶨷���˵ĵ�ַ�Ͷ˿ڡ�
	Socket s = new Socket("127.0.0.1",10000);
//		 2�����ӳɹ�����socket io �����ͻ�Ҫ�����ǻ�ȡio���е�������������ݷ��ͷ���ˡ�
		OutputStream out = s.getOutputStream();
		String text = "tcp����";
		//byte [] buf = text.getBytes();
		out.write(text.getBytes());
//		 3��ͨ��socket ��������͸�����ˡ�
	
//		 4���ر���Դ
		s.close();
		
		
	}

}
