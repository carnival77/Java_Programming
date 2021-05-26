package day01.basic;

/*
 * < ������(polymorphism) >
 * - ���°� �پ��ϰ� ���ϴ� ���� 
 * - ���۷��� ����ȯ
 * - Pokemon�� Pikachu�� �Ǿ��ٰ�, Ggobuki�� �Ǿ��ٰ�, Pairi�� �� �� �ִ� ����
 * 
 */


class Shape {
	public double getArea() {
		return 0.0;
	}
}
class Circle extends Shape {
	int radius;
	
	// ������
	Circle(int r){
		radius = r;
	}
	
	// getArea() �������̵� 
	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}
}
class Triangle extends Shape {
	int base, height;
	
	// ������ 
	Triangle (int b, int h){
		base = b;
		height = h;
	}
	
	@Override
	public double getArea() {
		return base * height * 0.5;
	}
}
class Rectangle extends Shape {
	int base, height;
	// ������ 
	Rectangle (int b, int h){
		base = b;
		height = h;
	}
	
	@Override
	public double getArea() {
		return base * height;
	}
}
public class Test01 {
	public static void main(String[] args) {
		Circle c = new Circle(10);
		Triangle t = new Triangle(10, 20);
		Rectangle r = new Rectangle(10, 20);
		
		System.out.println(c.getArea());
		System.out.println(t.getArea());
		System.out.println(r.getArea());
		
		Shape[] shapes = new Shape[5]; 
		shapes[0] = new Circle(100); 
		shapes[1] = new Triangle(5, 7);
		shapes[2] = new Rectangle(10, 2);
		shapes[3] = new Circle(6);
		shapes[4] = new Triangle(2, 10); 
		for(int i = 0; i < shapes.length; ++i) {
			System.out.println(shapes[i].getArea());
		}
		
		Shape s;
		
		s = new Circle(10); 
		System.out.println("���� ���� : " + s.getArea());
		
		s = new Triangle(10, 20);
		System.out.println("�ﰢ���� ���� : " + s.getArea());
		
		s = new Rectangle(20, 30); 
		System.out.println("�簢���� ���� : " + s.getArea());
	}
}


















