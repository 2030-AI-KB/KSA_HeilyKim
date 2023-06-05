//상속: 부모가 자식에게 물려준다
	//extends => 부모 클래스의 멤버들을 자식 클래스에게 물려주는 문법
	//		  => 부모 클래스의 멤버를 복사하여 자기자신에게 붙혀넣는다
	//자식 클래스의 멤버 = 부모 클래스의 멤버 + 자신만의 멤버(depends)
//예제: Phone, SmartPhone 클래스 구현
class Phone{                   //2G폰 부모
	public String tel; //phoneNum
	public boolean touch;  //tab이 되는지 안되는지
	
	public void Print() {
		System.out.println("tel no:"+tel);
		System.out.println("tab:"+touch);
	}
}
class SmartPhone extends Phone{       //자식
	//부모한테 물려받음
		//public String tel; 
		//public boolean touch;
		//Print()
	public String os;
	public void Print() { 								// 오버라이딩: 부모 클래스의 메소드를 자식 캘래스에서 "재정의"하는 문법 
		System.out.println("tel no:"+this.tel);   		 	// => 함수의 내용을 "덮어쓰기" 한다
		System.out.println("tab:"+this.touch);				//*함수이름과 매개변수 구성 모두 똑같이해서 "덮어쓰기" 수행
		System.out.println("os verison:"+this.os);
	}
}




public class 상속 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체 생성
		Phone p = new Phone();
		p.tel = "010-1234-5678";
		p.touch = false;
		SmartPhone sp = new SmartPhone();
		sp.tel = "010-9546-4555";
		sp.touch = true;
		sp.os = "Icecream_sandwich";
		p.Print();
		sp.Print();
		

	}

}
