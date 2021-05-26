package basic;

import java.util.Scanner;

/*
 * < ������ (constructor) >
 * - new Person();
 *       --------
 *       �����ڸ� ȣ��
 * - ��ü�� ������ �� ȣ���ϴ� Ư�� �޼���
 *   ��ü 1���� 1���� ȣ�� ����
 *   new �� �Բ� ����
 * - ����) 
 * 		Ŭ������(){
 * 
 *      }
 * - ����) 
 * 	1. �����ڴ� Ŭ���� �̸��� �����ؾ� ��
 *  2. �����ڷ����� ����
 */

class Pokemon {
	String name;
	int level;
	int hp;
	Pokemon(){
		System.out.println("���ϸ� ���� �Ϸ�!");
	}
	/*
	 * < �⺻ ������ > 
	 * - �����ڰ� ���ǵ��� �ʾ��� ��� �ڵ����� ���ǵǴ� ������ 
	 * - ���� : 
	 *  	public Ŭ������(){
	 *  
	 *  	}
	 * - �����ڰ� ���� �����ڸ� ������ٸ�, �⺻�����ڴ� ��������� �ʴ´�.
	 */
	
	Pokemon(String n){ // �̸��� �־��� ���� ����� ������
		name = n;
	}
	Pokemon(String n, int lv){ // �̸�, ����
		name = n;
		level = lv;
	}
	Pokemon(String n, int lv, int h){ // �̸�, ����, ü��
		name = n;
		level = lv;
		hp = h;
	}

	void printPokemon() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + level);
		System.out.println("ü�� : " + hp);
	}
}
public class Test02 {
	public static void main(String[] args) {
		Pokemon p = new Pokemon();
		Pokemon p2 = new Pokemon("��ī��"); 
		Pokemon p3 = new Pokemon("������", 10); 
		Pokemon p4 = new Pokemon("Ǫ��", 12, 10000); 
		p.printPokemon();
		p2.printPokemon();
		p3.printPokemon();
		p4.printPokemon();
	}
}






