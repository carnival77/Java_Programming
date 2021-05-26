package day09.basic;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/*
 * < Map >
 * - TreeMap, HashMap
 * 		TreeMap : 키를 기준으로 오름차순 정렬 
 * 		HashMap : 삽입/검색 속도 빠르다.
 * - K-V 쌍으로 원소를 저장 
 *   K : 검색 키워드 ( Value를 찾기 위한 보조장치 )
 *   V : 알맹이 값
 *   
 * - K : 중복 불가 
 *   V : K가 다르면 중복 가능
 *   
 */
public class Test03 {
	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		map.put("name", "홍길동"); 
		map.put("age", 10);
		map.put("address", "서울시 마포구 노고산동"); 
		map.put("tall", 110.3);
		
		System.out.println(map);
		System.out.println( map.get("name") );
		
		//for(String s : map) { // 확장된 for문을 쓸 수 있는 대상 : 배열, Iterable을 구현한 클래스
		//	System.out.println(map.get(s));
		//}
		
		// 반복문으로 map의 모든 원소 조회하기 
		// 방법1. values()로 모든 V 조회
		Collection<Object> c = map.values();
		for(Object o : c) {
			System.out.println("값 : " + o);
		}
		
		// 방법2. keySet()으로 모든 K 조회
		Set<String> k = map.keySet();
		for(String s : k) {
			System.out.println("키 : " + s);
			System.out.println("값 : " + map.get(s));
		}
		
		boolean result;
		result = map.containsKey("name"); // "name"이라는 키가 있니?
		System.out.println(result);
		
		result = map.containsValue(10); // 10이라는 값이 있니?
		System.out.println(result);
		
	}
}




