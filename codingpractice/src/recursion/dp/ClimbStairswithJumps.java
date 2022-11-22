package recursion.dp;

import java.util.Scanner;

public class ClimbStairswithJumps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn= new Scanner(System.in);
		int n= scn.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		
		int[] dp=new int[n+1];
		dp[n]=1;
		for (int i = n - 1; i >= 0; i--) {
		      for (int reach = i + 1; reach <= Math.min(n, i + arr[i]); reach++) {
		        dp[i] += dp[reach];
		      }
		    }
		System.out.println(dp[0]);
		scn.close();
	}

}
