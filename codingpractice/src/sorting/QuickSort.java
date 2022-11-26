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
			while(a[start]<=pivot && start<ub) {
				start++;
				System.out.println("1 : start: "+ start + " : "+ a[start]+" pivot: "+pivot);
			}
			while(a[end]>pivot && end>lb) {
				end--;
				//System.out.println("2 :"+end);
				System.out.println("2 : end: "+end +" : " +a[end]+" pivot: "+pivot);
			}			
			if(start<end) {
				System.out.println("3 :: ");
				System.out.println("a[start]: " + a[start]+ ": a[end]: "+ a[end]);
				int temp=a[start];
				a[start]=a[end];
				a[end]=temp;
			}			
		}
		int temp=a[lb];
		a[lb]=a[end];
		a[end]=temp;
		return end;
	}
	
	public static void quickSort(int a[], int lb, int ub){
				
	  if(lb<ub) { 
		int loc=partition(a, lb, ub); 
	  	System.out.println("loc: "+loc);
	  	quickSort(a, lb, loc-1); 
	  	quickSort(a, loc+1, ub); 
	  }	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,5,0,6,9,3,12,4};
		System.out.println(Arrays.toString(a));
		quickSort(a,0, a.length-1);
		System.out.println(Arrays.toString(a));

	}

}
