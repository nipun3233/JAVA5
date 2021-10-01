package home;

public class Swap_EXOR {
	public static void main(String[] args)
    {
        int x = 25, y = 36;

        x = x ^ y;

        y = x ^ y;

        x = x ^ y;
        System.out.println("The value of x is " + x
                + " and the value of y is " + y);
    }
}

