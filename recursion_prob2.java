package Advance_DSA;
import java.util.Scanner;

public class recursion_prob2 {

private static void dssnd(int num) {
	if(num==0) {
		return;
	}
	System.out.println(num);
	dssnd(num-1);

}

private static void assnd(int num) {
	if(num==0) {return;}
	assnd(num-1);
	System.out.println(num);
	
}

public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide the value");
		int n=sc.nextInt();
		dssnd(n);
		System.out.println("0");
		assnd(n);
				
}
}
