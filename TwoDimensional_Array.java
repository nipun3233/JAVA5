package LeetCode;
import java.util.*;
public class TwoDimensional_Array {
	public static int[][] construct2DArray(int[] arr, int r ,int c){
		int[][] mat= new int[r][c];  
		int n = arr.length;
		int k=0;
//		if(arr.length != 0) {
			if(r*c==n) {
				for(int i=0;i<r;i++) {
					for(int j=0;j<c;j++) {
						mat[i][j]=arr[k];
						k++;
					}
				}	
			}
			
//			}
			
			
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					System.out.print(mat[i][j]);
				}
				System.out.println("");
			}
			
		return null;
		
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
		
		System.out.println("\nenter the size of rows and column of your matrix");
		int r =sc.nextInt();
		int c = sc.nextInt();
		
		
		construct2DArray(arr , r,c);
		
		
	sc.close();			
	}
}
