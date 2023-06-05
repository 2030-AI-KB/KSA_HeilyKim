
public class dowhileJava {
public static void main(String[] args) {
	//반복문: 특정 조건을 만족할 때마다 명령문을 반복하는 구문|반복문 설계시 실행의 끝이 존재해야함
	//종류: for/while/do while
	//----ex1: 1-10까지 출력----//
//---------------while(조건문){만족할때마다 반복함}---------------//
//	int n=1;
//	while(n<=10) {
//		System.out.println(n);
//		n++; // 증감연산자: ++, --
//	}
//	int a =1;
//	System.out.println("a++: "+(a++)); //a++ -> 1 :a를 먼저 뱉고 ++를 함   | 후위연산자
//	System.out.println("++a: "+(++a)); //++a -> 3 :++를 먼저 하고 a를 뱉어냄   |전위연산자
//
//---------------for문---------------//
//	//for (제어변수[1-첫번째만 실행됨];조건[2];제어변수에 데한 연산[4]){[3];}
//	for(int n = 1; n<=10; n++) {
//		System.out.println(n);
//	}
	
//---------------do while문---------------//
//	do {
//		실행할 명령문
//	}while(조건문);
	int var = 1;
	do {
		System.out.println(var);
		var++;
	}while(var<=10);
//	do {
//		실행할 명령문
//	}while(true/false); true->조건에 상관없이 실행   false->조건에 상관없이 실행 x







	
	}
}
