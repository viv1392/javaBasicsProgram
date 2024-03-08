
public class PrintingPyramid {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {

			for (int k =5; k<=i; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print(" *");
			}

			
			System.out.println();
		}
		
	
		
		//swapString();
	}
	
	public static void swapString() {
		String s="Dheerendra";
		String s1="Viviek";
		String s5="" ;
		String[] s3 = s.concat(" ").concat(s1).toString().split(" ");
		for(String s4:s3) {
			
			
		for(int i=0;i<s4.length();i++) {
			char s6 = s4.charAt(i);
			s5=s5+s6;
			System.out.println(s5);
		}
		
		
		}
		
		s=s1;
		//System.out.println(s5+":"+s1);
	}
	
	
	
	
	
}
