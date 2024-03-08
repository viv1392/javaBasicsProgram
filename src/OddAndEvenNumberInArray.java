
public class OddAndEvenNumberInArray {

	public static void main(String[] args) {
		int[] x = { 50, 60, 31, 45, 60 };
		int evencnt = 0;
		int oddcnt=0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 == 0) {
				evencnt++;
			} else {
				oddcnt++;
			}
		}
		System.out.println("Even Count :" + evencnt);
		System.out.println("Odd Count :" + oddcnt);
	}

}
