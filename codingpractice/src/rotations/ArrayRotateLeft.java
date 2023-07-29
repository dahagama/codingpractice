package rotations;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotateLeft {
	
	static int[] rotateLeft(int a[], int r) {
		
		int prev, temp, i, j;
		for(i=0;i<r;i++) {
			
			prev=a[i];
			
			for(j=a.length-1;j>=0;j--) {
				temp=a[j];
				a[j]=prev;
				prev=temp;
			}
			
			
		}
		
		return a;
	}
static int[] rotateRight(int a[], int r) {
		
		int prev, temp, i, j;
		for(i=0;i<r;i++) {
			
			prev=a[a.length-1];
			
			for(j=i;j<a.length;j++) {
				temp=a[j];
				a[j]=prev;
				prev=temp;
			}			
			
		}
		
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj= new Scanner(System.in);
		int a[]= {1,2,3,4,5};
		System.out.println("Enter number of rotations(r): ");
		int r= obj.nextInt();
		// System.out.println("Before rotation: "+Arrays.toString(a));
		// rotateLeft(a, r);
		// System.out.println("After rotation: "+Arrays.toString(a));
		
		
		System.out.println("Before rotation: "+Arrays.toString(a));
		rotateRight(a, r);
		System.out.println("After rotation: "+Arrays.toString(a));
		
	}

}
