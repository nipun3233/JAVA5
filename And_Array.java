package home;

public class And_Array {
	public static void main(String[] args) {
		int[] num = {1,2,3,1};
		int k=3;
		int flag=0;
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
					if((num[i]==num[j]) && (Math.abs(i-j)<=k)) {
						flag=1;
						break;
					}
			}
		}
	if(flag==1) {
		System.out.println("True");
	}
	else {
		System.out.println("False");
	}
		
}
}