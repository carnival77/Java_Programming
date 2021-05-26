package day17.basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import javax.swing.JOptionPane;

// Ŭ���̾�Ʈ ���α׷�
public class Test03 {
	public static void main(String[] args) {
		Socket socket = null;
		BufferedReader reader = null;
		BufferedWriter writer = null;
		try {
			socket = new Socket("192.168.3.101", 3000);
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			String input = "";
			while(!input.equals("exit")) {
				input = JOptionPane.showInputDialog("�������� ���� �޽��� (����:exit)");
				writer.write(input);
				writer.newLine();
				writer.flush();
				
				String fromServer = reader.readLine();
				JOptionPane.showMessageDialog(null, "���ƿ� �޽��� : " + fromServer);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(reader != null) { reader.close(); }
				if(writer != null) { writer.close(); }
				if(socket != null) { socket.close(); }
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
