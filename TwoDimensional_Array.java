package LeetCode;
import java.util.*;
public class TwoDimensional_Array {
	public int[][] construct2DArray(int[] original, int m ,int n){
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("proceed with the values,");
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]);
		}
	sc.close();			
	}
}
