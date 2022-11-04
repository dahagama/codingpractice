package loops;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n= scan.nextInt();
		int dig=0;
		while(n!=0) {
			n=n/10;
			dig++;
		}
		System.out.println("number of digits: "+dig);
		scan.close();
	}

}
