package HandsOnJAVA;

public class ReverseInt {
	public static void main(String[] args) {
		int sum=123456789,rem=0 ,rev=0 ,prod=0 ;
		while(sum>0) {
			rem=sum%10;
			rev=(rev*10)+rem;
			sum=sum/10;
			prod=prod+rem;
			}
		System.out.println(rev);
		}
}
