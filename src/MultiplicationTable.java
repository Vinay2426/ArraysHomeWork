import java.util.Scanner;

public class MultiplicationTable
{
    public static void main(String [] args)
    {
      Scanner scanner =  new Scanner(System.in);
      System.out.println("Enter the number you wish to have of multiplication number :");
      int n = scanner.nextInt();

      int i = 1;

      do
          {
              System.out.println(n+"*" +i+ "=" +n*i);
              i++;
          }
      while (i <= 10);
    }
}