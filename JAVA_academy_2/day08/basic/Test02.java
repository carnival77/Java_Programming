package day08.basic;

import java.util.ArrayList;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		ArrayList<Pokemon> list = new ArrayList<Pokemon>();
		// <> : Generic 
		// ==> <Pokemon>�� �ǹ� : Object�� �ƴ� Pokemon������ ���Ҹ� ����϶�!
		// ==> < �����ڷ��� > 
		//     <int> (X) 
		//     <Integer> (O)
		list.add(new Pokemon("��ī��", 10)); 
		list.add(new Pokemon("������", 5));
		list.add(new Pokemon("���̸�", 7));
		
		Scanner sc = new Scanner(System.in); 
		// ���ϸ� �̸��� �Է� �ް� �ش� ���ϸ� ��ȸ
		// ������ : ���� ���
		// ������ : "�̵�� ���ϸ��Դϴ�." ���
		System.out.print("�̸� : ");
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
			System.out.println("�̵�� ���ϸ�");
		}
		
		int r = (int)(Math.random() * list.size());
		//((Pokemon)list.get(r)).level += 10;
		list.get(r).level += 10;
	}
}











