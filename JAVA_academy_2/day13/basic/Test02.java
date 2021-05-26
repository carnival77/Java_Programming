package day13.basic;

import java.io.File;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) {
		/*
		 * < File >
		 * 파일시스템의 파일/디렉토리를 생성/삭제/조회 등 할 때 
		 * 사용하는 클래스
		 * 
		 */
		File f1 = new File("/");
		System.out.println(f1);
		System.out.println(f1.isFile());
		System.out.println(f1.isDirectory());
		
		File[] files = f1.listFiles();
		for(File ff : files) {
			System.out.print( ff.isFile() ? "파일 : " : "디렉토리 : ");
			System.out.println( ff.getName());
		}
		
		// 폴더 생성 : mkdir
		File f2 = new File("/메롱");
		if(f2.mkdir()) {
			System.out.println("폴더 생성 완료!");
		}
		else {
			System.out.println("폴더 생성 실패..");
		}
		
		
		if(f2.delete()) {
			System.out.println("삭제 성공");
		}
		else {
			System.out.println("삭제 실패");
		}
		// 주의! 디렉토리 delete() ==> 디렉토리 안에 아무것도 없어야 함 
		//      파일 delete() ==> 파일 안에 아무 내용도 없어야 함
		
		File f3 = new File("../../");
		System.out.println(f3.getAbsolutePath());
		try {
			System.out.println(f3.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}




