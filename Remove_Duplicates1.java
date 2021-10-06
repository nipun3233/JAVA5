package home;
import java.util.*;

public class Remove_Duplicates1 {
	public static void main(String[] args) {
	int[] num= {1,2,3,3,4,5,6,6,7,8,9};
	for (int i=0;i<num.length-1;i++) {
		if(num[i]==num[i+1]) {
			i++;
			for(int j=i;j<num.length-1;j++) {
				num[j]=num[j+1];
			}
		}
	}
	
	for (int k=0;k<num.length;k++) {
		System.out.print(num[k]);
	}
	
	}
}
