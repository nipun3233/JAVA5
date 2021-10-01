package home;

public class Marks_reoprt {
	public static void main(String[] args) {
		int marks =97;
		if(marks<40) {
			System.out.println("failed");
		}
		else if (marks>40 && marks<60) {
			System.out.println("c grade");
		}
		else if (marks>=60 && marks<80) {
			System.out.println("b grade");
		}
		else if (marks>=80 && marks<90) {
			System.out.println("a grade");
		}
		else{
			System.out.println("A+");
		}
	}
}
