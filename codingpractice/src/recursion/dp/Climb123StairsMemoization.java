package recursion;

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
public class Climb123StairsMemoization {

	  public static void main(String[] args) throws Exception {
		    Scanner scn = new Scanner(System.in);
		    int n = scn.nextInt();
		    int[] qb = new int[n + 1];
		    int paths = countPaths(n, qb);
		    System.out.println(paths);

		    scn.close();
		  }

		  public static int countPaths(int n, int[] qb) {
		    if (n == 0) {
		      return 1;
		    } else if (n < 0) {
		      return 0;
		    }
		    if (qb[n] != 0) {
		      return qb[n];
		    }
		    int p1 = countPaths(n - 1, qb);
		    int p2 = countPaths(n - 2, qb);
		    int p3 = countPaths(n - 3, qb);

		    qb[n] = p1 + p2 + p3;
		    return p1 + p2 + p3;
		  }

}
