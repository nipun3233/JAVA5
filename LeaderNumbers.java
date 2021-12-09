package HandsOnJAVA;

public class LeaderNumbers {
public static void main(String [] args) { 
	int [] arr = {3,1,6,2,7,4,5};
	int [] leader = new int [arr.length];
	int count = arr[6];
	for(int i=arr.length-1;i>0;i--) {
		if(arr[i]>arr[i-1]) {
			count=arr[i];	
			leader[i]=-1;
		}
		else {
			leader[i]=count;
		}
	}
	for(int i=0;i<arr.length;i++) {
		System.out.print(leader[i] + " ");
	}
}
}
