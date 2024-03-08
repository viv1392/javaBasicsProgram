

import java.util.Scanner;

public class CheckingPrimeNumber {

	public static void main(String[] args) {
     Scanner scr = new Scanner(System.in);
     System.out .println("Enter A Number :");
      int num=scr.nextInt();
      for(int i=2;i<num;i++) {
    	  if(num%i==0) {
    		  System.out.println("number is not prime");
    		  break;
    	  }
      
    	  else {
    		  System.out.println("number is prime");
    		  break;
    		  
    	  }
      }
	}

}
