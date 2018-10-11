package 网络编程;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class TCP图片客户端 {
		public static void main(String[] args) throws  IOException {
			System.out.println("客户端启动...");
			//创建客户端Socket用于链接服务端的地址和端口
			Socket  s = new Socket("192.168.0.14",10000);
			
			//读取源图片
			File fp = new File("tempfile//2.jpg");
			FileInputStream fin = new FileInputStream(fp);
			
			//目的是Socket的输出流
			OutputStream out = s.getOutputStream();
			byte[] buf = new byte[1024];
			int len = 0;
			while((len=fin.read(buf))!=-1){
				out.write(buf,0,len); 
			}
			//告诉服务端不要等着读了
			s.shutdownOutput();//结束标志
			//接收服务端返回数据
//			InputStream in= s.getInputStream();
//			byte[] bufin =new byte[1024];
//			int lenin = in.read(bufin);
//			System.out.println(new String(bufin,0,lenin));
			BufferedReader bufr = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String tt = bufr.readLine();
			System.out.println(tt);
			//关闭资源
			s.close();
			fin.close();
		}
}
