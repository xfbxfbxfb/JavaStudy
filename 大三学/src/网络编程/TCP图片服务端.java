package 网络编程;
/*
 * 内容：
 * 将一个文件夹的图片或者文本进行上传，并实现客户端并发访问；
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

public class TCP图片服务端 {
	public static void main(String[] args) throws IOException {
		System.out.println("上传图片服务端启动...");
		// 创建服务端Socket用来监听端口
		ServerSocket ss = new ServerSocket(10000);
		
		while(true){
		// 接收
		Socket s = ss.accept();
		new Thread(new download(s)).start();
		
		}
		
	}

}
