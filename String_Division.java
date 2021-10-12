package home;

public class String_Division {
	public static void main(String[] args) {
		
		String str="aaabbbccc";
		int size=str.length();
		int part=0;
		int n=3;
		
		part=size/n;
		for(int i=0;i<size;i++) {
			if(i%part==0    ) {
				System.out.println();
			}
			System.out.print(str.charAt(i));

		}
	}
}
      