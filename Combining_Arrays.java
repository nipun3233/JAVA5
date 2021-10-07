package home;

public class Combining_Arrays {
	public static void main(String[]  args) {
		int[] arr1= {2,3,4,5,9,0,0};
		int[] arr2= {3,5};
		int j=0;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]==0) {
				arr1[i]=arr2[j];
				j++;
			}
		}
	
		for(int i=0;i<arr1.length-1;i++) {
			if(arr1[i]>arr1[i+1]) {
				int var=arr1[i];
				arr1[i]=arr1[i+1];
				arr1[i+1]=var;
				
			}
		}
		
		
		
		for(int i=0;i<arr1.length;i++) {
		
		System.out.print(arr1[i]);
		}
		
		}
	}

