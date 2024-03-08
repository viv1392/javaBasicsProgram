
import java.util.Scanner;

public class HowToReverseANumber {

	public static void main(String[] args) {
		// 1.method
		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.println("Enter A number"); int num = sc.nextInt(); //456 /*int rev
		 * = 0; while (num>0) { rev = rev*10+num % 10; num = num / 10; }
		 */

		// 2.method Using String Buffer
		/*
		 * System.out.println("Enter A String"); String str=sc.next(); StringBuffer
		 * sb=new StringBuffer(str); StringBuffer rev = sb.reverse();
		 */

		// 3.Method Using String Builder
		System.out.println("Enter A Number :");
		int num = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		StringBuilder re = sb.append(num);
		StringBuilder rev=re.reverse();
		System.out.print(rev);
	}
}
