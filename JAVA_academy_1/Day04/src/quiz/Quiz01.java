package quiz;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		// 'Scanner' + ctrl + sp 
		Scanner sc = new Scanner(System.in); 
		int num; 
		
		System.out.println("초 : ");
		num = sc.nextInt(); // 입력받은 데이터를 int형으로 인식하고, 		
							// 그 값을 num에 저장
		System.out.println(num + "초를 입력하셨습니다.");
		// XX분 XX초입니다.
		System.out.println( num/60 + "분 " + num%60 + "초");
	
	}
}

