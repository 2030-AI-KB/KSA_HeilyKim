import java.util.Scanner;

public class Test_0412_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// - 조건 ::
		//	1330 두 수 비교하기
		//	14681 사분면 고르기
		
		//	- 반복 ::
		//	2741 N 찍기
		//	10872 팩토리얼
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int y = sc.nextInt();
//		
//		if(a == b) {
//			System.out.println("==");
//		}
//		else if(a > b) {
//			System.out.println(">");
//		}
//		else {
//			System.out.println("<");
//		}
		
//		if(x > 0 && y > 0 ) {
//			System.out.println("1");
//		}
//		else if(x < 0 && y > 0) {
//			System.out.println("2");
//		}
//		else if(x < 0 && y < 0) {
//			System.out.println("3");
//		}
//		else {
//			System.out.println("4");
//		}
		
//		for(int i=1; i <= n; i++) {
//			System.out.println(i);
//		}
		
		int re = 1;
		for(int i = 1; i <= n; i++) {
			re *= i;
		}
		System.out.println(re);
	}

}
