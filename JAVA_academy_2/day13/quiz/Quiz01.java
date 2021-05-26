package day13.quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


class Timer implements Runnable {
	boolean isRun = true;
	int i = 1;
	@Override
	public void run() {
		try {
			while(isRun) {
				System.out.println(i++ + "초");
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class Quiz01 {
	public static void main(String[] args) {
		// Wildlife.wmv의 복사본 myVideo.wmv 생성
		// + Thread 추가 ( Timer 기능 )
		// 복사 완료 후 몇 초 소요됐는지도 출력
		FileInputStream fIn = null;
		FileOutputStream fOut = null;
		Timer t = new Timer();
		new Thread(t).start();
		
		try {
			fIn = new FileInputStream("Wildlife.wmv");
			fOut = new FileOutputStream("myVideo.wmv");
			
//			int data;
//			while(true) {
//				data = fIn.read();
//				if(data == -1) {
//					break;
//				}
//				fOut.write(data);
//			}
			File f = new File("Wildlife.wmv"); 
			byte[] arr = new byte[(int)f.length()];
			fIn.read(arr); // fIn의 데이터를 arr에 저장 
			fOut.write(arr); // arr의 데이터를 fOut에 보내기
			
			t.isRun = false;
			System.out.println("복사 완료! 총 " + t.i + "초 소요");
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
