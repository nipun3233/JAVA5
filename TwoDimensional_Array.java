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
		
		System.out.println("\n enter the size of rows and column of your matrix");
		int r =sc.nextInt();
		int k =0;
		int c = sc.nextInt();
		int[][] mat= new int[r][c];  

		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				mat[i][j]=arr[k];
				k++;
			}
		}
		
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(mat[i][j]);
			}
			System.out.println("");
		}
		
		
		
	sc.close();			
	}
}
