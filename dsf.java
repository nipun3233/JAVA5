package home;

public class Climbing_Monkey {
	public static void main(String[] args) {
		int[] arr = {7,2,5,3,6,4};
		int least=arr[1];
		int max=arr[1];
		int least_index=0 ,max_index=0;
		for(int i=0;i<arr.length;i++) {
			if(least>arr[i]) {
				least=arr[i];
				least_index=i;
			}
		}
		for(int j=least_index;j<arr.length;j++) {
			if(max>arr[j]) {
				max=arr[j];
				max_index=j;
			}
		}
	System.out.println(least);

	System.out.println(max_index);
	
	}
}
