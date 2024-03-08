
public class HowToCheckEqualityOfArrays {

	public static void main(String[] args) {
		int[] x1 = { 50, 60, 70 ,80};
		int[] x2 = { 50, 60, 70, 80 };
		int z1 = 0;
		int z2 = 0;
		
		if(x1.length==x2.length) {
		for (int i = 0; i < x1.length; i++) {
			z1 = x1[i];
		}
		for (int j = 0; j < x2.length; j++) {
			z2 = x2[j];
		}
		if (z1 == z2) {
			System.out.print("Arrays are equal");
		} 
	  }
		
		
		else {
			System.out.print("Arrays are not equal");
		}
	}

}
