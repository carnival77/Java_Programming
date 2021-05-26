package day09.basic;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/*
 * < Map >
 * - TreeMap, HashMap
 * 		TreeMap : Ű�� �������� �������� ���� 
 * 		HashMap : ����/�˻� �ӵ� ������.
 * - K-V ������ ���Ҹ� ���� 
 *   K : �˻� Ű���� ( Value�� ã�� ���� ������ġ )
 *   V : �˸��� ��
 *   
 * - K : �ߺ� �Ұ� 
 *   V : K�� �ٸ��� �ߺ� ����
 *   
 */
public class Test03 {
	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		map.put("name", "ȫ�浿"); 
		map.put("age", 10);
		map.put("address", "����� ������ ���굿"); 
		map.put("tall", 110.3);
		
		System.out.println(map);
		System.out.println( map.get("name") );
		
		//for(String s : map) { // Ȯ��� for���� �� �� �ִ� ��� : �迭, Iterable�� ������ Ŭ����
		//	System.out.println(map.get(s));
		//}
		
		// �ݺ������� map�� ��� ���� ��ȸ�ϱ� 
		// ���1. values()�� ��� V ��ȸ
		Collection<Object> c = map.values();
		for(Object o : c) {
			System.out.println("�� : " + o);
		}
		
		// ���2. keySet()���� ��� K ��ȸ
		Set<String> k = map.keySet();
		for(String s : k) {
			System.out.println("Ű : " + s);
			System.out.println("�� : " + map.get(s));
		}
		
		boolean result;
		result = map.containsKey("name"); // "name"�̶�� Ű�� �ִ�?
		System.out.println(result);
		
		result = map.containsValue(10); // 10�̶�� ���� �ִ�?
		System.out.println(result);
		
	}
}




