import java.util.Scanner;

public class NumberOfAinString
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input String Sentence :");
        String str = scanner.nextLine();

        char a = 'a';
        char a1 = 'A';

        System.out.println("Total Number of 'a' in given string is :");

        int n = 0;

        for (int i = 0; i < str.length(); i++)
        {
            if ((a == str.charAt(i))||(a1==str.charAt(i)))
                n++;
        }
        System.out.println(n);
    }
}