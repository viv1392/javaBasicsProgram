
import java.util.Scanner;

public class FindLargetsNumber {
	public static void main(String[] args) {
		// First Approach
		
		 Scanner scr=new Scanner(System.in);
			System.out.println("Enter A Number :");
			int a=scr.nextInt();
			System.out.println("Enter A Number :");
			int b=scr.nextInt();
			System.out.println("Enter A Number :");
			int c=scr.nextInt();
			
	        if(a>b&&a>c){
	            System.out.println("Largest number is :"+ a);
	        }
	        if(b>a&&b>c){
	            System.out.println("Largest number is :"+ b);
	        }
	        else{
	            System.out.println("Largest number is :"+ c);
	        }
	        // second Approach
	        
	       
	        
	}

}
