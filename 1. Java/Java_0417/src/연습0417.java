import java.util.Scanner;
public class 연습0417 {

	static void clock(int hr, int min, int sec) { //return을 안할때는 void를 써야됨(변환타입X) 
		System.out.println("현재 시각은 "+hr+"시 "+min+"분 "+sec+"초 입니다.");
	};
	static void ap(int hr) {
		if (hr<12) {
			System.out.println("현재는 오전입니다.");}
		else {
			System.out.println("현재는 오후입니다.");
		}
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int hr = sc.nextInt();
		int min = sc.nextInt();
		int sec = sc.nextInt();
		clock(hr,min,sec);
		ap(hr);
	}

}
