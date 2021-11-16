package Advance_DSA;

public class binarySearch {
	
	static int binary_search(int[] arr,int target) {
	int low=0, high=arr.length-1;	
	
	while(low<=high) {
		
		int mid = low+(high-low)/2;
		
		if(arr[mid]==target)
			return mid;
		
		else if(target < arr[mid]) {
			high = mid-1;
		}
		else {
			low = mid+1;
		}
	}
	//if (low==arr.length || high<0) return -1;
	
	return -1;
	}
	
	
	public static void main(String [] args) {
		int arr[]= {2,3,4,5,7,8,10,11,15};
		int target = 9;
				;
		System.out.println("the no is "+binary_search(arr,target));
	}
}
