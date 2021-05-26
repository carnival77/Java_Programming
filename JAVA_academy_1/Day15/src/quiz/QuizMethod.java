package quiz;

public class QuizMethod {
	
	// 이름 : circleArea()
	// 인자값 : 반지름 1개
	// 리턴값 : 원의 넓이
	double circleArea(int r){
		return r * r * Math.PI;
	}
	
	// 이름 : getSum()
	// 인자값 : 정수 2개 
	// 리턴값 : 작은 수~큰 수까지의 총합
	//  예) getSum(10, 1) ---> 55
	int getSum(int a, int b){
		if(a > b) {
			int t = a;
			a = b;
			b = t;
		}
		
		int sum = 0;
		for(int i = a; i <= b; ++i) {
			sum += i;  // sum = sum + i
		}
		return sum;
	}
	// 이름 : getRandomName()
	// 인자값 : X
	// 리턴값 : 피카츄, 라이츄, 파이리, 꼬부기, 버터풀 중 1개 랜덤하게
	String getRandomName(){
		//String[] names = {"피카츄", "라이츄", "파이리", "꼬부기", "버터풀"};
		//int random = (int)(Math.random() * 5);
		//return names[random];
		
		return new String[] {"피카츄", "라이츄", "파이리", "꼬부기", "버터풀"}[(int)(Math.random() * 5)];
	}
	
}



