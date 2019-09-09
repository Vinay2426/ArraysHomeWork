public class ContainsSpecificValue
{
    public static void main(String[] args)
    {
    int [] myArray = {1975, 1983, 2003, 1992, 2019, 1979, 1999, 1987, 2011, 2015, 1996, 2007};     //input numbers of arrays

    int num = 1983;

    for (int i = 0; i < myArray.length; i++)    //for loop for iterate the process to verify if value is in array
    {
        if(num == myArray [i])                  // if statement is being used and will give output if method found the value in array
        {
            System.out.println("Array contains the given element");
        }
        /*else
            {
            System.out.println("Array does not contain the given element");
            }*/
    }
}
}