
public class ReversingOfString {
	public static void main(String[] args) {
		//1.method
		String x="automation";
		/*String rev="";
		   char[]a= x.toCharArray(); 
		     int len =  a.length;
		     for(int i=len-1;i>0;i--) {
		    	 rev=rev+x.charAt(i);
		     }*/
		
		// 2 method
		
		   StringBuffer sb=new StringBuffer(x);
		   StringBuffer rev= sb.reverse();
		     System.out.println(rev);
	}

}
