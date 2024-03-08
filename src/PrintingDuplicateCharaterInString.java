
import java.util.HashSet;

public class PrintingDuplicateCharaterInString {
	public static void main(String[] args) {
		/*String x = "autamtion test engineer";
		String y = x.replaceAll("\\s", "");
		char[] z = y.toCharArray();
		int cnt = 0;
		for (int i = 0; i < z.length; i++) {
			cnt = 0;
			for (int j = i + 1; j < z.length; j++) {
				if (z[i] == z[j]) {
					cnt++;
					z[j] = '0';
				}
			}
			if (cnt > 0 && z[i] != '0') {
				System.out.println(z[i]);
			}
		}*/
		
		
		// second Approach using hashSet
		String x = "automation";
		//String y = x.replaceAll("\\s", "");
		String[] k=x.split("");
	    boolean flag=true;
		HashSet<String> langs=new HashSet<String> ();
		for(String z:k) {
			flag=langs.add(z);
			if(flag==false) {
				System.out.println(z);
			
			}
		}
		
	}
}
