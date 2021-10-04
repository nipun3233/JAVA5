package home;

public class Even_sorter {

	
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5,6,7,8,9,10};
		int [] result = new int[10];
		int j=1;
		int k=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]%2==0) {
				result[k]=num[i];
				k++;
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
