package home;

public class Arr_COPY {
	public static void main(String[] args) {
		int[] num = {1,2,3,9,7,6,5};
		int[] num2 = new int[num.length];
	for (int i =0;i<num.length;i++) {
		num2[i]=num[i];
	}
	for(int i =0;i<num2.length;i++) {
	System.out.print(num2[i]);
	}
}
}