
import java.util.Scanner;

public class PrintingOddEvenDigit {

	public static void main(String[] args) {
		Scanner scr =new Scanner(System.in);
		System.out.println("Enter A Number :");
	    int num =scr.nextInt();
		int evencnt = 0;
		int oddcnt = 0;
		while (num > 0) {
			int rem = num % 10;
			if (rem % 2 == 0) {
				evencnt++;
			} else {
				oddcnt++;
			}
			num = num / 10;
		}
		System.out.println("Number of even digits :" + evencnt);
		System.out.println("Number of odd digits :" + oddcnt);
	}

}
