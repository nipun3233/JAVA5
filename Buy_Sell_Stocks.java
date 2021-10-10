package home;

public class Buy_Sell_Stocks {
	public static void  mmain(String[] args) {
		int[] arr = {7,1,5,3,6,4};
		int least=0;
		for(int i =0;i<arr.length;i++) {
			if(least>arr[i]) {
				least=arr[i];
			}
		}
	System.out.print(least);
	}
}
