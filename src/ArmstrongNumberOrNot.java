import java.util.Scanner;

public class ArmstrongNumberOrNot
{
    public static void main(String[] args)
    {
        int a, arm = 0, n, temp;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter any Number :");
    n = scanner.nextInt();

    temp = n;

    for (;n!=0;n/=10)
    {
        a = n % 10;
        arm = arm + (a*a*a);
    }
    if (arm == temp)
    {
        System.out.println(temp+ " is a Armstrong Number");
    }
    else
    {
        System.out.println(temp+ " is not a Armstrong Number");
    }

    }
}
