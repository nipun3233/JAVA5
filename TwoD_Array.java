package home;
import java.util.Scanner;

public class TwoD_Array {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{1,4,9},{3,9,6}};
//		Scanner sc=new Scanner(System.in);  
				       
				for(int i =0;i<arr.length;i++) {
			
					for(int j=0;j<arr.length;j++) {
						if((i+j)%2==0) {
							arr[i][j]=0;
						}
						}
						}
				for(int i =0;i<arr.length;i++) {
					
					for(int j=0;j<arr.length;j++) {
						System.out.print(arr[i][j]);
						}
						}
				
	}
}
