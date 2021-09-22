package home;
import java.util.*;
public class Prime_No {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("give the no to be checked");
		int num = sc.nextInt();
		sc.close();
		int flag=0;
		if (num==0||num==1) {
			System.out.println("it is not a prime no");
		}
		for (int i=2; i<=(num/2); i++) {
			if (num%i==0) {
				System.out.println("not a prime no"+num);
				flag=1;
				break;
			}
		}
		if (flag==0) {
			System.out.println("No is a prime no "+num);
		}
	}
}
