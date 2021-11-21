package LeetCode;
import java.util.*;
public class Reshape_Matrix {
	public static int[][] matrixReshape(int[][] mat,int r,int c){
		int rows = mat.length;
		int cols = mat[0].length;
		int reMat[][] = new int[r][c] ;
		int m=0,n=0;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				reMat[m][n]=mat[i][j];
				n++;
				if(n==c) {
					n=0;
					m++;
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		public class Solution {
		    public int[][] matrixReshape(int[][] nums, int r, int c) {
		        int m = nums.length, n = nums[0].length;
		        if (m * n != r * c) return nums;
		        
		        int[][] result = new int[r][c];
		        int row = 0, col = 0;
		        for (int i = 0; i < m; i++) {
		            for (int j = 0; j < n; j++) {
		                result[row][col] = nums[i][j];
		                col++;
		                if (col == c) {
		                    col = 0;
		                    row++;
		                }
		            }
		        }
		        
		        return result;
		    }
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(reMat[i][j]);
			}
			System.out.println("");
		}
		return reMat;
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the dimension of your matrix");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int mat[][] = new int[m][n];
		System.out.println("Enter the values ");
		
		for(int i=0;i<m;i++) {
			for (int j=0;j<n;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<m;i++) {
			for (int j=0;j<n;j++) {
				System.out.print(mat[i][j]);
			}
			System.out.println("");
		}
		System.out.println("enter the new dimensions to reshape");
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		matrixReshape(mat,r,c);
		
		
	}
}
