package day05.basic;
/*
 * < static >
 * - 무조건 만들어지고, 1개만 만들어진다!
 *   클래스로드할 때 미리 생성해두고
 *   객체마다 가지고 있는 것이 아니라, static 영역에 1개만 만들어진다.
 * - static 메소드 안에는 static 멤버만 사용 가능
 */
class Sample {
	String insStr = "나는 인스턴스 멤버"; 
	static String stsStr = "나는 클래스 멤버";
	
	// static 멤버 = 클래스 멤버 (클래스 로드 시 생성)
	// non-static 멤버 = 인스턴스 멤버 (인스턴스 생성 시 생성)
	
	void insMthd() { // 인스턴스 멤버
		System.out.println(insStr);
		System.out.println(stsStr);
	}
	
	static void stsMthd() { // 클래스 멤버
		//System.out.println(insStr); // 에러!
		System.out.println(stsStr);
		// static 메소드는 non-static 멤버보다 앞서 만들어진다.
		// 아직 생성되지 않은 non-static을 사용할 수 없다.
	}
}
public class Test01 {
	static void aa() {
		
	}
	void bb() {
		
	}
	public static void main(String[] args) {
		aa();
		
		Test01 t = new Test01();
		t.bb();
	}
}



