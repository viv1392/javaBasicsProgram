
import java.util.Random;

public class GenerateRandomStringAndNumber {

	public static void main(String[] args) {
		Random rdm=new Random();
		int x=rdm.nextInt(100);
		System.out .println(x);
		Double y=rdm.nextDouble(100);
		System.out .println(y);
		//approach 2
		System.out.println(Math.random());
	}

}
