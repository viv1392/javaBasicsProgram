
import java.util.Scanner;

public class SumTheDigitOfANumber {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter A Number :");
		int num=scr.nextInt();
		int sum=0;
        while(num>0){
           int rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println("Sum of digits :"+sum);
	}
}
