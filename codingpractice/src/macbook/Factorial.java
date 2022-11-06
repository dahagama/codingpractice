package macbook;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Factorial {
	
	
	public int fact(int n) {
		if(n==1 || n==0) {
			return 1;
		}else {
			return n*fact(n-1);
		}		
	}
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String args[]) {
		
		Factorial f = new Factorial();
				
		int llistCount = scanner.nextInt();
	    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	    for (int i = 0; i < llistCount; i++) {
	        int llistItem = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        System.out.println(f.fact(llistItem));
	    }

	    scanner.close();
		}
	}


