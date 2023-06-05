import java.util.Scanner;
public class 연습0413 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//----369게임----
		//(무한 반복문+100되면 종료)//
		int n =1;
			while(true) {
				if (n%10==3 ||n%10==6 ||n%10==9 || n/10==3|| n/10==6|| n/10==9) {
					n++;
					System.out.println("박수 짝");
					continue;
					}
				if (n==100) {break;}
				System.out.println(n);
				n++;
				}
			//---쌤꺼---//
			while(true) {
				if(n==100){break;} //while문 나감
				int a1=n/10; //십의 자리
				int a2=n%10; // 일의 자리
				if(a1==3 ||a1==6||a1==9||a2==3||a2==6||a2==9) {
					System.out.println("박수 짜악");
					n++;
					continue;
				}
				System.out.println(n);
				n++;
			}
		
		
	}
}
