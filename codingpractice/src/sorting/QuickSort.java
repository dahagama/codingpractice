package sorting;

import java.util.Arrays;

public class QuickSort {
	
	public static int partition(int a[],int lb, int ub) {
		
		int pivot= a[lb];
		int start=lb;
		int end=ub;
		
		while(start<end) {
			while(a[start]<=pivot) {
				start++;
			}
			while(a[end]>pivot) {
				end--;
			}
			if(start<end) {
				swap(a[start],a[end]);
			}
			
		}
		swap(a[lb],a[end]);
		return end;
	}
	
	public static void swap(int a, int b) {
		int temp=a;
		a=b;
		b=temp;
	}
	
	public static void quickSort(int a[], int lb, int ub){
		if(lb<ub) {
			int loc=partition(a, lb, ub);
			System.out.println(loc);
			quickSort(a, lb, loc-1);
			quickSort(a, loc+1, ub);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,5,0,6,9,3,12,4};
		System.out.println(Arrays.toString(arr));
		quickSort(arr,0, arr.length-1);
		System.out.println(Arrays.toString(arr));

	}

}
