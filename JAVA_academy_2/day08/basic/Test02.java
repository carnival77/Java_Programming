package day08.basic;

import java.util.ArrayList;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		ArrayList<Pokemon> list = new ArrayList<Pokemon>();
		// <> : Generic 
		// ==> <Pokemon>의 의미 : Object가 아닌 Pokemon형으로 원소를 취급하라!
		// ==> < 참조자료형 > 
		//     <int> (X) 
		//     <Integer> (O)
		list.add(new Pokemon("피카츄", 10)); 
		list.add(new Pokemon("라이츄", 5));
		list.add(new Pokemon("파이리", 7));
		
		Scanner sc = new Scanner(System.in); 
		// 포켓몬 이름을 입력 받고 해당 포켓몬 조회
		// 있으면 : 레벨 출력
		// 없으면 : "미등록 포켓몬입니다." 출력
		System.out.print("이름 : ");
		String name = sc.next();
		boolean result = false;
		for(int i = 0; i < list.size(); ++i) {
			if(name.equals( ((Pokemon)list.get(i)).name ) ) {
				System.out.println( ((Pokemon)list.get(i)).level);
				result = true; 
				break;
			}
		}
		if(!result) { // result == false
			System.out.println("미등록 포켓몬");
		}
		
		int r = (int)(Math.random() * list.size());
		//((Pokemon)list.get(r)).level += 10;
		list.get(r).level += 10;
	}
}











