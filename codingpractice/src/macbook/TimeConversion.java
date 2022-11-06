package macbook;
 
public class TimeConversion {
    char var1;
    double var2;
    float var3;
    
    public static String timeConversion(String s) {
        // Write your code here
        String hh = s.substring(0, 2);
        Integer hours= Integer.valueOf(hh);
        int hora=hours.intValue();
        int tempT=0;
        if(s.contains("AM")){
            if(hora>=12){
               tempT=hora-12; 
            } else {
            	tempT=hora;
            }
        }
        if(s.contains("PM")){
            if(hora<=11){
               tempT=hora+12; 
            }else {
            	tempT=12;
            }
        }
        String milHH= String.valueOf(tempT);
        if(tempT<10) {
        	milHH= "0"+milHH;
        }
        String convertedTime=milHH + s.substring(2, 8);
        return convertedTime;
        }

    
	
    public static void main(String[] args) {
    	String s=timeConversion("04:59:59AM");
    	System.out.println(s);
    }
}