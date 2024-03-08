
import java.util.Scanner;

public class Palindrome {
	// if we reverse the order of any number or String then it remains same then it
	// is known as palindrome.

	public static void main(String[] args) {
		
		  int num=141; int sum=0;
		  Scanner scr=new Scanner(System.in);
		  System.out.println("Enter A Number");
		  int a= scr.nextInt();
		 while(a>0)
		 {
		 sum=sum*10+a%10;
		 a=a/10;
		 } 
		 if(num==sum)
		 {
		 System.out.println("Number is palindrome");
		 }
		 else
		 {
		 System.out.println("Number is not palindrome");
		 }
		 
		 
		 
		 
		String x = "MADAM";
		StringBuffer sb = new StringBuffer(x);
		StringBuffer y = sb.reverse();
		String z = y.toString();
		

		if (z.equals(x)) 
		{
			System.out.println("String is palindrome");
		}
		else 
		{
			System.out.println("String is not palindrome");
		}
	}

}
