package HandsOnJAVA;

public class AdditionOfAllItems {
public static void main(String [] args) {
	int [] arr = {1,2,3,4,5,6,7};
	int [] sum = new int[arr.length];
	int temp = 0;
	for(int i=0;i<arr.length;i++) {
		temp=temp + arr[i];
		sum[i]=temp;
	}
	for(int i=0;i<arr.length;i++) {
		System.out.println(sum[i]);
	}

}
}
