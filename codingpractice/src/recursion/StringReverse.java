package recursion;

public class StringReverse {
	
	public static String strrev(String s) {
		if(s==null || s.length()<=1)
			return s;
		return strrev(s.substring(1))+s.charAt(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(""+strrev("Dahagama"));
	}

}
