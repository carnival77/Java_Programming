package quiz;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		// 1. double�� 4ĭ¥�� �迭 ����� 
		// ==> Scanner�� �Ǽ� 4�� �Է� �޾Ƽ� �� ĭ�� ����
		double[] dArr = new double[4];
					//= { 0, 0, 0, 0 };
		Scanner sc = new Scanner(System.in); 
		
//		for(double d1 : dArr) {
//			d1 = sc.nextDouble();
//		}
		
		for(int i = 0; i < dArr.length; ++i) {
			dArr[i] = sc.nextDouble();
		}
		for(double d : dArr) {
			System.out.println(d);
		}
		
		
		
		// 2. �Է� ���� �Ǽ� �� ���� ū �� ���
		double max = dArr[0];
		for(int i = 1; i < dArr.length; ++i) {
			if(max < dArr[i]) {
				max = dArr[i];
			}
		}
		System.out.println("�ִ� : " + max);
		
		// 3. 
		char[] chs = "Hello, Java!! ^~^".toCharArray();
		//      { 'H', 'e', 'l', 'l', 'o', ',', ' ', 'J', ..};
		// ���ڿ�.toCharArray() ===> char�� �迭��!
		
		// chs�� ��� �빮�ڸ� �ҹ��ڷ� ����
		System.out.println(chs); // Hello, Java!! ^~^
		
		for(int i = 0; i < chs.length; ++i) {
			if(chs[i] >= 'A' && chs[i] <= 'Z') {
				chs[i] += 32;
			}
		}
		
		System.out.println(chs); // hello, java!! ^~^
		
		// 4. �л� 6���� ���������� �Է� �ް�, 
		// ��� ���, ����, ��� ������ ���
		int[] kr = new int[6];
		int total = 0;
		for(int i = 0; i < 6; ++i) {
			System.out.print((i + 1) + "�� �л� ���� : ");
			kr[i] = sc.nextInt();
			total += kr[i];
		}
		
		for(int k : kr) {
			System.out.println(k + "��");
		}
		System.out.println("���� : " + total);
		System.out.println("��� : " + ((double)total/ kr.length));
	}
}









