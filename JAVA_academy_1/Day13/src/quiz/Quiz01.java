package quiz;

import basic.Person;

public class Quiz01 {
	public static void main(String[] args) {
		String[] randName = { "��Ǫ��", "ȫ�浿", "����ī��", "��浿" };
		
		// Person �� �迭 10�� ����
		Person[] pArr = new Person[10]; 
		// �ּҸ޸��� 10��.. null, null, null, ...
		
		
		
		for(int i = 0; i < pArr.length; ++i) {
			pArr[i] = new Person();
			
			// for���� ���ؼ� �̸��� randName �� ���Ƿ� 1�� (�ߺ� �������)
			pArr[i].name = randName[ (int)(Math.random()*4) ];
			
			// ������ �����ϰ� true Ȥ�� false
			pArr[i].isMale = Math.random() > 0.5; 
			
			// ���̴� 1 ~ 100 �� �������� ����
			pArr[i].age = (int)(Math.random() * 100) + 1;
			
			// printPerson() �� ����Ͽ� ��� ���� ���
			// pArr[i].printPerson();
		}
		
//		for(int i = 0; i < 10; ++i) {
//			pArr[i].name = "����";
//		}
		
//		for(Person p : pArr) {
//			p.name = "����"; 
//		}
		
//		for(int i = 0; i < 10; ++i) {
//			pArr[i] = new Person();
//		}
		
//		for(Person p : pArr) {
//			p = new Person();
//		}
		
		for( Person p : pArr ) {
			p.printPerson();
		}
	}
}











