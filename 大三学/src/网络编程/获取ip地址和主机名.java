package 网络编程;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class 获取ip地址和主机名 {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress ip = InetAddress.getLocalHost();
		System.out.println(ip.getHostAddress()+"   :  "+ip.getHostName());
	}
}
