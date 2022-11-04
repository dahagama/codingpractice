package recursion;

import java.util.Scanner;

public class LCM {
	
	static int lcmVal=1;
	int lcm(int n1, int n2) {
		if(lcmVal%n1==0 && lcmVal%n2==0) {
			return lcmVal;
		}
		lcmVal++;
		lcm(n1,n2);
		return lcmVal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter n1 value:");
		int n1=scan.nextInt();
		System.out.println("Enter n2 value:");
		int n2=scan.nextInt();
		LCM l=new LCM();
		System.out.println("LCM value is: "+l.lcm(n1, n2));
	}

}
