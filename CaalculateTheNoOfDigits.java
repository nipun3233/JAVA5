package HandsOnJAVA;

public class CaalculateTheNoOfDigits {
	public static void main(String[] args) {
		int sum=123523 ,count=0;
		while(sum>0) {
			count++;
			sum=sum/10;
		}
		System.out.println(count);
		}
}
