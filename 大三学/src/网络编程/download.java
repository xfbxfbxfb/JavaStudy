package 网络编程;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class download implements Runnable {
private Socket s ;
	public download(Socket s) {
	super();
	this.s = s;
}
	@Override
	public void run() {
		try{
		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip+"....connet");

		// 读取图片数据
		InputStream in = s.getInputStream();

		// 写图片数据到文件
		
		//创建目录
		File dir = new File("E://java上传图片");
		if(!dir.exists()){
			dir.mkdirs();
		}
		int count = 0;
		//将文件命名
		File f1 = new File(dir,ip+".jpg");
		while(f1.exists()){
			count++;
			f1= new File(dir,ip+"("+count+")"+".jpg");
		}
		FileOutputStream fpic = new FileOutputStream(f1);
		
		byte[] buf = new byte[1024];
		int len = 0;
		while((len=in.read(buf))!=-1){
			fpic.write(buf, 0, len);
		}
		//s.shutdownOutput();
		//返回客户端信息
		OutputStream out = s.getOutputStream();
		out.write("上传成功".getBytes());
		
		//关闭资源
		s.close();
		fpic.close();
		}catch(IOException e){
			
		}
	}

}
