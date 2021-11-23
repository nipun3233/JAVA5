package Advance_DSA;

import java.util.Scanner;
public class recursion_prob1 {
	
	private static void table(int n,int count) {
		int prod=0;
		prod=n*count;
		System.out.println(n + "X" + count + "=" + prod);
		if(count==10) {
			return;
		}
		count++;
		table(n,count);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("provide the value ");
		int n = sc.nextInt();
		int count=1;
		table(n,count);
		
	}
 }
