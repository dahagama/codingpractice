package sorting;

import java.util.Arrays;

public class InsertionSort {
	
	static void insertionSortAsc(int a[]) {
		int j,temp,n=a.length;
		
		for(int i=1;i<n;i++) {
			temp=a[i];
			j=i-1;
			while(j>=0 && a[j]>temp) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
	}
	
	public static void main(String args[]) {
		int a[] = {1,9,3,8,7,5,2,4};
		System.out.println("before sorting=====>"+Arrays.toString(a));
		insertionSortAsc(a);
		System.out.println("after sorting asc==>"+Arrays.toString(a));
	}

}
