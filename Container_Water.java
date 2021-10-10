package home;

public class Container_Water {
	public static void main(String[] args) {
		int[] num= {1,8,6,2,5,4,8,3,7};
		int start=0;
		int end=0;
		int var=0;
		int mid=num.length/2;
		for(int i=0;i<mid;i++) {
			for(int j=num.length;j<(mid);j--) {
				if(num[i]>num[j]) {
					var=num[j]*(j-i);
					System.out.println(var);
				}
				else {
					var=num[i]*(j-i);

					System.out.println(var);
					
				}
			}
		}
	}
}
