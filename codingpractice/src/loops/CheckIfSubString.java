package loops;

public class CheckIfSubString {
	
	//check if s2 is a substring of s1
	static int isSubstring(String s1, String s2)
    {
		int l1=s1.length();
		int l2=s2.length();

		for(int i=0;i<=l1-l2;i++) {
			for(int j=0;j<l2;j++) {
				if(s1.charAt(i+j)!=s2.charAt(j)) {
					break;
				}
				if(j==l2-1) {
					return i;
				}
			}
			
		}
		
		return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1 = "Naresh Dahagama";
        String s2 = " ";
 
        int res = isSubstring(s1, s2);
 
        if (res == -1)
            System.out.println("Not present");
        else
            System.out.println("Present at index " + res);

	}

}
