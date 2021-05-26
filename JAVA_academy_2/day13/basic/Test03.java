package day13.basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test03 {
	public static void main(String[] args) {
		// 원본으로부터 데이터 들어올 inputStream
		// 복사본에게 데이터를 내보낼 outputStream
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
			System.out.println("복사 완료!");
		} catch(FileNotFoundException e) {
			System.out.println("잘못된 파일이름 혹은 경로");
		} catch(IOException e){
			System.out.println("스트림 문제 발생!!");
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
