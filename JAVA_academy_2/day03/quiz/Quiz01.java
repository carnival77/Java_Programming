package day03.quiz;

import java.util.Scanner;

interface Transport {
	int ADULT_PRICE = 1000;
	int KID_PRICE = 300;
	int getCharge(int age, int distance);
}

class Bus implements Transport {
	
	public int getCharge(int age, int distance) {
		// age를 가지고 판별 
		// 성인 : 성인 기본 요금 + distance*10
		// 미성년 : 아동 기본 요금 + distance
		// 요금을 return
		return age >= 20 ? ADULT_PRICE + distance*10 : KID_PRICE + distance;  
	}
}
class Subway implements Transport {
	@Override
	public int getCharge(int age, int distance) {
		// distance가 10키로 이상부터는 키로 당 20원 추가 
		// 성인 : 성인 기본 요금 + 추가요금 
		// 아동 : 아동 기본 요금 + 추가요금
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
		// 기본요금 무조건 3000 원  + 5키로 이상부터 키로당 100원
		// 미성년자인 경우 20% 할인
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
		// 교통수단, 나이, 이동할 거리를 입력 받고 
		// 요금 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---- 교통수단을 선택하세요.----");
		System.out.println("1. 버스");
		System.out.println("2. 지하철");
		System.out.println("3. 택시");
		System.out.print("입력 : ");
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
			System.out.println("잘못된 입력입니다.\n프로그램을 종료합니다.");
			return; // 메인메소드 종료
		}
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("거리(km) : ");
		int distance = sc.nextInt();
		
		System.out.println("요금 : " + t.getCharge(age, distance));
	}
}



