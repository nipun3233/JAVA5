package home;
import java.util.*;
public class TwoD_Array_Diagnol {
	public static void main(String[] args)
	{
		int arr[][] = { { 1, 0, 0 }, { 0, 1, 0 }, { 1, 1, 1 } };

		int ans = arr[0][0];
		boolean flag  = false;
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {
				if (i == j) {

					if (arr[i][j] == ans) {
						flag  = true;
					}else {
						flag = false;
						System.out.println("False");
						break;
					}

				}
			}
			if(!flag) {
				break;
			}
		}
		
		if(flag) {
			System.out.println("True");
		}
	}
}
