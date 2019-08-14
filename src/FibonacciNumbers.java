import java.util.Scanner;

public class FibonacciNumbers
{
    public static void main(String[] args)
    {
        int n1 = 0, n2 = 1, n3, i, f;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numbers of Fibonacci no you wish to : ");
        f = scanner.nextInt();

        System.out.print(n1+ " " +n2);  // it will print 0 and 1

        for (i = 2; i < f; ++i)     //loop starts from 2 because 0 and 1 are already printed
        {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
