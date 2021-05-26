package basic;
/*
 * < ��ü ���� ���α׷��� (Object Oriented Programming) >
 * - ��ü ==> ��ǰ
 * - ��ǰ�� �̸� ����� ���� �� �ʿ��� �� �����Ͽ� ���α׷��� �ϼ��ϴ� ���α׷��� �з�����
 * - ������ ���� ==> ���� �Ⱓ�� ª������.
 *   ������ Ȯ�强 ==> ���� ����/���߱Ⱓ�� ª������.
 *     >> ���
 *   ���α׷� ������ ���� ==> ���� ���� �Ⱓ�� ª��
 *     >> ������  
 * - ���� : ���̴� ( Ȯ�常 �����ϱ� ������ ���ʿ��� ��ɵ� ���Եȴ�.) 
 * 
 * < ��ü ���� ��� >
 * 1. ����( reference )
 * 	-> �ν��Ͻ�(=��ü)�� ��ġ�� �ּ�
 * 
 * 2. ���� �ڷ��� ( reference type )
 *  -> �ν��Ͻ��� ��� ( ~~ ��簴ü�� �ּ� )
 *  
 * 3. Ŭ���� 
 * 	-> ���赵
 * 
 * 4. �ν��Ͻ�(instance)
 *  -> ��ü (���ΰ�!) 
 *  -> Ŭ������ ������ �����Ͽ� ���� �޸𸮿� �Ҵ��
 *     �̰��� ���� ������ ����
 *     
 * 5. ��üȭ
 *  -> Ŭ������ ����Ͽ� �ν��Ͻ��� ���� ( new ������ ) 
 *  
 * 6. �������� ( reference ���� )
 *  -> �ּҸ� �����ϴ� �޸���
 *     �ν��Ͻ� ���¿� ������� ������ 4byte 
 *     ( �ּ��� ���̰� 32bit )
 *     
 *  ���θ޼ҵ� O : ����Ŭ����
 *  ���θ޼ҵ� X : Ŭ���� ( ��ü ���赵 )
 */
public class Test01 {
	public static void main(String[] args) {
		// ���� ���� p1, p2 ����
		Pokemon p1, p2; 
		
		// Pokemon ��üȭ + �� �ּҸ� p1�� ����
		p1 = new Pokemon(); //  () ����!
		
		// Pokemon ��üȭ + �� �ּҸ� p2�� ����
		p2 = new Pokemon();
		
		p1.name = "��ī��"; 
		p1.hp = 1000;
		p1.level = 10;
		
		p2.name = "������"; 
		p2.hp = 2000;
		p2.level = 20;
		
		p1.greet();
		p2.greet();
		
		System.out.println(p1);
		System.out.println(p1.name);
		System.out.println(p1.hp);
		System.out.println(p1.level);
		
		
		System.out.println(p2.name);
		System.out.println(p2.hp);
		System.out.println(p2.level);
		
		p1 = p2;
		p2.name = "Ǫ��"; 
		
		System.out.println(p1.name); // Ǫ��
		System.out.println(p2.name); // Ǫ��
		
		Pokemon p3 = null; 
		// null : ����! (��ü�� ����) 
		// ������������ 0�� �ǹ�
		p3.name = "������"; 
	}
}





