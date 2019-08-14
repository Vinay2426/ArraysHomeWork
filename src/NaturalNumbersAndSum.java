import java.util.Scanner;

public class NaturalNumbersAndSum
{
    public static void main(String[] args)
    {
        int i, n, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the end limit of natural number of your wish : ");
        n = scanner.nextInt();

        System.out.println("Natural numbers are : " +n);

        for (i = 1; i <= n; ++i)
        {
            System.out.println(i);
            sum = sum + i;
        }
        System.out.println("Sum of natural numbers = " +sum);
    }
}
