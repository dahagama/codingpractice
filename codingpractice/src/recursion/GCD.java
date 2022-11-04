package recursion;

public class GCD {
	
	int gcd(int n1, int n2) {
		while(n1!=n2) {
			if(n1>n2) {
				return gcd(n1-n2,n2);
			}else {
				return gcd(n1,n2-n1);
			}
		}
		
		return n1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GCD gcdResult= new GCD();
		System.out.println(gcdResult.gcd(4,6));
	}

}
