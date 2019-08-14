import java.util.Scanner;

public class ReverseNumber
{
    public static void main (String [] args)
    {
    Scanner scanner = new Scanner(System.in);       //enter the number
    System.out.println("Enter any number : ");
    int n = scanner.nextInt();

    int reversed = 0;

    while (n != 0)
    {
        int digit = n % 10;
        reversed = reversed * 10 + digit;
        n = n / 10;
    }
    System.out.println("Reversed Number : " +reversed);
    }
}