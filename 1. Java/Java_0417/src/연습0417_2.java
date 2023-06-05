//***void=>출력만할때 매개변수타입=>return할때 X=>객채이폴트값생성/지정***//
import java.util.Scanner;
class Women_IT{
	public String name; //인스턴스 변수
	public static String gender="여성"; // 클래스(static) 변수로 선언하고, 여성으로 초기화
	public  Boolean student;
	
	
	public void Print() {
		System.out.println("이름:"+name+" 성별:"+gender);
		}
	public void Student() {
		if(this.student == true) {System.out.println("학생임");}
		else {System.out.println("교사임");}
		}
	public Women_IT(String n, boolean s) {
		this.name=n;
		this.student=s;
		}

}


public class 연습0417_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//학생,교사 객체 생성
		Women_IT stu = new Women_IT("김상아",true);
		Women_IT tc = new Women_IT("이유나", false);
		stu.Print();
		stu.Student();
		tc.Print();
		tc.Student();
		
	}

}
