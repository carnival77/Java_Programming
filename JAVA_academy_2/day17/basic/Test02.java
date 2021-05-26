package day17.basic;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/*
 * Server-client ���
 * 
 *  
 */
public class Test02 { // ���� ���α׷�
	public static void main(String[] args) {
		System.out.println("���� ����...");
		System.out.println("Ŭ���̾�Ʈ ��ٸ��� ��...");
		ServerSocket sSocket = null;
		
		Socket clientSocket = null; // Ŭ���̾�Ʈ ���� ���� ������
		
		
		// Ŭ���̾�Ʈ���� �����͸� ������ outputStream
		BufferedWriter out = null;
		
		// Ŭ���̾�Ʈ�κ��� �����͸� ���� inputStream
		BufferedReader in = null;
		
		Scanner sc = new Scanner(System.in);
		try {
			sSocket = new ServerSocket(3000);
			
			// Ŭ���̾�Ʈ ���� ��� 
			clientSocket = sSocket.accept();
			
			System.out.println("Ŭ���̾�Ʈ ���� ����!!!" + clientSocket.getInetAddress());
			out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			
			String fromClient = null;
			while( (fromClient = in.readLine()) != null ) {
				System.out.println("from client : " + fromClient);
				System.out.print("�Է� : ");
				String s = sc.next();
				
				out.write(s);
				out.newLine();
				out.flush();
				System.out.println("Ŭ���̾�Ʈ���� �ݻ� ����!!");
			}
			System.out.println("Ŭ���̾�Ʈ�� ���� ����..");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if( in != null ) {
					in.close();
				}
				if( out != null) {
					out.close();
				}
				if(sSocket != null) {
					sSocket.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}




