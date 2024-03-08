
public class SwappingOfStrings {
	public static void main(String[] args) {
		String x="Hello World";
		int x1=x.length();
	    String y="Vivek";
	    int y1=y.length();
	   y= x.concat(y);//Hello WorldVivek
	   int z=y.length();
	   x= y.substring(x1);
	    y = y.substring(0,z-y1);
	    System.out.println("value of x after swapping :" + x);
	    System.out.print("value of y after swapping :"+y);
	}

}
