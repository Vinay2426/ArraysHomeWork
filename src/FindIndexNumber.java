public class FindIndexNumber
{
    public static int FindIndexNumber(int[] arr, int key)     //method used to help find index numbers in main method
    {
        for (int i = 0; i < arr.length; i++)                    //loop for iterate the search process
        {
        if (arr[i] == key)                                      //if used for finding result
            {
            return i;
            }
        }
            return -1;
    }
    public static void main(String[] args)
    {
    int [] numArray = {1975, 1983, 2003, 1992, 2019, 1979, 1999, 1987, 2011, 2015, 1996, 2007};     //initializing the array

    int key = 2019;                                             //input the number of wish to find index number

    System.out.println(key+" is located at index number :" +FindIndexNumber(numArray, key));
    }
}