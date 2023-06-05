//추상 클래스 (+추상 메소드)

//추상 클래스 구현
	//abstract class 클래스 이름{클래스에 들어갈 멤버}

//추상 클래스에는 추상 메소드를 하나 이상을 포함해야함
abstract class Animal{   //추상 클래스 & 부모클래스
	//본래 메소드는 함수 선언 + 함수 구체화 형태가 같이 있어야하지만 
	//추상 메소드의 경우는 함수 선언만 함
		//=> abstract[메서드 선언부(접근제어자,반환형,함수이름 등)];
	abstract public void cry();   //함수선언만 되있고 명령문이 없음 ==> 추상

}
class Cat extends Animal{   //자식클래스
	//부모클래스에서 선언만 되어있는 cry()함수를 전달받음 => cry() 함수에 대한 명령문 작성은 자식 클래스에게 떠넘기고 있는 상황 == 오버라이딩
	public void cry() {
		System.out.println("애옹");
	}
}
class Dog extends Animal{   //자식클래스
	//부모클래스에서 선언만 되어있는 cry()함수를 전달받음 => cry() 함수에 대한 명령문 작성은 자식 클래스에게 떠넘기고 있는 상황 == 오버라이딩
	public void cry() {
		System.out.println("왈왈");
	}
}

public class 추상 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 추상 클래스를 통해서 객체를 바로 생성할 수 없음
			//=>추상 클래스를 상속받은 클래스에서 구체화하여 객체를 생성해야함(==오버라이딩 개념)
		Cat c = new Cat();
		Dog d = new Dog();
		c.cry();
		d.cry();
	}

}
