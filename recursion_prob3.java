package Advance_DSA;

public class recursion_prob3 {
static int fibb(int n) {
	if (n <= 1)
	       return n;
	    int  sum = fibb(n-1) + fibb(n-2);
	    System.out.println(sum);
	    return sum;

}
	
public static void main(String[] args) {
	System.out.print("Fibonacci Series\n");
	int n=9;
	System.out.println(fibb(n));
}
}
