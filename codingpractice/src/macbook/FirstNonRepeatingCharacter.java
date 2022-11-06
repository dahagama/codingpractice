package macbook;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {
	
	public static Character nonRepeatingCharacter(String s) {
		HashMap<Character,Integer > wordMap = new HashMap<Character, Integer>();
		for(int i =0;i<s.length();i++) {
			char c = s.charAt(i);
			if(wordMap.containsKey(c)) {
				wordMap.put(c, wordMap.get(c)+1);
			}else {
				wordMap.put(c, 1);
			}
		}
		
		for(int i =0;i<s.length();i++) {
			char c = s.charAt(i);
			if(wordMap.get(c)==1) {
				return c;
			}
		}
		
		return '_';
	}
	
	public static void main(String args[]) {
		System.out.println(nonRepeatingCharacter("aaaaaabbccccccddeeeee"));
	}

}
