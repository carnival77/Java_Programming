package day09.basic;

import java.util.HashSet;
import java.util.TreeSet;

/*
 * < Set >
 * - TreeSet, HashSet
 * - �ε��� X, �ߺ� ���� X
 * - list�� ����� ����� ��, �ε��� ���� ó���� ���� 
 *    ����Ʈ 
 *      remove(index) 
 *      get(index) 
 *      add(index, element) 
 *    
 *    Set���� ���� �޼��尡 ����
 *    
 *  Hash : �ؽ� �˰��� ���� ���Ҹ� ��ġ ==> �˻�/���� �ӵ��� ������. 
 *  Tree : ���� Ʈ�� �˰��� ���� ���� ��ġ ==> �ڵ����� �������� ����.
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




