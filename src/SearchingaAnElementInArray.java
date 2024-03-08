
public class SearchingaAnElementInArray {
	public static void main(String[] args) {
		int []a= {50,30,42,67};
		int element=68;
		for(int i=0;i<a.length;i++)	{
			if(element==a[i]) {
				System.out.println("Element found in array");
			}
		}
		System.out.println("Element not found in array");
	}
}
