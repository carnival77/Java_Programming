package basic;

class ATeam {
	static boolean win;
	String name;
	int level;
}
public class Test04 {
	public static void main(String[] args) {
		ATeam a1 = new ATeam();
		a1.name = "피카츄";
		
		ATeam a2 = new ATeam();
		a2.name = "라이츄";
		
		ATeam a3 = new ATeam();
		a3.name = "파이리";
		
		// 이겼다!
		//a1.win = true;
		//a2.win = true;
		//a3.win = true;
		// win이 일반 멤버변수일 경우, 객체마다 각각 가지게 되므로 
		//  상태를 변경해야 하는 경우 모든 객체를 한 번 씩 건드려야함
		
		System.out.println("변경 전 a1.win : " + a1.win);
		System.out.println("변경 전 a2.win : " + a2.win);
		System.out.println("변경 전 a3.win : " + a3.win);
		ATeam.win = true;
		System.out.println("변경 후 a1.win : " + a1.win);
		System.out.println("변경 후 a2.win : " + a2.win);
		System.out.println("변경 후 a3.win : " + a3.win);
	}
}











