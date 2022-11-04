package recursion;

import java.util.Scanner;

public class NestingParanthesis {
	
	public static boolean checkParanthesis(String s, int i, int j) {
		if(i>j)
			return true;
		if(s.charAt(i)=='(' && s.charAt(j)==')')
			return checkParanthesis(s, i+1, j-1);
		else
			return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s= scan.nextLine();
		System.out.println(checkParanthesis(s,0,s.length()-1));
		scan.close();
	}

}
