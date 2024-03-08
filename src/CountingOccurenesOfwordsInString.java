

public class CountingOccurenesOfwordsInString {
        public static void main(String[] args) {
        	
        	String x="java python java";
	                 int y= x.length();
	         String x1= x.replaceAll("a", "");
	             int y1=x1.length();
	         int z=y-y1;
	         System.out.println("Number of occurances of a :"+z);
   }
}
