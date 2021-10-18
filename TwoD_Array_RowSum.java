package home;

public class TwoD_Array_RowSum {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{1,4,5},{3,9,12}};
		boolean flag=false;
		for (int i=0;i<3;i++) {
			if(arr[i][0]+arr[i][1]==arr[i][2]) {
				flag=true;
			}
			else {
				flag=false;
				System.out.print("false");
				break;
			}
		}
		if(flag) {
			System.out.print("true");
		}
		}
}
