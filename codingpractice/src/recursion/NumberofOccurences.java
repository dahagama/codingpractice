package recursion;

import java.util.Scanner;

public class NumberofOccurences {
	
	public static int count(String s, char ch, int index) {
		if(index<0)
			return 0;
		if(s.charAt(index)== ch)
			return 1+count(s,ch,index-1);
		else
			return count(s,ch,index-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s= scan.nextLine();
		//scan = new Scanner(System.in);
		char c = scan.next().charAt(0);
		System.out.println(count(s,c,s.length()-1));
		scan.close();

	}

}
