package macbook;

public class Compress {
	
	public static String compress(String s) {
		
		char[] crr= s.toCharArray();
		StringBuilder sBuilder=new StringBuilder();		
		int count =0;
		
		for(int i=0; i< crr.length;i++) {
			count ++;
			
			if(i+1<crr.length && crr[i]!=crr[i+1]) {
				sBuilder.append(crr[i]);
				sBuilder.append(count);
				count=0;
			}
		}
		
		return sBuilder.toString();
	}
	
	public static void main(String args[]) {
		compress("aaaaa");
	}

}
