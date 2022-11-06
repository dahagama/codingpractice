package macbook;

public class Fibonacci {
	
	int n=10;
	int m[] = new int[n+1];
	
	int fib(int n) {
		int arr[] = new int[n+1];
		arr[0]=0;
		arr[1]=1;
		
		for(int i=2;i<=n;i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		return arr[n];
	}
	
	static int fibRec(int n) {
		if(n<=1)
		return n;
		int retVal=fibRec(n-1) + fibRec(n-2);
		return retVal;
	}
	
	public void init()
	{
		
		for(int i =0;i<=n; i++) {
			m[i]=-1;
		}
	}
	public int fibRecMem(int n) {
		
		if(m[n]== -1){
			if(n<=1)
				m[n]=n;
				else
				m[n]=fibRecMem(n-1) + fibRecMem(n-2);
		}else {
			System.out.println("value already exists2: " + n + " : "+ m[n]);
		}
		//System.out.println("value already exists1: " + n + " : "+ m[n]);
		return m[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci f = new Fibonacci();
		int val=f.fib(10);
		System.out.println("iterative: "+val);
		int valRec=fibRec(10);
		System.out.println("recursive: "+valRec);
		f.init();
		int memRetVal= f.fibRecMem(10);
		System.out.println("memrecursive: "+memRetVal);

	}

}
