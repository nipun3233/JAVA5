package Advance_DSA;

import java.util.Scanner;

public class twoDimensionalMat {
	public static void main(String [] args) {
		int a[][] = new int[4][3];
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first matrix");
			for(int i = 0;i<4;i++) {
				for(int j=0;j<3;j++) {
					a[i][j]=count++;
				}
			}
			
			
			for(int j = 0;j<3;j++) {
				for(int i=0;i<4;i++) {
					System.out.println(a[i][j]);
				}
			}
			
	}
}
