import java.util.Scanner;

public class SumOfEachDigit
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);   //scanner class will let us input the number
        System.out.println("Enter Five Digit number :");
        int n = scanner.nextInt();      //for numbers
        int sum = 0;

        while (n > 0)
        {
            int add = n % 10;
            sum = sum + add;
            n = n / 10;

        }
        System.out.println("Total of Inputted Number : " +sum);
    }
}