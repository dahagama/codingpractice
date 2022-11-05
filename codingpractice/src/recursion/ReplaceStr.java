package recursion;

import java.util.Scanner;

public class ReplaceStr {
	
	public static String replaceStr(String s, int index) {
		if(index<1)
			return s.substring(0, index+1);
		if(s.substring(index-1, index+1).equalsIgnoreCase("pi"))
			return replaceStr(s,index-2)+"3.14";
		else
			return replaceStr(s, index-1)+ s.charAt(index);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s= scan.nextLine();
		System.out.println(replaceStr(s, s.length()-1));
		scan.close();
	}

}
