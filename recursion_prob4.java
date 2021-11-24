package Advance_DSA;
import java.util.*;
public class recursion_prob4 {
static int factorial(int num){
	if(num==1) {
		return num ;
			}	
	return num*factorial(num-1);
}
public static void main(String[] args) {
	System.out.println("Factorial of the no");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	System.out.println(factorial(num));
}
 }
