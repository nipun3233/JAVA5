package home;
import java.util.*;
public class Sum_of_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("provide the no till where u want to sum");
		int count = sc.nextInt();
		sc.close();
		int arr[] = new int[count];
		int sum=0;
		for (int i=1;i<=count;i++) {
			arr[i-1]=i;
			sum=sum+arr[i-1];
			System.out.println(sum);
		}
		//System.out.println(sum);
 	}
}
