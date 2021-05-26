package basic;

public class Test01 {
	public static void main(String[] args) {
		// ��������� : + , - , * , / , %
		
		// / : ���� / ���� ==> ������ ����
		
		// 10 / 4 ==> 2.5 (X)  2
		
		// �� �� 1���� �Ǽ��� �Ҽ������� ����
		// 10 / 4.0
		
		System.out.println(10/4);
		System.out.println(10/4.0);
		
		// % : mod (������ ������)
		//   : �������� ��ȯ 
		System.out.println(10 % 4); // 2
		System.out.println(10 % 3); // 1
		// �뵵 : ¦/Ȧ�� �Ǻ�, ����Ǻ� 
		//      ���ǵ����� ���� ȸ�� 0 -> 1 -> 2 -> 0 -> 1 -> 2
		//      ��ȣȭ �˰���
		
		// ���Կ����� : = += -= %= *= /= ��
		// a += b  --> a = a + b
		
		int a = 10;
		int b = 20;
		
		int score = 0;
		score += 10; // score = score + 10;
		System.out.println("���� : " + score);
		score += 10; // score = score + 10;
		System.out.println("���� : " + score);
		score += 10; // score = score + 10;
		System.out.println("���� : " + score);
		
		// ���������� : ++ -- 
		// a++, ++a : a += 1 
		// a--, --a : a -= 1
		
		a = 100;
		++a; // a++;
		System.out.println("a: " + a);
		a--; // --a; 
		System.out.println("a: " + a);
		
		/*
		 * < �������� vs �������� >
		 * ���������ڰ� ���� 
		 *  �տ� ������ : �������� (=��ġ����)
		 *  �ڿ� ������ : �������� (=��ġ����)
		 *  
		 * ���� : �� ��ɿ� (...;) ���� ������ ������� ��� 
		 *       ��ġ -> �ڽ��� ���� ��/���� ��, ������ ������� ����
		 *       ��ġ -> ������ ������� ���� ���� ��, �������� �ڽ��� ��/��
		 */
		a = 10;
		//int c = ++a;   // c: 11
		int c = a++;      // c: 10
		System.out.println("c : " + c);
		System.out.println("a : " + a);
		
		int num = 10;
		System.out.println(++num); // ���� �� ���
		System.out.println(num++); // ��� �� ����
		System.out.println(++num); // ���� �� ���
		System.out.println(num);  
		
		// �񱳿����� (=���迬����) : >, >=, <, <=, ==, != 
		// == : ���� 
		// != : �ٸ���
		// ����� : boolean�� (True Ȥ�� False)
		boolean bool = a == 13; 
		System.out.println(bool);
		
		System.out.println(10 % 3 >= 10 % 4);
		
		
		// �� ������ : && || !
		// && : �� AND (����) : ���� ��(��)�� ��� true���� ���� true 
		// || : �� OR (����)  : ���� �� �� 1���� true�� ���� true
		// !  : �� NOT (������) : ���� true�� false, false�� true
		int d = 10*2;
		System.out.println( 10 >= 20 && 10*2 == 20 );
		System.out.println( 10 >= 20 || d == 20 );
		System.out.println( !(10 >= 20) );
		
		
		
	}
}












