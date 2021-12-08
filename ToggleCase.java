package HandsOnJAVA;

public class ToggleCase {
public static void main(String[] args) {
	String info = "HelloWoRld";
	int temp;
	char str[] = info.toCharArray();  
	int len = info.length();
	for(int i=0;i<len;i++ ) {
		temp=str[i];
		if(temp==65 || temp==90) {
			temp=temp+23;
			
		}
		else if(temp==93 || temp==122) {
			temp=temp-23;
		}
		str[i]=temp;
	}
	for(int i=0;i<len;i++ ) {
		System.out.print(str[i]);
	}
}
}
