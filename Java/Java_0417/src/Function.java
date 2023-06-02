import java.util.Scanner;
public class Function {
	//function: 프로그램에게 지시할 명령문들의 묶어놓은 것
	//함수안에 함수를 작성할 수 없기에 외부에 선언
	// 반환: return
	// 반환형: 뱉어내는 값의 타입 *다르면 에러남
	// 매개변수: 함수를 실행할 때 필요한 정보를 전달받는 역할(순서대로 들어옴)
	//함수 선언부 원형
	//반환형 함수이름(매개변수타입 매개변수 이름,...){}
	static int s1() {
		return 1+1;
	}
	static int sum(int a, int b) {
		System.out.println("덧셈수행!");
		return a+b;
	}
	public static void main(String[] args) {   
		// TODO Auto-generated method stub
		//프로그램을 실행하면, 메인함수에있는 내용만 실행
		Scanner sc = new Scanner(System.in);
		//ex: 2개의 숫자를 입력받고, 이들의 합을 출력하기
			//1. 2개의 숫자 입력받기
		int a = sc.nextInt();
		int b = sc.nextInt();
		s1();
			//2. 2개의 숫자 합 출력
			//반한값은 함수를 호출한 장소에서 받아낸다.
		System.out.println(sum(a,b));  //함수호출: [함수이름](전송할값,..)
	}

}
