package basic;

public class Test01 {
	
	public static void main(String[] args) {
		
	
		String[] names = {"��ī��", "������", "���̸�", "Ǫ��" };
		String[] names2 = new String[4];
		String[] names3 = new String[] {"��ī��", "������", "���̸�", "Ǫ��" };
	
		System.out.println(names2[0]);
		System.out.println(names2[1]);
		System.out.println(names2[2]);
		System.out.println(names2[3]);
		
		int[] nums = new int[3]; 
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		
		boolean[] bools = new boolean[3];
		System.out.println(bools[0]);
		System.out.println(bools[1]);
		System.out.println(bools[2]);
		// ���Ұ� ���� �迭�� null, 0, false�� �ڵ� �ʱ�ȭ!
		
		for(int i = 0; i < names.length; ++i) {
			System.out.println(names[i]);
		}
//		System.out.println(names[4]);
		
		for(String s: names ) {
			System.out.println(s);
		}
		/*
		 * < Ȯ��� for��(extended for) >
		 * ���� : 
		 *  for( �ӽú��� ����    : �迭��   ){
		 *  	// �ӽú����� ����Ͽ� �ݺ��� �����
		 *  }
		 *  
		 * ó�� : �ش� �迭�� ��� ���Ҹ� �� �� �� �ӽú����� ����(����)
		 *       (���� + ���ӹ��� ����)�� �ݺ�
		 */
		
		char[] chs = {'P', 'o','K', 'E','m', 'o', 'N'};
		for(char c: chs) {
			// chs�� ��� ���ڸ� ��� (��, �ҹ��ڴ� �빮�ڷ� ���)
			// 'a' �̻� 'z' ����
			// 97 �̻� 122 ����
			if(c >= 'a' && c <= 'z') {
				System.out.println( (char)(c - 32) );
			} else {
				System.out.println(c);
			}
		}
	}
}




