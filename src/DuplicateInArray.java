
import java.util.HashSet;

public class DuplicateInArray {
	// first Approach
	public static void main(String[] args) {
		String[] x = { "vivek", "java", "reema", "pandey", "java" };
		
		/*for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (x[j] == x[i]) {
					System.out.println("Found Duplicate Character :" + x[j]);
				}
			}
		}*/
		
		// second Approach by HashSet
		HashSet<String> langs=new HashSet<String>();
		boolean flag=true;
		for(String l:x) {
			if(langs.add(l)==false) {
				System.out.println("found duplicate Elememt:"+l);
				flag=true;
			}
			if(flag==false)
			{
				System.out.println("found no duplicate Elememt");
				flag=false;
			}
		}
		
	}
}
