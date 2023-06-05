import java.util.Scanner;
public class 연습0411 {
	//**************************출력연습**************************//
//	public static void main(String args[]) {
//		System.out.println("안녕하세요");
//		System.out.println("저의 이름은 김상아 입니다");
//		System.out.println("잘부탁드립니다");
//	}
	//**************************입출력 연습**************************//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in); 
//		
//		System.out.println("이름이 뭐에요?");
//		String name = sc.next();
//		
//		System.out.println("나이가 뭐에요?");
//		int age = sc.nextInt();
//		
//		System.out.println("키가 뭐에요?");
//		double height = sc.nextDouble();
//		
//		System.out.println("혈액형이 뭐에요?");
//		String bloodType = sc.next();
//		
//		System.out.println(name+" 프로필- "+"나이: "+age+" 키: "+height+" 혈액형: "+bloodType);
//		
//	}
	//**************************사칙연산 연습**************************//
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 정수");
		int first = sc.nextInt();
		
		System.out.println("두번째 정수");
		int second = sc.nextInt();
		
		System.out.println(first+"+"+second+"="+(first+second));
		System.out.println(first+"-"+second+"="+(first-second));
		System.out.println(first+"*"+second+"="+(first*second));
		System.out.println(first+"/"+second+"="+(first/second));
		System.out.println(first+"%"+second+"="+(first%second));
	}
	
	
	
	
}





