package basic;

public class Test02 {
	public static void main(String[] args) {
		// 학생 40명의 이름을 저장해야 한다.
		// 방법1. 변수 40개를 선언한다. ==> 반복문 x
		// 방법2. 40칸짜리 배열 1개를 선언한다. ==> 반복문 o 
		
		// 10, 20, 30, 40, 50를 하나의 배열에 담기 
		// 방법1. 데이터의 개수는 알지만, 원소들은 아직 모를 때
		int[] a;
		a = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		// 배열의 칸 번호(인덱스)는 0번 부터 시작한다. 
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		// 방법2.
		int[] b;
		b = new int[] {10, 20, 30, 40, 50};
		
		// 방법3. 어떤 원소를 저장할 지 알고 있을 때
		int[] c = {10, 20, 30, 40, 50};
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		// [I@15db9742
		// [ : 배열
		// I : int형
		// 15db9742 : 이 배열의 고유번호
		// 고유번호, 주소는 서로 다른 개념이지만 일단은 주소라고 생각하자!
		
		// 배열의 단점 : 칸 개수가 제한되어있다.
		
	}
}





