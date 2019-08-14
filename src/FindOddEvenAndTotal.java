import java.util.Scanner;

public class FindOddEvenAndTotal
{
    public static void main (String [] args)
    {
        int n, i, sumEven = 0, sumOdd = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number of Elements in an array : ");

        n = scanner.nextInt();

        int [] a = new int [n];

        System.out.println("Enter " + n + " elements of an Array");

        for (i = 0; i < n; i++)
        {
            a[i] = scanner.nextInt();
        }
            for (i = 0; i < n; i++)
            {
                if (a[i] % 2 == 0)
                {
                    sumEven = sumEven + a[i];
                }
                else
                {
                    sumOdd = sumOdd + a[i];
                }
            }
            System.out.println("Total of Even Numbers : " +sumEven);
            System.out.println("Total of Odd Numbers : " +sumOdd);
    }
}