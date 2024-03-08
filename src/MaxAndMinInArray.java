
public class MaxAndMinInArray {

	public static void main(String[] args) {
     int []x= {13,14,11,9,16};
      int max=x[0];
      for(int i=1;i<x.length;i++) {
    	  if(x[i]>max) {
    		  max=x[i];
    	  }
      }
      System.out.println(max); 
      
      
     int min=x[0];
     for(int j=1;j<x.length;j++) {
    	 if(x[j]<min) {
    		 min=x[j];
    	 }
     }
     System.out.println(min);
	}

}
