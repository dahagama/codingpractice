package macbook;

import java.util.Arrays;

public class PermutationDetector {
	
	public boolean isPermutation(String text, String perm) {
		if(perm.length()!=text.length()) return false;
		
		return sort(text).equals(sort(perm));
	}
	
	private String sort(String s) {
		char[] content=s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PermutationDetector pdetector = new PermutationDetector();
		System.out.println(pdetector.isPermutation("abc", "bacd"));

	}

}
