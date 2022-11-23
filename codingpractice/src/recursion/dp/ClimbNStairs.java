package recursion.dp;

import java.util.Scanner;

public class ClimbNStairs {
	
	  public static int countPaths(int[] arr, int index, int len) {
		    if (index == len) {
		      return 1;
		    }
		    int count = 0;
		    for (int jump = 1; jump <= arr[index]; jump++) {
		      if ((jump + index) <= len) {
		        count += countPaths(arr, jump + index, len);
		      } else {
		        break;
		      }
		    }
		    return count;
		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]= scn.nextInt();
		}
		
		int paths = countPaths(arr, 0, n);
		System.out.println(paths);
		scn.close();
	}

}
