package home;

public class Left_Shift_Array {
	public static void main (String[] args) {
		int[] arr = {1,2,3,4,5};
		int n=arr.length-1;
		int rev[] = new int[5];
		int first = arr[0];
		for (int i=1;i<arr.length;i++) {
			rev[i-1]=arr[i];
		}
		rev[n]=first;
		for (int i=0;i<rev.length;i++) {
			System.out.println(rev[i]);
		}
	}
}
