package quiz;

public class Quiz01 {
	public static void main(String[] args) {
		//Unit[] u = new Unit[4];
		//      [0] : null
		//      [1] : null 
		//      [2] : null
		// 		[3] : null
		
		//u[0] = new Unit();
		//u[1] = new Unit("���ݼ�"); 
		//u[2] = new Unit("����", 10, 800); 
		//u[3] = new Unit("����", 5);
		
		Unit[] u = { 
				new Unit(), 
				new Unit("���ݼ�"), 
				new Unit("����", 10, 800),
				new Unit("����", 5)
				};
		
		for(Unit unit : u) {
			unit.printAll();
		}
	}
}


