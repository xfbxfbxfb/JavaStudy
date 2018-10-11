package 网络编程;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class udp聊天室老师 {

	/**
	 * @param args
	 * @throws SocketException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws SocketException{
		
		DatagramSocket sendSocket = new DatagramSocket();
		DatagramSocket receSocket = new DatagramSocket(10002);
		
		
		Send send = new Send(sendSocket);
		Rece rece = new Rece(receSocket);
		
		
		Thread t1 = new Thread(send);
		Thread t2 = new Thread(rece);
		t1.start();
		t2.start();
	}

}


class Send implements Runnable {

	private DatagramSocket ds;

	public Send(DatagramSocket ds) {
		super();
		this.ds = ds;
	}

	@Override
	public void run() {
		try {
			BufferedReader bufr = new BufferedReader(new InputStreamReader(
					System.in));
			String line = null;
			while ((line = bufr.readLine()) != null) {
				byte[] buf = line.getBytes();
				DatagramPacket dp = new DatagramPacket(buf, buf.length,
						InetAddress.getByName("192.168.0.13"), 10000);
				ds.send(dp);
				if ("886".equals(line)) {
					break;
				}
			}

			ds.close();
		} catch (IOException e) {

		}
	}
}


class Rece implements Runnable {

	private DatagramSocket ds;

	public Rece(DatagramSocket ds) {
		super();
		this.ds = ds;
	}

	@Override
	public void run() {
		while (true) {

			try {
				byte[] buf = new byte[1024];
				DatagramPacket dp = new DatagramPacket(buf, buf.length);
				ds.receive(dp);
				
				String ip = dp.getAddress().getHostAddress();
				int port = dp.getPort();
				String text = new String(dp.getData(), 0, dp.getLength());
				System.out.println(ip + ":" + port + ":" + text);
				if(text.equals("886")){
					System.out.println(ip+"....");
				}
			} catch (IOException e) {

			}
		}

	}

}

