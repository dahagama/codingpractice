package recursion;

//Java code for recursive bubble sort algorithm

class BubbleSort {

	// Driver code
	public static void main(String[] args)
	{
		int arr[] = { 2, 5, 1, 6, 9 };

		// function call
		bubblesort(arr, 5);
		for (int i = 0; i < 5; i++) {
			System.out.printf(arr[i] + " ");
		}
	}

	// function for sorting array recursively with bubble
	// sort
	public static void bubblesort(int arr[], int n)
	{

		// base condition for recursion
		if (n == 0 || n == 1) {
			return;
		}

		for (int i = 0; i < n - 1; i++) {

			// if arr[i] greater than arr[i+1] then
			// swap(arr[i], arr[i+1])
			if (arr[i] > arr[i + 1]) {
				swap(arr, i, i + 1);
			}
		}
		bubblesort(arr, n - 1);
	}

	// function to swap element of arr present at index i &
	// j
	public static final void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}

//This code is contributed by ajaymakvana.
