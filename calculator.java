import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String operator = sc.nextLine();
	String s1 = "SUM";
	String s2 = "MULTIPLY";
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	if(operator.equals(s1)) {
		int sum = add(num1,num2);	
		System.out.println(sum);
	}
	else if(operator.equals(s2)) {
		int product = multiply(num1,num2);	
		System.out.println(product);
	}
	else {
		System.out.println("not proper input");
	}
	
	
	sc.close();
	}


public static int add(int a,int b) {
	return a+b;
}
public static int multiply(int a,int b) {
	return a*b;
}
}