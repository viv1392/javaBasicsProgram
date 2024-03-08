
public class MissingNumberinAnArray {
	public static void main(String[] args) {
		int[]x= {6,7,8,10,11};
		int sum1=0;
		int sum2=0;
		int missingNum=0;
		for(int i=0;i<x.length;i++) {
			sum1=sum1+x[i];
		}
		for(int j=6;j<=11;j++) {
			sum2=sum2+j;
		}
		missingNum=sum2-sum1;
		System.out .println(missingNum);
	}

}
