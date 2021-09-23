package home;
import java.util.*;
public class Even_Position {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		int even[] = new int[arr.length];
		for (int i=0;i<=arr.length;i++) {
			if(i%2!=0) {
				even[i]=arr[i];
				System.out.println(even[i]);
			}
		}
	}
}
