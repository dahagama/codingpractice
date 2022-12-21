package sorting;

import java.util.Arrays;

public class SelectionSort {
	
	static void selectionSortAsc(int a[])
	{
		int i,j,n=a.length,minPos,temp;
		for(i=0;i<n-1;i++)
		{
			minPos=i;
			//selection sort
			for(j=i+1;j<n;j++)
			{
				if(a[j] < a[minPos])
				{
					minPos=j;
				}
			}
			if(minPos!=i) {
				temp=a[i];
				a[i]=a[minPos];
				a[minPos]=temp;
			}
			
		}
	}
	
	public static void main(String args[]) {
		int a[] = {1,9,3,8,7,5,2,4};
		System.out.println("before sorting=====>"+Arrays.toString(a));
		SelectionSort.selectionSortAsc(a);
		System.out.println("after sorting asc==>"+Arrays.toString(a));
	}

}
