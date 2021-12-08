package HandsOnJAVA;

public class Atoi {
public static void main(String [] args) {
	String s = "-11111";
	int news=0;
	int index=0;
	for(int i =0;i<s.length();i++) {
		if(s.charAt(i)>='0'|| s.charAt(i)<='9') {
		index= s.charAt(i)-'0';
		news= news*10 + index;
		}
		else if(s.charAt(i)=='-') {
			news=-1*news;
		}
//		
//		else {
//			i++;
//		}
		}
	System.out.print(news);
}
}
