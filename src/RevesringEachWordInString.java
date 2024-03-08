
public class RevesringEachWordInString {

	public static void main(String[] args) {
		String x = "java python automation";
		int i = 0;
		String[] y = x.split("");
		String k = "";
		String k1 = "";
		for (i = y.length - 1; i >= 0; i--) {
			k = k + y[i];
		}
		String[] z = k.split(" ");
		for (int j = z.length - 1; j >= 0; j--) {
			k1 = k1 + " " + z[j];
		}
		System.out.print(k1.trim());
	}

}
