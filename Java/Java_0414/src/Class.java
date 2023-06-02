import java.util.Scanner;
//***클래스: 객체를 만들기 위해 존재하는 '틀'| ->객체를 찍어내는 역할
//		->자료형 및 타입을 임으로 정의해서 사용하는 '틀'
//**객체: 실생활 속에 존재하는 모든 물체/사물
// 		->*클래스를 통해 만들어진것
//--클래스:붕어빵틀 --객체:붕어빵들 --인스턴스:팥붕, 슈븅
//--클래스:이력서 양식 --객체:니 내 다른사람들의 이력서들 --인스턴스:그중 하나 이력서

class Person{
	//상태->*멤버 변수
		//멤버 변수 선언:   [접근제어자][타입][변수이름];
	public String name;
	public String gender;
	//행동->*멤버 함수
	
}
public class Class { //**대표 클래스: main을 여기에 작성   | 실행 버튼을 누르면 얘를 실행함(main 함수), 고로 파일안에 대표 클래스가 반드시 하나는 있어야됨

	public static void main(String[] args) {  //**main 함수
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//객체 생성: [클래스 명][객체명]=new[클래스명]();
		Person kim = new Person();
		Person park = new Person();
		//객체 멤버 접근: [객체명].[멤버이름]
		kim.name = "sanga";
		kim.gender = "woman";
		park.name = "whoever";
		park.gender = "man";
		System.out.println("kim'name: "+kim.name);
		System.out.println("kim'gender: "+kim.gender);
		System.out.println("park'name: "+park.name);
		System.out.println("park'gender: "+park.gender);
	
	
	
	
	
	}

}
