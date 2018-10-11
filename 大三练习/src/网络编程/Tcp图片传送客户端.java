package 网络编程;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;


public class Tcp图片传送客户端 {
	public static void main(String[] args) throws IOException {
		
		//创建服务端Socket用于绑定服务端地址和端口
		Socket s = new Socket("127.0.0.1",10000);
		System.out.println("上传图片客户端启动中.....");
		//读取图片文件
		File fi = new File("tempfile\\1.jpg");
		FileInputStream fin = new FileInputStream(fi);
		
		//向服务端发送图片
		OutputStream out = s.getOutputStream();
		byte[] buf = new byte[1024];
		int len = 0;
		while((len=fin.read(buf))!=-1){
			out.write(buf,0,len);
		}
		s.shutdownOutput();
		//接收服务端返回的数据
			BufferedReader bufr = new BufferedReader( new InputStreamReader(s.getInputStream()));
			String text = bufr.readLine();
			System.out.println(text);
		//关闭资源
			s.close();
			fin.close();
		
	}

}
