import java.util.Scanner;
public class 반복문_예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//1-10까지 출력
		//break문: 이 명령문을 만나면 현재 실행되는 반복문 강제 종료
		int num = 1;
		while (true) {
			if(num>10) {break;} // num이 11이 되면 break문을 만남
			//System.out.print("아직 반복문 ");
			//System.out.println(num);
			num++;
			}

		//1-10까지 홀수만 출력
		//continue문: 이 명령문을 만나면 반복문 가장 첫부분에 돌아감
		int n=1;
		while(n<=10) {
//			if(n%2==1){
//			System.out.println(n);
//			}
//			n++;
			if(n%2==0) {
				System.out.println(n+" continue사용");
				n++;
				continue;
			}
			System.out.println(n);
			n++;
			
		}
		
		
		
		
		
		
		
}
}

