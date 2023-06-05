import java.util.Scanner;
public class 연습0414 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//백준 2438번: 별 찍기
		
		//1. 값 받기
		int n = sc.nextInt();
		//2. 별 찍기
		for (int i=1;i<=n;i++) {  //행에 대한 출력 제어 - i를 행으로 취급
			for (int k=1;k<=i;k++) {  //열에 대한 출력 제어 - j를 열로 취급 || i가 1/2/...일때 k는 1/2/...번 출력
				System.out.print("*"); //한줄입력
			}
			System.out.println();
		}
		
	}

}
