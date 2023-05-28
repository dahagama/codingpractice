package durga.recursion;

public class TowersOfHanoi {
	
	static void towersofHanoi(int n, String src, String helper, String dest) {
		
		if(n==1) {
			System.out.println("Moved the disk "+ n +" from "+src+" to " + dest);
			return;
		}
		towersofHanoi(n-1, src,dest,helper);
		System.out.println("Moved the disk "+ n +" from "+src+" to " + dest);
		towersofHanoi(n-1, helper,src,dest);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		towersofHanoi(2,"S","H","D");

	}

}
