package HandsOnJAVA;
public class SumOfDigits {
	public static void main(String[] args) {
	int sum=123523,rem=0 ,prod=0;
	while(sum>0) {
	rem=sum%10;
	sum=sum/10;
	prod=prod+rem;
	}
	System.out.println(prod);
	}
}
