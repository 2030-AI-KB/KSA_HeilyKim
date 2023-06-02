import java.util.Scanner;
public class nextLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//char c = sc.next().charAt(0);
		String s =sc.next();		//공백 문자열도 출력 안됨 hello world => hello
		sc.nextLine();				// nextline이 공백도 받아서 s에서 s2 입력할때의 enter를 얘가 받고 소멸
		String s2 = sc.nextLine();  //공백/enter 문자열도 출려 됨 hello world => hello world
		System.out.println(s);
		System.out.println(s2);  
	
		//숫자형 정보와 문자형 정보를 섞어서 입력받을 때, 변수에 입력값이 제대로 들어가지 않았다면,
		//nextLine()을 통해 입력되는 Enter값을 날린다.
	
	
	}

}
