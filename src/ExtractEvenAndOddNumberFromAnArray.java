
public class ExtractEvenAndOddNumberFromAnArray {
	public static void main(String[] args) {
		int[] x = { 20, 21, 32, 47, 68, 59 };
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 == 0) {
				System.out.println("Even number in array :" +x[i]);
				
			} else {
				System.out.println("Odd number in array :" +x[i]);
			}
			
		}
	}
}
