package day13.basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test03 {
	public static void main(String[] args) {
		// �������κ��� ������ ���� inputStream
		// ���纻���� �����͸� ������ outputStream
		FileInputStream fIn = null;
		FileOutputStream fOut = null;
		try {
			fIn = new FileInputStream("sample.jpg");
			fOut = new FileOutputStream("copied.jpg");
			
			int data;
			while(true) {
				data = fIn.read();
				if(data == -1) {
					break;
				}
				fOut.write(data);
			}
			System.out.println("���� �Ϸ�!");
		} catch(FileNotFoundException e) {
			System.out.println("�߸��� �����̸� Ȥ�� ���");
		} catch(IOException e){
			System.out.println("��Ʈ�� ���� �߻�!!");
		} finally {
			try {
				if(fIn != null) {
					fIn.close();
				}
				if(fOut != null) {
					fOut.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
			
		
	}
}
