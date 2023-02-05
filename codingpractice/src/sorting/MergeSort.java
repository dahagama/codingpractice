package sorting;

import java.util.Arrays;

public class MergeSort {
	
	public static void mergeSort(int arr[], int b[], int lb, int ub) {
		if(lb<ub) {
			int mid=(lb+ub)/2;
			mergeSort(arr,b, lb, mid);
			mergeSort(arr,b, mid+1, ub);
			merge(arr,b,lb,mid,ub);
		}
		
	}
	
	public static void merge(int arr[], int b[],int lb, int mid,int ub) {
		int i=lb;
		int j=mid+1;
		int k=lb;
		while(i<=mid && j<=ub) {
			if(arr[i]<=arr[j]) {
				b[k]=arr[i];
				i++;
			}else {
				b[k]=arr[j];
				j++;
			}
			k++;
		}
		
		if(i>mid) {
			while(j<=ub) {
				b[k]=arr[j];
				j++;k++;
			}
		}else {
			while(i<=mid) {
				b[k]=arr[i];
				i++;k++;
			}
		}
		
		for( k=lb;k<=ub;k++) {
			arr[k]=b[k];
		}
		
		
	}
	
	public static void mergeSortRecursive(int a[], int n) {
		if(n<2)
			return;
		int i,mid=n/2;
		int l[]= new int[mid];
		int r[]= new int[n-mid];
		
		for(i=0;i<mid;i++) {
			l[i]=a[i];
		}
		for(i=mid;i<n;i++) {
			r[i-mid]=a[i];
		}
		mergeSortRecursive(l,mid);
		mergeSortRecursive(r,n-mid);
		merge(a,l,r,mid,n-mid);
		
	}
	
	static void merge(int[] a,int[] l,int[] r,int left, int right) {
		int i=0,j=0,k=0;
		while(i<left && j<right) {
			if(l[i]<=r[j])
				a[k++]=l[i++];
			else
				a[k++]=r[j++];
		}
		
		while(i<left)
			a[k++]=l[i++];
		while(j<right)
			a[k++]=r[j++];
	}
	
	public static void main(String args[]) {
		int arr[]= {2,5,0,6,9,3,12,4};
		int b[] = new int[arr.length];
		//mergeSort(arr,b, 0, arr.length-1);
		//System.out.println(Arrays.toString(arr));
		
		mergeSortRecursive(arr,arr.length);
		System.out.println(Arrays.toString(arr));
		
	}

}
