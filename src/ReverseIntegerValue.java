public class ReverseIntegerValue
{
    public static void main(String[] args)
    {
    int [] numArray = new int []{1975, 1979, 1987, 1992, 1996, 1999, 2003, 2007, 2011, 2015, 2019};  //declare an array

        System.out.println("Original Array :");

       for (int i = 0; i < numArray.length; i++)        //loop to print original value
        {
            System.out.print(numArray[i] + " ");
        }

       System.out.println();

       System.out.println("Array in reverse order:");

       for (int i = numArray.length-1; i>=0; i--)       //loop to print in reverse order
       {
           System.out.print(numArray[i] + " ");
       }
    }
}
