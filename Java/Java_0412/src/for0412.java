
public class for0412 {
	public static void main(String[] args) {
		// 제어변수 :: 반복문의 실행을 제어하는 역할 
		//	for(제어변수(v) 선언; 조건문; v에 대한 연산(증감연산자를 많이 쓴다)) {
		//		조건문을 만족할 시 반복할 명령문
		//	}
		// () 안은, 조건문을 제외하고는 모두 생략이 가능
		
		// 예제 :: 1부터 10까지 순서대로 출력하는 프로그램
		
//		int n = 1;
//		while(n<=10) {
//			// 반복할 명령문 :: n을 1씩 증가, 출력문
//			System.out.println(n);
//			n++;	//n = n+1;
//		}
		
		for(int n = 1; n<=10; n++) {
			System.out.println(n);
		}
	}
}
