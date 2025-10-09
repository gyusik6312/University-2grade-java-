package ex04_05_5;

public class Circle {
	int radius;
	public Circle(int radius) {this.radius = radius;}
	public void set(int radius) {this.radius = radius;}
	public static void main(String[] args)
	{
		Circle ob1 = new Circle(1);
		Circle ob2 = new Circle(2);
		Circle s;
		
		s = ob2; //가비지 컬렉션 ---> 이 과정을 누가하냐?: 가비지 컬렉터
		ob1 = ob2;
		System.out.println("ob1.radius =" + ob1.radius);
		System.out.println("ob2.radius =" + ob2.radius);
	}
}