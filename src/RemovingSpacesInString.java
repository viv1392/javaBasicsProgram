
public class RemovingSpacesInString {

	public static void main(String[] args) {
		String x="Automation test engineer"; 
		String y=x.replaceAll("\\s", "");
		System.out.println(y);
	}

}
