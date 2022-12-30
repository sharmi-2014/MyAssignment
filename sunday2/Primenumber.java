package week1.sunday2;

public class Primenumber {
	public static void main(String[]agrs) {
		int n=13;
		boolean flag=false;
		
		
		for(int i=2;i<=n/2;i++) {
	    if(n%i==0) {
	    	flag=true;
	    	break;
	    }
		}
		if(flag==false) {
			
	    	System.out.println(" 13 is primenumber");
	    }
	    
		else {
	         System.out.println("13 is not a primenumber");
		}
	    }
		
	}
	    	
	    
				
	


