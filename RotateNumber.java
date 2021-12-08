package HandsOnJAVA;

public class RotateNumber {
	public static void main(String[] args) {
		int num=1234567 ,prod=0 ,length=6 ,rot=3,pow=1 , x=0;
		for(int i=0;i<rot;i++) {
			pow*=10;
			
			}
		
		prod=num%pow;
		num=num/pow;

		x=length-rot;
		
		for(int i=0;i<x;i++) {
			pow*=10;
			
			}
		prod=(prod*pow)+num;
		
		System.out.println(prod);
	}
}
