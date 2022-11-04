package loops;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {
	
	public char firstNonRepeatingCharacter(String s) {
		for(int i=0;i<s.length();i++) {
			boolean seenDuplicate=false;
			for(int j=0;j<s.length();j++) {
				if(s.charAt(i) == s.charAt(j) && (i!=j)) {
					seenDuplicate = true;
					break;
				}
			}
			if(!seenDuplicate) return s.charAt(i);
		}
		return '_';
	}
	
	public char firstNonRepeatingCharacterusingHashMap(String s) {
		HashMap<Character, Integer> char_counts=new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(char_counts.containsKey(c)) {
				char_counts.put(c,  char_counts.get(c)+1);
			}else {
				char_counts.put(c, 1);
			}
		}
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(char_counts.get(c) ==1) return c;
		}
		return '_';
	}
	
	public char firstNonRepeatingCharacterusingArray(String s) {
		int[] char_counts = new int[26];
		
		for(char c : s.toCharArray()) {
			System.out.println("char num: "+ (c-'a'));
			char_counts[c-'a']++;
		}
		
		for(char c: s.toCharArray()) {
			if(char_counts[c-'a']==1) return c;
		}
			
		return '_';
	}
	
	public static void main(String args[]) {
		FirstNonRepeatingCharacter f= new FirstNonRepeatingCharacter();
		System.out.println(""+ f.firstNonRepeatingCharacter("abacabad"));
		System.out.println(""+ f.firstNonRepeatingCharacterusingHashMap("abacabad"));
		System.out.println(""+ f.firstNonRepeatingCharacterusingArray("abacabad"));
	}
	
}
