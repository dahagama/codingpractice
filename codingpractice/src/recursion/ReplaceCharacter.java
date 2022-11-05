package recursion;

import java.util.Scanner;

public class ReplaceCharacter {
	public static String replace(String s, int index) {
		if(index<0)
			return "";
		if(s.charAt(index)=='x')
			return replace(s, index-1)+"y";
		else
			return replace(s, index-1)+s.charAt(index);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s= scan.nextLine();
		System.out.println(replace(s, s.length()-1));
		scan.close();

	}

}
