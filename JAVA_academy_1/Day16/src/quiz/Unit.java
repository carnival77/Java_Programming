package quiz;

public class Unit {
	// �ʵ� : �̸�, ���ݷ�(ap), ü��(hp)
	String name;
	int ap;
	int hp;
	
	// �޼��� 
	// 1. ������ : Unit() �⺻ ������ 
	//           Unit("������") --> ���ݷ��� 10 ~ 20 �� ����, ü���� ���ݷ��� 1.5��
	//								(20%�� Ȯ���� ü���� ���ݷ��� 2��)
	// 			 Unit("������", 10) --> �̸��� ���ݷ¿� ���� ����,
	//									(��, ������ ������ 0�� ��� ����)  
	// 									ü���� ���ݷ��� 1.5��(20% Ȯ���� 2��)
	//			 Unit("������", 10, 20) --> �̸�, ���ݷ�, ü�¿� ���� ����
	//									(��, ������ ������ 0�� ��� ����)
	Unit(){}
	Unit(String s){
		name = s;
		ap = (int)(Math.random() * 11) + 10; 
		setHp();
	}
	Unit(String n, int a){
		name = n;
		ap = a > 0 ? a : 0; 
		setHp();
	}
	Unit(String n, int a, int h){
		name = n;
		ap = a > 0 ? a : 0;
		hp = h > 0 ? h : 0;
	}
	
	void setHp() {
		hp = (int)(Math.random() < 0.2 ? ap * 2 : ap * 1.5);
	}
	
	// 2. printAll() : ��� ����(�̸�, ap, hp)�� ���
	void printAll() {
		System.out.println("�̸� : " + name);
		System.out.println("���ݷ� : " + ap);
		System.out.println("ü�� : " + hp);
	}
	
	
	// Quiz01 Ŭ���� --> Unit 3ĭ¥�� �迭�� ����� ������ �׽�Ʈ 
}




