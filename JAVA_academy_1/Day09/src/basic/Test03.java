package basic;

public class Test03 {
	public static void main(String[] args) {
		double[] dArr = new double[4];
		// 1.1, 2.2, 3.3, 4.4 를 for문을 사용하여 저장
		
		for(int i = 0; i < dArr.length; ++i) {
			// 배열명.length : 그 배열의 칸 개수 (여기서는 4)
			dArr[i] = 1.1 * (i + 1);
		}
		
		// for문을 사용하여 모든 원소 sysout
		for(double d : dArr) { // 확장 for문 (= 향상된 for문)
			System.out.println(d);
		}
	}
}
