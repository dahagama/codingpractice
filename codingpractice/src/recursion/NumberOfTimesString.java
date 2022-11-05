package recursion;

import java.util.Scanner;

public class NumberOfTimesString {
	
	public static int count(String s, int index) {
		if(index<3)
			return 0;
		if(s.substring(index-3, index+1).equalsIgnoreCase("very"))
			return 1+count(s,index-3);
		else
			return count(s, index-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s= scan.nextLine();
		System.out.println(count(s, s.length()-1));
		scan.close();
	}

}
