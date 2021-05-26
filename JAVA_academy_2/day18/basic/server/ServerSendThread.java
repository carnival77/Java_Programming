package day18.basic.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ServerSendThread extends Thread{
	private Socket c_socket; // 상대 클라이언트의 소켓
	
	// 생성자 
	public ServerSendThread(Socket s) {
		c_socket = s; 
	}
	
	// run() 오버라이드
	@Override
	public void run() {
		BufferedReader br = null; // 서버 사람이 입력할 Scanner 대용
		BufferedWriter bw = null; // c_socket 측에 보낼 때 쓸 스트림
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(c_socket.getOutputStream()));
			
			String sendMessage;
			
			while(true) {
				System.out.print("나(서버) : ");
				sendMessage = br.readLine(); // 서버 사람에게 입력 받기
				bw.write(sendMessage); // 클라이언트 소켓에 보내기
				bw.newLine();
				bw.flush();
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("서버 종료.. ");
			try {
				if(bw != null) { bw.close(); }
				if(br != null) { br.close(); }
			} catch(Exception e) { 
				e.printStackTrace();
			}
		}
	}
}




