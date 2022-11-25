package searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchForAKey {
	
	static int binarySearch(int a[], int key) {
		int l=0,h=a.length-1,mid;
		
		while(l<=h) {
			mid=(l+h)/2;
			if(a[mid]==key) {
				return mid;
			}else if(a[mid]<key) {
				l=mid+1;
			}else {
				l=mid-1;
			}
		}
		
		return -1;
	}
	
	static int binarySearch(int a[], int l, int h, int key) {
		
		
		if(l<=h) {
			int mid=(l+h)/2;
			if(a[mid]==key) {
				return mid;
			}else if(a[mid]<key) {
				return binarySearch(a, mid+1,h,key);
			}else {
				return binarySearch(a,l,mid-1,key);
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter arrar size:");
		int n=scn.nextInt();
		int a[]=new int[n];
		System.out.println("Enter " +n +"values: ");
		for(int i=0;i<n;i++) {
			a[i]=scn.nextInt();
		}
		System.out.println("Enter the value to search");
		int key=scn.nextInt();
		
		Arrays.sort(a);
		System.out.println(binarySearch(a, key));
		int l=0,h=a.length-1;
		System.out.println(binarySearch(a,l,h, key));
		scn.close();

	}

}
