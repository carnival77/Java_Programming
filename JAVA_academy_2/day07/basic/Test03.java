package day07.basic;
/*
 * < Collection >
 * - 배열의 대체 클래스 (창고 클래스) 
 *   ---
 *    단점 : 
 *    	1. 개수 제한 : 원소의 개수를 모를 때 비효율적임 
 *      2. 선형 구조 : 원소가 일렬 배치되어있음--> 검색이 오래 걸림
 *      3. 연속 구조 : 원소를 중간에 삽입/삭제할 때 불편함 --> 연결리스트가 필요
 *      ==> 컬렉션 클래스들은 다양한 자료구조를 제공, 원소를 무제한으로 저장할 수 있다.
 * - 모든 원소들의 기본 자료형 : Object (모든 자료형 가능)
 * - 종류 
 * 	1. List : 인덱스 O, 중복 원소 O 
 *  2. Set : 인덱스 X, 중복 원소 X 
 *  3. Map : K(키) - V(값) 쌍으로 원소를 저장 
 *  		 키 : 중복 X
 *   		 값 : 키가 다르면 중복 O
 *   		--> 키를 통해 값을 찾음
 *    
 */
import java.util.ArrayList;
import java.util.Date;

public class Test03 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(); // ArrayList 창고 객체 생성
		System.out.println(list);
		list.add(1); 
		list.add(true); 
		list.add(new Date());
		list.add("ㅋㅋㅋ"); 
		System.out.println(list);
	}
}




