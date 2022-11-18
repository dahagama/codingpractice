package macbook;

import java.util.HashMap;

public class UniqueCharacters {
	
	public static boolean isUnique(String text) {
		//Create an array  representing all unique 128 characters in ASCII.
		//Set a flag to true for each letter.
		
		//Return false when we find we already have a match.
		
		//If length>128 there must be a duplicate.
		if(text.length()>128) return false;
		boolean[] char_set = new boolean[128];
		for(int i=0;i<text.length();i++) {
			int val=text.charAt(i);
			System.out.println(val);
			if(char_set[val]) {
				return false;
			}
			char_set[val]=true;
		}
		return true;
	}

	public static boolean uniqueCharacters(String s) {
		HashMap<Character,Integer > wordMap = new HashMap<Character, Integer>();
		for(int i =0;i<s.length();i++) {
			char c = s.charAt(i);
			if(wordMap.containsKey(c)) {
				return false;
			}else {
				wordMap.put(c, 1);
			}
		}
		return true;				
	}
	
	public static void main(String args[]) {
		System.out.println(" "+ uniqueCharacters("aaaaaabbccccccddeeeee"));
		System.out.println(" "+ uniqueCharacters("abcd"));
		System.out.println(" "+ uniqueCharacters("12344"));
		
		//System.out.println(" "+ isUnique("aaaaaabbccccccddeeeee"));
		System.out.println(" "+ isUnique("abcd"));
		//System.out.println(" "+ isUnique("12344"));
	}
	
	

}
