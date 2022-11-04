package recursion;

public class RemoveCharacter {
	
	public static String removeCharacter(String s,int index) {
		if(index<0)
			return "";
		else if(s.charAt(index)=='x')
			return removeCharacter(s, index-1);
		else
			return removeCharacter(s, index-1)+s.charAt(index);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="axbxcxdx";
		System.out.println(removeCharacter(s, s.length()-1));
	}

}
