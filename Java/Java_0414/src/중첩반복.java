import java.util.Scanner;
public class 중첩반복 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//2중 반복(feat. 2차원배열)
		
		//예제: 4명 학생의 국영수 점수를 받고 각 학생의 성적 평균을 내어라
		//학생을 행으로 취급, 과목을 열로 취급
		//1.국영수 점수 입력
		int score[][]=new int[4][3]; //{0-3}{0-2}
		for (int i=0;i<4;i++) {
			for (int k=0;k<3;k++) {         //순서: i=0 k=0 -> k가 2될때까지 돔 => i=1 k=0 -> k가 2될때까지 돔 .... ==>행0 다채우고 행1 ....
				score[i][k]=sc.nextInt();
				}		
			}
		//2.성적 평균 연산
		for (int i=0;i<4;i++) {
			//1)합계 구하기
			int sum=0;
			for (int k=0;k<3;k++) {
				sum+=score[i][k]; //특정 학생의 국영수 점수 덧셈 연산
				}
			//여까지 오면 i번째 국영수 합계가 sum에 있음
			//2)평균 구하기
			double avg=sum/3.0;
			System.out.println((char)(i+'A')+"번째 학생의 평균은 "+avg);
			}

	
	
	}

}
