import java.util.Scanner;

abstract class Shape{
	abstract public double getSize();
	abstract void Print();
}
class Circle extends Shape{
	public int radius;
	public double getSize() {
		return radius*radius*3.14;
	}
	public void Print() {
		System.out.println("원에 대한 객체입니다. 반지름:" + radius);
		System.out.println("이 원의 넓이는 "+getSize()+"입니다.");
	}
	public Circle(int a) {
		this.radius = a;
	}
}
class Triangle extends Shape{
	public int w;
	public int h;
	public Boolean tf;
	
	public double getSize() {
		return 0.5*w*h;
	}
	public void Print() {
		System.out.println("삼각형에 대한 객체입니다.");
		System.out.println("높이: "+h+" 밑변:"+w);
		System.out.println("이 삼각형의 넓이는 "+getSize()+"입니다.");
		System.out.println("직각삼각형이나? "+tf);
	}
	
	public Triangle(int a, int b, Boolean c) {
		this.w = a;
		this.h =b;
		this.tf = c;
	}
	
}
class Rectangle extends Shape{
	public int w;
	public int h;
	public double getSize() {
		return h*w;
	}
	
	public Rectangle(int a, int b) {
		this.w = a;
		this.h=b;
	}
	public void Print() {
		System.out.println("사각형 대한 객체입니다. 높이:"+h+" 밑변:"+w);
		System.out.println("이 사각형의 넓이는 "+getSize()+"입니다.");
	}
	
}


public class 연습0418 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Circle c = new Circle(sc.nextInt());
		Triangle t = new Triangle(sc.nextInt(),sc.nextInt(),sc.nextBoolean());
		Rectangle r = new Rectangle(sc.nextInt(),sc.nextInt());
		c.Print();
		System.out.println();
		t.Print();
		System.out.println();
		r.Print();

	}

}
