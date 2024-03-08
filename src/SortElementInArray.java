
import java.util.Arrays;
import java.util.Collections;

public class SortElementInArray {

	public static void main(String[] args) {
        int []a= {20,15,40,25,14};
          Arrays.sort(a);
          System.out.println("Sorted array is :"+Arrays.toString((a)));
          
          //sorting Array in descending order
          Integer [] x= {20,15,40,25,14};
          Arrays.sort(x, Collections.reverseOrder());
          System.out.println("Sorted order in descending order :"+Arrays.toString(x));
  }
}
