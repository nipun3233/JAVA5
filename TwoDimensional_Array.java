package Advance_DSA;
import java.util.*;
public class twodimensional_Array {
	public static void main(String [] args) {
		int a[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first matrix");
		for(int i = 0;i<3;i++) {
				for(int j=0;j<3;j++) {
						a[i][j]=sc.nextInt();
				}
		}
		System.out.println("enter second matrix");
		int b[][] = new int[3][3];
		for(int i = 0;i<3;i++) {
			for(int j=0;j<3;j++) {
					b[i][j]=sc.nextInt();
			}
		}
		
		
//		System.out.println("matrix product");
		int c[][] = new int[3][3];
				for(int i=0;i<3;i++) {
					for(int j=0;j<3;j++) {
						c[i][j]=0;
						for(int k=0;k<3;k++) {
							c[i][j]+=a[i][k] * b[k][j];
						}
					}
				}
		
		for(int i = 0;i<3;i++) {
					for(int j=0;j<3;j++) {
							System.out.print(" "+a[i][j]);
					}
					System.out.println("");
			}
		System.out.println("");
		
		for(int i = 0;i<3;i++) {
			for(int j=0;j<3;j++) {
					System.out.print(" "+b[i][j]);
			}
			System.out.println("");
			}
				
		System.out.println("");			
				
		for(int i = 0;i<3;i++) {
			for(int j=0;j<3;j++) {
					System.out.print(" "+c[i][j]);
			}
			System.out.println("");
	}
		sc.close();
	}
}
