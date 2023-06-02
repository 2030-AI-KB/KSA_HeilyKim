import java.util.Scanner;
//인터페이스: 추상 클래스와 매우 유사
	//구체적으로 명시된 멤버 함수가 거의 없다고 보아도 됨 == 껍다구
	//인터페이스의 모든 필드는 변수가 아닌 상수로 취급

//interface 키워드를 이용해 인터페이스 구현
interface Animal{
	//멤버 함수는 모두 추상 클래스로, 필드는 모두 상수로 선언한다
	//static: 해당 클래스를 통해 만들어진 객체가 "공유"하는 값 (한명이 봐뀌면 바뀌겠다)
	//final: 상수선언 키워드
	public static final String location = "빵빵동물원";
	abstract public void cry();
}

class Cat implements Animal{
	//멤버: Location 상수, cry() 함수
	public void cry() {
		System.out.println("애옹애옹");
	}
}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//X/Animal a = new Animal();    ==> 추상 클래스와 마찬가지로, 인터페이스 자체만으론 객체 생성 X
		//인터페이스를 상속받아 추상 메소드 정의를 해야 객체 생성이 가능하다.
		Cat c = new Cat();
		System.out.println("위치하는 곳: "+c.location);
		c.cry();
		
	}

}
