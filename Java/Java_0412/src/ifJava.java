import java.util.Scanner;
public class ifJava {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//비교연산자: <,>,<=,>=,==(같다),!=
		//대입연산자: =(오른쪽의 값을 왼쪽에 대입한다)
		//복합대입연산자: +=, -=, *=, /=, %=
		//논리연산자: &&(and),||(or)
		//**조건문(if) "만약에 ~한다면", 조건을 따지면서 명령문을 선택하게끔 하는 구문
		// if-else if-else|switch 
		//-------------if(조건){명령문}-------------//
		//예제: 입력받는 평점에 따라 학점을 출력하기 
		//1. 평점 입력받기
		int score;
		score=sc.nextInt();
		//2. 평점에 따라 학점 출력하기
//		if(score>=90) {
//			System.out.println("A학점이다");
//		}
//	//	if(score>=80&&score<90) {
//	//		System.out.println("넌 B");
//	//	}
//		else if(score>=80) {
//			System.out.println("넌 B학점이다");
//		}
//		else if(score>=70) {
//			System.out.println("넌 C학점이다");
//		}
//		else if(score>=60) {
//			System.out.println("넌 D학점이다");
//		}
//		else {
//			System.out.println("넌 F학점이다");
//		}
		
		//-------------switch 조건문-------------//
//		switch(값을 비교할 변수 v){
//		case[값1]:값1과 v가 같을경우 실행할 명령문
//		break;
//		case[값2]:값2과 v가 같을경우 실행할 명령문
//		break;
//		default:위의 case에 제시된 값들과 모두 같지 안흘 경우 실행할 명령문
//			}
		score=score/10;
		System.out.println("연산처리된 값: "+score);
//		switch(score) {
//		case 10:
//		case 9:
//			System.out.println("A학점");
//			break;
//		case 8:
//			System.out.println("B학점");
//			break;
//		case 7:
//			System.out.println("C학점");
//			break;
//		case 6:
//			System.out.println("D학점");
//			break;
//		default:
//			System.out.println("F학점");	
//		}
//--switch에서 if 바꾸기//		
		if(score==10 || score==9) {
			System.out.println("A");
			}
		else if (score==8) {
			System.out.println("B");
			}
		else if (score==7) {
			System.out.println("C");
		}
		else if (score==6) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		
	}
}
















