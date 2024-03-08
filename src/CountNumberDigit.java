
public class CountNumberDigit {
	public static void main(String[] args) {
		int x = 45687398;
		int cnt = 0;
		while (x > 0) {
			x = x / 10;
			cnt++;
		}
		System.out.println(cnt);
	}

}
