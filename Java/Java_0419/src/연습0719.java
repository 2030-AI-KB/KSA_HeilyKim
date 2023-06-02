import java.util.Scanner;

interface Book{
	public static final String publish = "한빛미디어";
	abstract public void Print();
	abstract public void updown2000();
}

class Java implements Book {
	public int year;
	public final String name = "Java";
	public void Print() {
		System.out.println("출판사:"+publish+" 책이름:"+name+" 년도:"+year);
	}
	public Java(int y) {
		this.year=y;
	}
	public void updown2000() {
		if (year>2000) {System.out.println("개정된 버전입니다.");}
		else {System.out.println("개정되기 이전의 버전입니다.");}
	}
}

class Python implements Book {
	public int year;
	public final String name = "Python";
	public void Print() {
		System.out.println("출판사:"+publish+" 책이름:"+name+" 년도:"+year);
	}
	public Python(int y) {
		this.year=y;
	}
	public void updown2000() {
		if (year>=2000) {System.out.println("개정된 버전입니다.");}
		else {System.out.println("개정되기 이전의 버전입니다.");}
	}
}

public class 연습0719 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Java j = new Java(sc.nextInt());
		Python p = new Python(sc.nextInt());
		j.Print();
		j.updown2000();
		p.Print();
		p.updown2000();
	}

}
