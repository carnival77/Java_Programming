package basic;

public class Test01 {
	public static void main(String[] args) {
		// �������迭 (�迭 X �迭)
		String[][] s = new String[3][2];
		
		s[0][0] = "������";
		s[0][1] = "�󸶹�";
		
		s[1][0] = "ABC"; 
		s[1][1] = "DEF"; 
		
		s[2][0] = "������";
		s[2][1] = "��������";
		
		System.out.println(s);
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		System.out.println(s[0][0]);
		System.out.println(s[0][1]);
		System.out.println(s[1][0]);
		System.out.println(s[1][1]);
		System.out.println(s[2][0]);
		System.out.println(s[2][1]);
		
		int[][] arr = { {1,2,3,4}, {1,2,3,4}, {1,2,3,4} };
		/*
		 * < ������ �迭 >
		 *  - �� X �� ������ ��ġ�� �� ������ �迭
		 *  - ������ : 
		 *     �ڷ���[][] �迭�� = �������迭
		 *     				 = new �ڷ���[���� ����][���� ����];
		 *     				 = { {�迭1}, {�迭2}, {�迭3}, ... };
		 *  - ��(row) : ������ 
		 *    ��(column) : ������
		 */
	}
}








