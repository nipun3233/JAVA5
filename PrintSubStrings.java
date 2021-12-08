package HandsOnJAVA;

public class PrintSubStrings {
	public static void main(String[] args) {
		String str = "abcbcac";
		
//		 char str[] = info.toCharArray();  
		 
		int len = str.length();
		for(int i=0;i<len;i++) {
			for(int j=i;j<len;j++) {
				System.out.print(str.substring(i,j) + " ");
			}
			System.out.println(" ");
		}
	}
}
