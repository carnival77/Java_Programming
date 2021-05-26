package day09.basic;

import java.util.HashSet;
import java.util.TreeSet;

/*
 * < Set >
 * - TreeSet, HashSet
 * - 인덱스 X, 중복 원소 X
 * - list와 사용방법 비슷함 단, 인덱스 관련 처리가 없음 
 *    리스트 
 *      remove(index) 
 *      get(index) 
 *      add(index, element) 
 *    
 *    Set에는 저런 메서드가 없음
 *    
 *  Hash : 해쉬 알고리즘에 의해 원소를 배치 ==> 검색/삽입 속도가 빠르다. 
 *  Tree : 이진 트리 알고리즘에 의해 원소 배치 ==> 자동으로 오름차순 정렬.
 */
public class Test01 {
	public static void main(String[] args) {
		//HashSet<Integer> set = new HashSet<Integer>();
		TreeSet<Integer> set = new TreeSet<Integer>(); 
		set.add(10); 
		set.add(1);
		set.add(7);
		set.add(13); 
		set.add(100); 
		set.add(10);
		System.out.println(set.toString());
		
		for(Integer num : set) {
			System.out.println(num);
		}
		
		Object[] arr = set.toArray();
		
	}
}




