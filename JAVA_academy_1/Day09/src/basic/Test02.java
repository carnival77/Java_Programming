package basic;

public class Test02 {
	public static void main(String[] args) {
		// �л� 40���� �̸��� �����ؾ� �Ѵ�.
		// ���1. ���� 40���� �����Ѵ�. ==> �ݺ��� x
		// ���2. 40ĭ¥�� �迭 1���� �����Ѵ�. ==> �ݺ��� o 
		
		// 10, 20, 30, 40, 50�� �ϳ��� �迭�� ��� 
		// ���1. �������� ������ ������, ���ҵ��� ���� �� ��
		int[] a;
		a = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		// �迭�� ĭ ��ȣ(�ε���)�� 0�� ���� �����Ѵ�. 
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		// ���2.
		int[] b;
		b = new int[] {10, 20, 30, 40, 50};
		
		// ���3. � ���Ҹ� ������ �� �˰� ���� ��
		int[] c = {10, 20, 30, 40, 50};
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		// [I@15db9742
		// [ : �迭
		// I : int��
		// 15db9742 : �� �迭�� ������ȣ
		// ������ȣ, �ּҴ� ���� �ٸ� ���������� �ϴ��� �ּҶ�� ��������!
		
		// �迭�� ���� : ĭ ������ ���ѵǾ��ִ�.
		
	}
}





