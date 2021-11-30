package Advance_DSA;

class Reccursion_prob5 {
	
	public static int reccur(int num,int pow){
		if(pow==0) {
			return 1;
		}
		int sum =num*reccur(num,pow-1);
		return sum;
	}
	
	
	public static void main(String[] args) {
		System.out.println(reccur(4,3));
	}
}
