package day09.basic;

import java.util.Scanner;
import java.util.TreeMap;

public class Test04 {
	public static void main(String[] args) {
		TreeMap<String, Person> map = new TreeMap<String, Person>();
		map.put("����ī��",new Person("����ī��", 10));
		map.put("��Ǫ��",new Person("��Ǫ��", 12));
		map.put("�������",new Person("�������", 5));
		
		Person p = new Person("��ѹ���", 20);
		map.put(p.name, p);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��� �̸� : ");
		String name = sc.next();
		if(map.containsKey(name)) {
			System.out.println(map.get(name));
		}
		else {
			System.out.println("�̵�� �ο�");
		}
	}
}




