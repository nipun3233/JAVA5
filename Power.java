package HandsOnJAVA;

public class Power {
	public static void main(String[]args) {
		int base=9;
		int prod=1;
		int power=3;
		for (int i=0;i<power;i++) {
			prod*=base;
		}
	System.out.println(prod);
	}
}

