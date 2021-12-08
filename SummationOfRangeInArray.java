package HandsOnJAVA;

public class SummationOfRangeInArray {
	public static void main(String [] args) {
		int l=2,r=4;
		int [] arr = {1,2,3,4,5,6,7};
		int [] sum = new int[arr.length];
		
		int temp = 0;
		for(int i=0;i<arr.length;i++) {
			temp=temp + arr[i];
			sum[i]=temp;
		}
		int c = sum[r]-sum[l-1];
		System.out.println(c);

		
	}
}
