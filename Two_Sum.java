package home;
import java.util.Scanner;

public class Two_Sum {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] nums = new int[n];
		int target = sc.nextInt();
				for (int i=0;i<n;i++) {
			nums[i]= sc.nextInt();		
			}
				sc.close();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println(nums[i]+ " " +nums[j]);
                }
                else {
                	System.out.println("no such no.");
                }
            }
        }
       
    }

	
	}
		

