package loops;

import java.util.Scanner;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int t= scan.nextInt();
		for(int i=0;i<t;i++) {
			int n= scan.nextInt();
			int count=0;
			for(int div=1;div<=n; div++) {
				if(n % div==0) {
					count++;
				}
			}
			
			if(count ==2) {
				System.out.println("prime");
			}else {
				System.out.println("not prime");
			}
		}
		scan.close();

	}

}
