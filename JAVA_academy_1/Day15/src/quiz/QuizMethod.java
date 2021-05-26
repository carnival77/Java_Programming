package quiz;

public class QuizMethod {
	
	// �̸� : circleArea()
	// ���ڰ� : ������ 1��
	// ���ϰ� : ���� ����
	double circleArea(int r){
		return r * r * Math.PI;
	}
	
	// �̸� : getSum()
	// ���ڰ� : ���� 2�� 
	// ���ϰ� : ���� ��~ū �������� ����
	//  ��) getSum(10, 1) ---> 55
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
	// �̸� : getRandomName()
	// ���ڰ� : X
	// ���ϰ� : ��ī��, ������, ���̸�, ���α�, ����Ǯ �� 1�� �����ϰ�
	String getRandomName(){
		//String[] names = {"��ī��", "������", "���̸�", "���α�", "����Ǯ"};
		//int random = (int)(Math.random() * 5);
		//return names[random];
		
		return new String[] {"��ī��", "������", "���̸�", "���α�", "����Ǯ"}[(int)(Math.random() * 5)];
	}
	
}



