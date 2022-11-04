package recursion;

import java.util.Scanner;

public class AddXtoIndenticalChars {

	public static String addX(String s, int index) {
		if(index<1)
			return s.substring(0, index+1);
		if(s.charAt(index-1)==s.charAt(index))
			return addX(s, index-1)+"*"+s.charAt(index);
		else
			return addX(s, index-1)+s.charAt(index);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s= scan.nextLine();
		System.out.println(addX(s, s.length()-1));
		scan.close();
	}

}
