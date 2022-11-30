package loops;

public class SlidingWindowMaxSumSubArray {
	
	public int getMaxSumSubArrayOfSizeK(int arr[],int k){
		int maxSum=0;
		for(int i=0;i<=arr.length-k;i++) {
			int windowSum=0;
			for(int j=i;j<i+k;j++) {
				windowSum+=arr[j];
			}
			maxSum=Math.max(maxSum, windowSum);
		}
		
		return maxSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,9,-1,-2,7,3,-1,2};
		int k=4;
		SlidingWindowMaxSumSubArray s= new SlidingWindowMaxSumSubArray();
		System.out.println("Ma Sum SubArray: "+ s.getMaxSumSubArrayOfSizeK(arr, k));

	}

}
