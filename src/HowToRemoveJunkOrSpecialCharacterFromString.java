
public class HowToRemoveJunkOrSpecialCharacterFromString {

	public static void main(String[] args) {
        String x="@#$$!*Vivek";
       String y= x.replaceAll("[^a-zA-Z0-9]", "");
       System.out.println(y);
	}

}
