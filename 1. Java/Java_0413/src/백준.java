import java.util.Scanner;
public class 백준 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//10950번문제
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int sum=a+b;
			System.out.println(sum);
		}
		//10952번문제
		while(true) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(a==0&&b==0) {break;}
			System.out.println(a+b);
			
		}		
		//10872번 팩토리얼
		int N=sc.nextInt();
		int result=1;
		for (int i =1;i<=N;i++) {
			result*=i;
		}
		System.out.println(result);
			//--or--//
		int N2=sc.nextInt();
		int result2=1;
		while(N2>0) { //N2가 양수라면
			result2*=N2;
			N2--;
		} //N2가 0이되면 while 종료
		System.out.println(result2);
		
		//10871번
		int n2=sc.nextInt();
		int a[]=new int[n2];
		
		int x=sc.nextInt();
		
		for (int i2=0;i2<n2;i2++) { //0부터 (n2-1)까지
			a[i2]=sc.nextInt();
		}
		
		for (int i2=0;i2<n2;i2++) {
			if (a[i2]<x) {
				System.out.print(a[i2]+" ");
			}
		}
	}
	
}
