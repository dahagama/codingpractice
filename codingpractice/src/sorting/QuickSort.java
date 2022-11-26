package sorting;

import java.util.Arrays;

public class QuickSort {
	
	public static int partition(int a[],int lb, int ub) {	
		System.out.println(Arrays.toString(a));
		int pivot= a[lb];
		System.out.println("pivot: "+pivot + "lb:" +lb +"ub: "+ub);
		int start=lb;
		int end=ub;		
		while(start<end) {
			System.out.println("start: "+start);
			System.out.println("end: "+end);
			while(a[start]<=pivot) {
				start++;
				System.out.println("1 : start: "+ start + " : "+ a[start]+" pivot: "+pivot);
			}
			while(a[end]>pivot) {
				end--;
				//System.out.println("2 :"+end);
				System.out.println("2 : end: "+end +" : " +a[end]+" pivot: "+pivot);
			}			
			if(start<end) {
				System.out.println("3 :");
				System.out.println("a[start]: " + a[start]+ ": a[end]: "+ a[end]);
				swap(a[start],a[end]);
			}			
		}
		swap(a[lb],a[end]);
		return end;
	}
	
	public static void recursiveQuickSort(int[] array, int startIdx, int endIdx) { 
		int idx = partition1(array, startIdx, endIdx); // Recursively call quicksort with left part of the partitioned array 
		if (startIdx < idx - 1) { recursiveQuickSort(array, startIdx, idx - 1); } // Recursively call quick sort with right part of the partitioned array 
		if (endIdx > idx) { recursiveQuickSort(array, idx, endIdx);
		}
		}
		
	public static int partition1(int[] array, int left, int right) {
		int pivot = array[left];
		while (left <= right) {
			// searching number which is greater than pivot, bottom up
			while (array[left] < pivot) {
				left++;
			} // searching number which is less than pivot, top down
			while (array[right] > pivot) {
				right--;
			} // swap the values
			if (left <= right) {
				int tmp = array[left];
				array[left] = array[right];
				array[right] = tmp;
				left++;
				right--;
			}
		}
		return left;
	} 
	
	public static void swap(int a, int b) {
		System.out.println("Swapping a and b");
		int temp;
		temp=a;
		a=b;
		b=temp;
	}
	
	public static void quickSort(int a[], int lb, int ub){
		
		
		 // if(lb<ub) { 
			//int loc=partition(a, lb, ub); 
		  	//System.out.println("loc: "+loc);
		  	//quickSort(a, lb, loc-1); 
		  	//quickSort(a, loc+1, ub); 
		  //}
		  
		  
		  
				int loc=partition(a, lb, ub); 
			  	System.out.println("loc: "+loc);
			  	//if(lb<loc-1)
			  		quickSort(a, lb, loc-1); 
			  	//if(ub>loc)
			  		quickSort(a, loc+1, ub); 
			  
		 
		
		/*
		 * int idx=partition(a, lb, ub); if (lb < idx - 1) { recursiveQuickSort(a, lb,
		 * idx - 1); } // Recursively call quick sort with right part of the partitioned
		 * array if (ub > idx) { recursiveQuickSort(a, idx, ub); }
		 */
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,5,0,6,9,3,12,4};
		System.out.println(Arrays.toString(a));
		quickSort(a,0, a.length-1);
		//recursiveQuickSort(a, 0, a.length - 1);
		System.out.println(Arrays.toString(a));

	}

}
