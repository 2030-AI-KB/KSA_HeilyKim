import java.util.Scanner;
public class 낙서장 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int student [] = new int[30];
		int umm [] = new int [2];
		int a = 0;
		for (int i=0;i<30;i++){
		    a+=1;
		    student[i] = a;
		    }
		//System.out.println(student[0]);
		int f = 0;
		for (int i=0;i<28;i++){
			int b = sc.nextInt();
		    for (int j=0;j<30;j++) {
		    	if (student[j]!=b) {umm[f] = b;f++;}
		    	}
		    }
		if (umm[0]>umm[1]) {System.out.println(umm[1]);System.out.println(umm[0]);}
		else {System.out.println(umm[0]);System.out.println(umm[1]);}
	}

}
