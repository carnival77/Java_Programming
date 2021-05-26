package day18.basic.client;

import java.net.Socket;

public class ClientMain {
	public static void main(String[] args) {
		try {
			Socket soc = new Socket("192.168.3.101", 3000);
			
			new ClientReceiveThread(soc).start();
			new ClientSendThread(soc).start();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
