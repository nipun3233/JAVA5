package home;
import java.util.*;
public class Nested_If_Else {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no ---");
		int a = sc.nextInt();
		sc.close();
		check(a);
		
	}
	
	public static void check(int i) {
		if(i>100) {
			System.out.println("the no is greator than 100 ");
			if(i<150) {
				System.out.println("the no is less than 150");
			}
			else {
				System.out.println("the no is greator than 150 ");
			}
		}
		else {
			System.out.println("the no is less than 100");
			if (i>50) {
				System.out.println("the no is greator than 50");
			}
			else {
				System.out.println("the no is less than 50");
			}
		}
			
		}
	}

