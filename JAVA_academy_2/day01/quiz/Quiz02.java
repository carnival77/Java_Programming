package day01.quiz;

/*
 * < Sniper VS Tank >
 * - ���ݼ�, ��ũ �� ĳ���� �� �ƹ��ų� �����ϰ� 2�� ���� (Math.random() ���)
 *   (��ũ vs ��ũ, �� vs ��, �� vs ��)
 * - �� ��ü�� ���� ���� ������ ���� ������ �ݺ�
 * - ù��°, Ȥ�� �ι�° �÷��̾ �̰���� ������ ���� ���! 
 *  e.g. �÷��̾�1(��ũ)�� �¸�!
 */
class Unit { // �θ� Ŭ����
	String name;
	int hp, att; // ü��, ���ݷ�
	boolean alive; // true:���� ������� (���û���)
	
	public void attack(Unit enemy) {
		// ���� �ʿ� ����
	}
}

class Sniper extends Unit { // �ڽ� Ŭ����
	// ��ü �����Ǹ�, �ڵ����� name�� "���ݼ�", hp�� 400, att�� 100
	Sniper(){
		name = "���ݼ�"; 
		hp = 400;
		att = 100;
		alive = true;
	}
	// attack �������̵� 
	// 1. 10% Ȯ���� ��弦 (��� ���)
	// 2. ������ Ȯ���� ��Ÿ(�Ϲ� ����, ��� hp�� 100��ŭ ��´�.)
	@Override
	public void attack(Unit enemy) {
		if( Math.random() < 0.1 ) {
			System.out.println("��弦!!! ��� ���!");
			enemy.hp = 0;
		} else {
			enemy.hp -= 100;
			System.out.println("�Ϲ� ����.. ��� " + enemy.name + 
										"�� ���� ü�� : " + enemy.hp);
		}
		if(enemy.hp <= 0) {
			System.out.println("��븦 �����ƴ�!!");
			enemy.alive = false;
		}
	}
}

class Tank extends Unit {
	// ��ü �����Ǹ�, �ڵ����� name�� "��ũ", hp�� 4000, att�� 50
	Tank(){
		name = "��ũ"; 
		hp = 4000;
		att = 50;
		alive = true;
	}
	// attack �������̵� 
	// 1. 30% Ȯ���� ����� hp 30% ����
	// 2. ������ Ȯ���� ��Ÿ(�Ϲ� ����, ��� hp�� 50��ŭ ��´�.)
	@Override
	public void attack(Unit enemy) {
		if( Math.random() < 0.3 ) {
			System.out.println("��� ü�� 30% ����!");
			//enemy.hp = (int)(enemy.hp * 0.7);
			enemy.hp *= 0.7;
		} else {
			enemy.hp -= 100;
			System.out.println("�Ϲ� ����.. ��� " + enemy.name + 
										"�� ���� ü�� : " + enemy.hp);
		}
		if(enemy.hp <= 0) {
			System.out.println("��븦 �����ƴ�!!");
			enemy.alive = false;
		}
	}
}
public class Quiz02 {
	
	public static void main(String[] args) {
		// �� Ÿ���� ��ü�� �����ϰ� 2�� ����
		// ���� �ݺ����� ����Ͽ� �� �� �ϳ��� ���� ������ ���θ� ����
		// ��, ���� ��ü�� �����ϸ� �ȵ�
		Unit u1 = (Math.random() > 0.5) ? new Tank() : new Sniper();
		Unit u2 = (Math.random() > 0.5) ? new Tank() : new Sniper();
		
		System.out.println("u1 : " + u1.getClass().getSimpleName());
		System.out.println("u2 : " + u2.getClass().getSimpleName());
		
		System.out.println("=========== GAME START ============");
		while(u1.alive && u2.alive) {
			if(u1.alive) {
				System.out.print("u1 : ");
				u1.attack(u2); 
			}
			if(u2.alive) {
				System.out.print("u2 : ");
				u2.attack(u1);
			}
		}
		
		
		if(u1.alive) {
			System.out.println("u1 �¸�!");
		} else {
			System.out.println("u2 �¸�!");
		}
	}
}









