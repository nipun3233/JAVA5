package HandsOnJAVA;

public class ReverseCharArray {
public static void main(String[] args) {
	char[] s = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l' , 'd'};
	char temp = ' ';
	int j =10,i=0;
	while(i<=j){
		temp = s[i];
		s[i]=s[j];
		s[j]=temp;
		j--;
		
	}
	
	for(int k =0;k<11;k++) {
		System.out.print(s[i]);
		
	}
 }
 }
