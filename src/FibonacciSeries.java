
public class FibonacciSeries {

	public static void main(String[] args) {
		 int n1=0; int n2=1;int n3=0; int num=10; 
         System.out.println(n1);
         System.out.println(n2);
         for(int i=1;i<10;i++){
             n3=n2+n1;
             System.out.println(n3);
             n1=n2;
             n2=n3;
         }
	}

}
