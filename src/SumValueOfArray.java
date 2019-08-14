public class SumValueOfArray
{
    public static void main(String[] args)
    {
        int [] numArray = new int [] {1975, 1983, 2003, 1992, 2019, 1979, 1999, 1987, 2011, 2015, 1996, 2007}; //initialize an array
        int sum = 0;        //

        for (int i = 0; i<numArray.length; i++)                     //loop for calculating the value of an array
        {
        sum = sum + numArray[i];
        }
        System.out.println("Sum Value of an Array: " + sum);        //to print total value of numbers
    }
}