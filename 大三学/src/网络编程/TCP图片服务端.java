package ������;
/*
 * ���ݣ�
 * ��һ���ļ��е�ͼƬ�����ı������ϴ�����ʵ�ֿͻ��˲������ʣ�
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPͼƬ����� {
	public static void main(String[] args) throws IOException {
		System.out.println("�ϴ�ͼƬ���������...");
		// ���������Socket���������˿�
		ServerSocket ss = new ServerSocket(10000);
		
		while(true){
		// ����
		Socket s = ss.accept();
		new Thread(new download(s)).start();
		
		}
		
	}

}
