package macbook;

public class MergeSort {
	
	/**
	 * 
	 * @param arr
	 * 
	 * MergeSort(arr[], l,  r)
	If r > l
     1. Find the middle point to divide the array into two halves:  
             middle m = l+ (r-l)/2
     2. Call mergeSort for first half:   
             Call mergeSort(arr, l, m)
     3. Call mergeSort for second half:
             Call mergeSort(arr, m+1, r)
     4. Merge the two halves sorted in step 2 and 3:
             Call merge(arr, l, m, r)
	 */
	
	public static void mergeSort(int arr[]) {
		
		mergeSort(arr, new int[arr.length], 0, arr.length-1);
		
	}
	
	public static void mergeSort(int arr[], int[] work, int start, int end) {
		if(start>=end)
			return;
		int m=end + (end-start)/2;
		mergeSort(arr,work,start,m);
		mergeSort(arr,work,m+1,end);
		mergeHalves(arr,work, start, end);
	}
	
	public static void mergeHalves(int arr[], int[] work, int start, int end) {
		System.out.print("merged array");
		int leftEnd = (start+ end)/2;
		int rightEnd= leftEnd +1;
		int size= rightEnd-leftEnd+1;
		
	}
	
	public static void main(String args[]) {
		
	}

}
