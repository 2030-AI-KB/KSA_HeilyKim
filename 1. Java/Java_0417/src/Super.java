import java.util.Scanner;
class Clock{
   public int hour;
   public int min;
   public int sec;
   
   public void Print() {
	   System.out.println("현재시간:"+this.hour+"시"+this.min+"분"+this.sec+"초입니다.");
   }
//생성자   
   public Clock(int h, int m, int s){
	   this.hour = h;
	   this.min = m;
	   this.sec = s;
   }
}
// 상속을 받을 시에, 부모 클래스가 있다면 부모 클래스의 생성자를 먼저 사용함
	// super() => 부모 클래스의 생성자를 실해하게끔 한다
class SmartClock extends Clock{
	public String os;
	public int walk;
	
	public void Print() {
		System.out.print("현재시간:"+this.hour+"시"+this.min+"분"+this.sec+"초입니다.");
		System.out.print(" 운영체제:"+this.os);
		System.out.print(" 현재까지 걸은 횟수:"+this.walk);
	}
	public SmartClock(int h, int m, int s, String o, int w){
		super(h,m,s);  //***super()는 맨위(첫줄)에 넣어야됨  부모 클래스의 생성자를 실행하여, 시분초의 정보를 초기화한다
		this.os = o;
		this.walk = w;
	}
	
}

public class Super {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Clock c = new Clock(sc.nextInt(),sc.nextInt(),sc.nextInt());
	int h = sc.nextInt();
	int m = sc.nextInt();
	int sec = sc.nextInt();
	String o = sc.next();
	int w = sc.nextInt();
	SmartClock sc1 = new SmartClock(h,m,sec,o,w);
	c.Print();
	sc1.Print();
	
	}
}

