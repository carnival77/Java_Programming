package basic;

public class Test03 {
	public static void main(String[] args) {
		double[] dArr = new double[4];
		// 1.1, 2.2, 3.3, 4.4 �� for���� ����Ͽ� ����
		
		for(int i = 0; i < dArr.length; ++i) {
			// �迭��.length : �� �迭�� ĭ ���� (���⼭�� 4)
			dArr[i] = 1.1 * (i + 1);
		}
		
		// for���� ����Ͽ� ��� ���� sysout
		for(double d : dArr) { // Ȯ�� for�� (= ���� for��)
			System.out.println(d);
		}
	}
}
