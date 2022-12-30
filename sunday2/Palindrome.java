package week1.sunday2;

public class Palindrome {
	public static void main(String[]agrs) {
		int num=34343;
		int n=num;
		int temp1=0;
		
		
		
		for( num=34343;num!=0;num=num/10) {
			int temp=num%10;
					temp1=(temp1*10)+temp;
		}
		
			if(temp1==n) {
			
				System.out.println(  "Palindrome");
			}
			else
				 {
					System.out.println(  " is not Palindrome");
				}
				
				}
				}
					
			
				
			
			
	

	


