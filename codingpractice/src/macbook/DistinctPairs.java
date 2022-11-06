
package macbook;
public class DistinctPairs {
	
	public int numberofDistinctPairs(int arr[]) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				int length1 = findLength(arr[i]);
				int length2 = findLength(arr[j]);				
				if(length1==length2) {
					int[] k1= digitsinNumber(arr[i]);
					int[] k2= digitsinNumber(arr[j]);					
					if(arr[i]!=arr[j] && !ifMoreThanTwoDigitsDiffer(k1, k2)) {
						System.out.println("at i position: "+i +" value: "+ arr[i]+ " at j poistion: "+j + " value: "+arr[j]);
						count++;
					}
				}
			}
		}
		return count;
	}
	
	public int findLength(int number) {
		int length = 0;
		long temp = 1;
		while (temp <= number) {
		    length++;
		    temp *= 10;
		}
		return length;
	}
	

    public int[] digitsinNumber(int number) {
    	int remainder=0;
    	int l= findLength(number);
    	int[] arr=new int[l];
    	int i=0;
    	while (number > 0) {
    		 
            // Finding the remainder (Last Digit)
             remainder = number % 10;
 
            // Printing the remainder/current last digit
          //  System.out.println(remainder);
 
            // Removing the last digit/current last digit
            number = number / 10;
            arr[i]=remainder;
            i++;
        }
    	return arr;
    }
    
    public boolean ifMoreThanTwoDigitsDiffer(int[] a1, int[] a2) {
    	int count=0;
    	for(int i=0;i<a1.length;i++) {
			for(int j=0;j<a2.length;j++) {
				if(i==j && a1[i]!=a2[j]) {
					count++;				
				}
			}
		}
    	if(count>1) {						
			return true;						
		}
    	return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DistinctPairs dp = new DistinctPairs();
		int arr[] = {1,151,241,1,9,22,351};
		System.out.println("\nCount of distinct pairs: "+dp.numberofDistinctPairs(arr));
	     
	}

}
