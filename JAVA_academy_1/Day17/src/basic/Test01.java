package basic;
/*
 * < this >
 * - �� ��ü�� ���۷��� 
 *   ��, �� ���� �ǹ�
 * - ��ü�� ����޼��尡 ����� �� '�ڵ����� ���� 0�� ����'
 * 
 * - this() 
 *   ==> this ������
 *   ==> ������ ���ο� �ٸ� �����ڸ� ȣ��
 */
class Pokemon {
	String name;
	int level;
	Pokemon(String name, int level){
		this.name = name;
		this.level = level;
	}
	void print(){
		System.out.println("�̸� : " + this.name); // this.name 
		System.out.println("���� : " + level); // this.level
		// �޼ҵ� �ȿ� '�������'�� ��Ī�� ���� �տ� �ڵ����� 'this.'�� �ٴ´�.
		aa(); // this.aa();
		// ����޼ҵ嵵 ����������
	}
	
	void aa() {
		
	}
}


public class Test01 {

}
