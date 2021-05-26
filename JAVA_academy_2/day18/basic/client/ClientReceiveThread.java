package day18.basic.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientReceiveThread extends Thread {
	private Socket c_socket; // 자신의 소켓
	
	// 생성자 
	public ClientReceiveThread(Socket s) {
		c_socket = s; 
	}
	
	// run() 오버라이드
	@Override
	public void run() {
		BufferedReader br = null; // 클라이언트로부터 메시지를 받을 스트림
		
		try {
			br = new BufferedReader(new InputStreamReader(c_socket.getInputStream()));
			
			String receivedMessage;
			
			while(true) {
				receivedMessage = br.readLine();
				System.out.println("상대(서버) : " + receivedMessage);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("클라이언트 종료.. ");
			try {
				if(br != null) { br.close(); }
			} catch(Exception e) { 
				e.printStackTrace();
			}
		}
	}
}
