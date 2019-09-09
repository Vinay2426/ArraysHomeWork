import java.util.Scanner;

public class SumOfSquare
{
    public static void main(String[] args)
    {
//        Scanner scanner = new Scanner(System.in);     //will print the square of given number
//
//        System.out.print("Enter Integer: ");
//        int n = scanner.nextInt();
//        System.out.println("You entered: " + n);
//
//        int sum = 1;
//
//        for (int x=2;x<=n;x++)
//        {
//            sum = sum + (x*x);
//        }
//        System.out.println(sum);
        int num = 1;                //will find square of 1 to 100 all the numbers and will total of all of those
        int square;
        int sum = 0;
        while(num <= 100) {
            square = (num * num);
            sum = sum + square;
            num++;
        }
        System.out.println(sum);

    }
}