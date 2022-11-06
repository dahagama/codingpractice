package macbook;

public class IsPalindrome {
	

	public static void isPalindrome(String input) {
		
        char[] temparray = input.toCharArray();
        int i;
        int l=temparray.length;
        System.out.println("length of the string is:" + l);
        for(i=0;i<l/2;i++) {
        	System.out.println(i+ " : " + temparray[i]);
        	System.out.println(l-1-i + " : " + temparray[l-1-i]);
        	if(temparray[i]!=temparray[l-1-i]) {
        		System.out.println("Not a Palindrome");
        		break;
        	}
        	
        }
		if(i==l/2)
			System.out.println("Palindrome");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
