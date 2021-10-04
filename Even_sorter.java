package home;

public class Even_sorter {
	public static void main(String[] args) {
		int[] num = {12,3,4,5,10,7,8,13};
		int [] result = new int[num.length];
		int j=1;
		for(int i=0;i<num.length;i++) {
			if(num[i]%2==0) {
				result[i]=num[i];
			}
			else {
				result[num.length-j]=num[i];
				j++;
			}
		}
		for(int i = 0;i<result.length;i++) {
			System.out.print(result[i]);
		}
}
}