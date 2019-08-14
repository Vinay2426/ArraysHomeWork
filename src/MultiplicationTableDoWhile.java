public class MultiplicationTableDoWhile
{
    public static void main(String[] args)
    {
        System.out.println("Multiple up-to 9");

        int n = 1;

        do
        {
            int temp = 1;

            do
            {  System.out.print(temp*n);
            temp++;
            }
            while (temp <= 3);

            System.out.println(" ");
            n++;
        }
        while (n <= 3);
    }
}