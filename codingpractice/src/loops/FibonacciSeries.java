package loops;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n= scan.nextInt();
		int a=0;
		int b=1;
		for(int i=0;i<n;i++) {
			System.out.println(a);
			int c=a+b;
			a=b;
			b=c;
		}
		scan.close();

	}

}
