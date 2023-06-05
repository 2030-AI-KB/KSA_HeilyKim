//접근제어자: 멤버에 대한 접근을 제어하는 역할
	//public: 어디에서든 자유롭게 접근이 가능
	//private: 자신의 클래스외에는 접근 불허
class Book{
	private String name;
	public String writer;
	public String publish;
	public int year;
	
	// getter, setter
	public String getName() {  //함수를 호출한 객체의 name값 반환
		return name;
		}

	public void setName(String name) { //함수를 호출한 객체의 name 값을 매개변수로 받은 값을 설정
		this.name = name;
		}	
		
	//멤버 함수(메소드)
		//모든 멤버 변수 값 출력하는 메소드 만들기
	public void Print() {
		System.out.println("책 이름: "+name);
		System.out.println("저자 이름: "+writer);
		System.out.println("출판사 이름: "+publish);
		System.out.println("출간년도: "+year);
	}
	
	//생성자: 객체를 생성하는 것 (메소드 중 하나|클래스와 이름 같아야됨)
		//생성자는 보통 멤버 변수들의 초기값을 설정하는 데에 사용됨
		//별도의 생성자가 없을 때에는, 클래스를 선언할 시 장동으로 만들어지는 기본 생성자를 묵시적으로 사용함
	//1> 구현하는 방식-반환형X
		//public className(매개변수타입 매개변수이름,...) {생성자로 실행할 명령들}
	public Book() { //책 클래스에 대한 생성자
		System.out.println("책 클래스에 대한 객체 생성 수행!");
		name="None";
		writer="None";
		publish="None";
		year=0;
	}
	//오버로딩: 메소드의 이름은 같지만, 매개변수의 구성이 다를 경우 공존해서 사용할 수 있다.
		//생성자 뿐만 아니라 일반적인 메소드 및 함수에서도 적용이 가능하다.
	public Book(String n, String w, String p, int y) {
		name = n;
		writer = w;
		publish = p;
		year = y;
	}
	//2> 호출하는 방식
}

public class Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체 생성
		//[클래스명][객체명]=new[생성자 호출]
		Book java = new Book("Java","Lee","땡땡아카데미",2005);
		Book sql = new Book();
		//호출, 참조 
		sql.setName("SQL");  //setName: this(sql).name = name(매개변수로 받는 정보);
		sql.writer="Kim";
		sql.publish="빵빵아카데미";
		sql.year=2010;
		
		java.Print();
		System.out.println();
		sql.Print();
	}

}
