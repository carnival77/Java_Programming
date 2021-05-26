package day03.quiz;

import java.util.Scanner;

interface Transport {
	int ADULT_PRICE = 1000;
	int KID_PRICE = 300;
	int getCharge(int age, int distance);
}

class Bus implements Transport {
	
	public int getCharge(int age, int distance) {
		// age�� ������ �Ǻ� 
		// ���� : ���� �⺻ ��� + distance*10
		// �̼��� : �Ƶ� �⺻ ��� + distance
		// ����� return
		return age >= 20 ? ADULT_PRICE + distance*10 : KID_PRICE + distance;  
	}
}
class Subway implements Transport {
	@Override
	public int getCharge(int age, int distance) {
		// distance�� 10Ű�� �̻���ʹ� Ű�� �� 20�� �߰� 
		// ���� : ���� �⺻ ��� + �߰���� 
		// �Ƶ� : �Ƶ� �⺻ ��� + �߰����
		int price = 0;
		if(distance >= 10) {
			price = ((distance-10)+1) * 20;
		}
		price += age >= 20 ? ADULT_PRICE : KID_PRICE;
		return price;
	}
}
class Taxi implements Transport{
	@Override
	public int getCharge(int age, int distance) {
		// �⺻��� ������ 3000 ��  + 5Ű�� �̻���� Ű�δ� 100��
		// �̼������� ��� 20% ����
		int price = 3000;
		if(distance >= 5) {
			price += ((distance-5) + 1) * 100;
		}
		if(age <= 20) {
			price *= 0.8;
		}
		return price;
	}
}
public class Quiz01 {
	public static void main(String[] args) {
		// �������, ����, �̵��� �Ÿ��� �Է� �ް� 
		// ��� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---- ��������� �����ϼ���.----");
		System.out.println("1. ����");
		System.out.println("2. ����ö");
		System.out.println("3. �ý�");
		System.out.print("�Է� : ");
		int select = sc.nextInt();
		Transport t = null;
		
		switch(select) {
		case 1: 
			t = new Bus();
			break;
		case 2:
			t = new Subway();
			break;
		case 3:
			t = new Taxi();
			break;
		default:
			System.out.println("�߸��� �Է��Դϴ�.\n���α׷��� �����մϴ�.");
			return; // ���θ޼ҵ� ����
		}
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		System.out.print("�Ÿ�(km) : ");
		int distance = sc.nextInt();
		
		System.out.println("��� : " + t.getCharge(age, distance));
	}
}



