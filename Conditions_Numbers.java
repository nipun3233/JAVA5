import java.util.*;

public class Conditions_Numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		check(num);
	}

public static void check(int num1){
	if (num1<100) {
		System.out.println("print num is less than 100");
		if(num1>50) {
			System.out.println("print number is greater than 50 ");
		}
		else {
			System.out.println("print number is less than 50 ");
		}
	}
	else {
		System.out.println("print num  is greater than 100");
		
		if(num1<150) {
			System.out.println("less than 150");
		}
		else {
			System.out.println("print is greater than 150");
		}
	}
	
}}