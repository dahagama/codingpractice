package recursion.dp;

import java.util.Scanner;
/**
 * 
 * @author dhgn99
 * Problem Discussion :
	You are given a number n, representing the number of stairs in a staircase.
	You are on the 0th step and are required to climb to the top.
	In one move, you are allowed to climb 1, 2, or 3 stairs.
	You are required to print the number of different paths via which you can climb to the top.
 *
 */
public class Climb123StairsDP {

	  public static void main(String[] args) throws Exception {
		    Scanner scn = new Scanner(System.in);
		    int n = scn.nextInt();
		    int paths = countPathsTab(n);
		    System.out.println(paths);

		    scn.close();
		  }

		  public static int countPathsTab(int n) {
		    if (n == 0) {
		      return 1;
		    } else if (n < 0) {
		      return 0;
		    }
		    int[] dp = new int[n + 1];

		    dp[0] = 1;
		    for (int i = 1; i <= n; i++) {
		        dp[i] = dp[i - 1];
		        if (i >= 2)
		          dp[i] += dp[i - 2];
		        if (i >= 3)
		          dp[i] += dp[i - 3];
		      }

		    return dp[n];
		  }

}
