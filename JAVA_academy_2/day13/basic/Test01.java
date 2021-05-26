package day13.basic;

import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		try {
			FileInputStream fIn = new FileInputStream("log.txt");
			Scanner sc = new Scanner(fIn);
//			System.out.println(sc.nextLine());
//			System.out.println(sc.nextLine());
//			System.out.println(sc.nextLine());
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
			fIn.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
