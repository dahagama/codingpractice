package recursion;

public class Fibonacci {
	
	int fib(int n) {
		if(n==0 || n==1) {
			return n;
		}else {
			return fib(n-1)+ fib(n-2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci f=new Fibonacci();
		for(int i=0;i<=5;i++) {
			System.out.println(f.fib(i));
		}
		
	}

}
