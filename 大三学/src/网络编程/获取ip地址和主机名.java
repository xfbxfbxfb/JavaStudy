package ������;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ��ȡip��ַ�������� {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress ip = InetAddress.getLocalHost();
		System.out.println(ip.getHostAddress()+"   :  "+ip.getHostName());
	}
}
