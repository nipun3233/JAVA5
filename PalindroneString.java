package HandsOnJAVA;

public class PalindroneString {
	public static void main(String[] args) {
		String info= "NITIN";
		char str[] = info.toCharArray();  
		int len= info.length();
		Boolean flag=false;
		int j=len-1;
		for(int i=0;i<len/2;i++) {
			if(str[i]!=str[j] ) {
				flag=true;
				System.out.println("not palindrome");
				break;
			}
			j--;
			
		}
		
		if(!flag) {
			System.out.println("palindrome");
		}
		}
	}

