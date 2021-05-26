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
				System.out.println(i++ + "��");
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class Quiz01 {
	public static void main(String[] args) {
		// Wildlife.wmv�� ���纻 myVideo.wmv ����
		// + Thread �߰� ( Timer ��� )
		// ���� �Ϸ� �� �� �� �ҿ�ƴ����� ���
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
			fIn.read(arr); // fIn�� �����͸� arr�� ���� 
			fOut.write(arr); // arr�� �����͸� fOut�� ������
			
			t.isRun = false;
			System.out.println("���� �Ϸ�! �� " + t.i + "�� �ҿ�");
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
