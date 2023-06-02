import java.util.Scanner; // **입력문 작성 시 필수로 작성할 것
//해당 파일에 java.util.Scanner 라이버리 불러오기
public class input {
	public static void main(String[] args) {
		//변수(변하는 숫자) 상수(변하지 않는 숫자) 
				//타입의 종류: 
				int i; //integer 정수-소수점x
						//int에 실수를 입력할경우 수소점 밑의 숫자를 제외하고 저장함
				long l; //long 정수 int 보다 표현범위가 넓음
				float f; //float 실수-소수점
				double d; //double 실수-소수점 | float형보다 더 자세한(자릿수) 표현 가능
				char c; //character 문자1개
				String s; //string 문자열 (한글은 무조건 str)
				
				//변수 응용
				//변수 선언: [타입] [변수이름];
						// int num;
				//값 저장(변경): [변수이름] = [저장할 값];
						// num = 10;
				//초기화: [타입] [변수이름]= [저장할 값];
						//변수를 선언함과 동시에, 초기값을 바로 저장하게끔 하는 문법
						// int num = 10;
				//입력문
				Scanner sc=new Scanner(System.in); //Scanner를 sc라는 이름으로 사용한다.
				int v1=sc.nextInt(); //int 변수 입력문
				long v2=sc.nextLong(); //long 변수 입력문
				float v3=sc.nextFloat();  //float 변수 입력문
				double v4=sc.nextDouble(); //double 변수 입력문
				char v5=sc.next().charAt(0); //char
				String v6=sc.next(); //str
						
						
						
		}
}
