import java.util.Scanner;

public class PalindromeNumber
{
    public static void main(String[] args)
    {
    String original, reverse = "";
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter any Number :");

    original = scanner.nextLine();
    int length = original.length();


    for(int i = length - 1; i >= 0; i--)
        reverse = reverse + original.charAt(i);
    if (original.equals(reverse))
    {
        System.out.println("Entered Number is a Palindrome number");
    }
    else
    {
        System.out.println("Entered Number is not a Palindrome number");
    }
    }
}
