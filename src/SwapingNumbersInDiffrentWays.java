

public class SwapingNumbersInDiffrentWays {
	public static void main(String[] args) {
		// using third variable
		int x=10;
		int y=20;
		//int t;
	    //t=y; //y=10
	    // y=x;
		//x=t; //x=30
		
		
		// Without Third Variable(using + & - operator)
		/*x=x+y;
		y=x-y;
		x=x-y;*/
		
		//using * And / operator`
		y=x*y;
		x=y/x;
		y=y/x;
		System.out.println("new value of x "+ x +" new value of y "+ y);
		
	}
	

}
