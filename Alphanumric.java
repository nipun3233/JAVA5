
public class Alphanumric {
	public static void main(String[] args) {
		String s1= "Nipun14974";
		if (s1.matches("[a-zA-Z0-9]+")) {
			System.out.println("It is alphanumric");
		}
		else {
			System.out.println("Not alphanumeric");
		}
	}
}
