package home;

public class No_Frequency {
public static void main(String[] args) {
		
		int n; System.out.println("Enter Size of Array");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Enter Elements of Array");
		
		int a[] =new int[n];
		for(int i=0;n>i;i++)
		{
			a[i]=sc.nextInt();
		}
		int temp=a[0];
		for(int i=1;n>i;i++)
		{
			temp=temp^a[i];
		}
		System.out.println("Element occouring once is "+temp);
		sc.close();
		

	}
}
