import java.util.Scanner;
public class 배열 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		//배열: 같은 타입의 여러 값을 저장할 수 있는 변수 공간
		//**배별 선언
		//(타입)(배열이름)[] = new (타입)[배열크기];		
		int arr[]=new int[5]; //이름이 arr인 정수형 배열을 선언하고 크기는 5		
		// arr 배열의 배열번호는 0-4번까지 있다.(5번은 없음)
		
		//**배열값 저장: (배열이름)[배열 인덱스] = (저장할 값);
		arr[0]=100; //->0번째 공간에 100을 저장
		
		//**값 얻어오기
		System.out.println(arr[0]);

		//예시: 5명의 학생 성적을 입력받고, 이들의 합계와 평균을 구하자//
			//1. 5명 학생 성적 입력 받기->성적 저장할 공간인 배열 서언
		int score[]=new int[5];
		for(int i=0;i<5;i++) {
			score[i]=sc.nextInt();
		}
			//2. 5명 학생 성적 합계 구하기
		int sum=0;
		for(int i=0;i<5;i++) {
			sum+=score[i]; //현재 sum에 i번째 score값을 더해서 저장.
		}
			//3. 5명 학생 성적 평균 구하기
				// 정수/정수=정수
				// 실수/정수=실수
				// 정수/실수=실수
		double avg=(double)sum/5;
			//4. 출력
		System.out.println("성적 합계 "+sum);
		System.out.println("성적 합계 "+avg);

		
		
		
		
		
		
		
	}

}
