package day03.basic;
/*
 * < �߻�ȭ(abstract) >
 *  - Ŭ���� �տ� : �߻�Ŭ���� 
 *    �޼��� �տ� : �߻�޼���
 *    
 * < �������� �뵵 >
 *  1. �迭�� �پ��� ����� ��ü(���۷���)�� ���� �� �ִ�.
 *  2. �Ű������� �پ��� ����� ��ü(���۷���)�� ���� �� �ִ�.
 *    (�迭�� �Ű������� �θ�Ÿ���̸�.. ��� �ڽİ�ü���� ���� �� �ִ�.)
 * 
 * 
 * - Pokemon , Shape ���� �θ�Ŭ������ ��ü�� �� �ʿ䰡 ������.
 *   ==> �߻�Ŭ������ �����ϸ� ����.
 *   ������ ��üȭ�Ͽ� ����� �͵��� '�ڽ�Ŭ����'����.
 *   
 * - �θ�Ŭ������ �޼��� ����... {} ������ �ʿ� ������...
 *   ��? �θ� Ŭ������ ��üȭ���� ���� + �ڽĵ��� �� �������̵带 ����
 *    ==> �θ�Ŭ������ �޼��带 '�߻�޼���'�� �����Ѵ�.
 *    
 *      �߻�޼��� ���� : 
 *      	abstract ���������� �����ڷ��� �޼����( �Ű����� ���� );
 *      ( �� �տ� abstract , �� �ڿ� {} ��� ';' ) 
 * 		����! �߻�޼���� �߻�Ŭ���� �ȿ����� ���� ����!
 * 
 * 		�߻�Ŭ���� ���� :
 *  		abstract ���������� class Ŭ������ { .. }	
 * 	    ( �߻�Ŭ������ �߻�޼��带 ������ �� �ִ� Ŭ������. )
 */
abstract class Pokemon {
	String name;
	int level;
	abstract void go();
	abstract void attack();
}
class Pairi extends Pokemon {
	// �θ� �߻�޼��带 ������ �ִٸ�, 
	// �ڽ��� �ݵ�� �ش� �޼��带 �������̵� �ؾ� �Ѵ�.
	void go() {
		System.out.println("���̸�, �ɾ��~~");
	}
	void attack() {
		System.out.println("���̸�, �Ҳ� ����!");
	}
}
class Pikachu extends Pokemon {
	void go() {
		System.out.println("��ī�� �ɾ �̵�~~");
	}
	void attack() {
		System.out.println("��ī��, �鸸��Ʈ ����!!!");
	}
}
class Raichu extends Pokemon {
	void go() {
		System.out.println("������ �پ �̵�~~");
	}
	void attack() {
		System.out.println("������, õ����Ʈ ����!!!");
	}
}
class Purin extends Pokemon {
	void go() {
		System.out.println("Ǫ�� ������ �̵�~~");
	}
	void attack() {
		System.out.println("Ǫ��, ���尡 ����!!!");
	}
}
public class Test01 {
	public static void main(String[] args) {
		Pokemon[] p = { new Pikachu(), new Purin(), new Raichu(), new Pairi() };
		for(Pokemon pok : p) {
			pok.go();
			pok.attack();
		}
		
		Pokemon p2 = new Pokemon() { // �͸�Ŭ����
			void go() { 
				System.out.println("�Ŀ���, �Ŀ˳Ŀ� �ɾ��");
			}
			void attack() {
				System.out.println("�Ŀ���, �ɳ���ġ!!!");
			}
		};
		p2.go();
		p2.attack();
	}
}



