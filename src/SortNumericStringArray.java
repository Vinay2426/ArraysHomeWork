import java.util.Arrays;

public class SortNumericStringArray
{
    public static void main(String[] args)
    {
    int [] numArray = {1983, 2003, 1999, 1987, 1996, 2007};     //input numbers of arrays
    String [] strArray = {"India","Australia", "West Indies", "Sri Lanka", "England", "Pakistan"};  //input string of arrays

        System.out.println("Numeric Array :" +Arrays.toString(numArray));        //print command to sort the number
        System.out.println("String Array :" +Arrays.toString(strArray));        //print command to sort the string

        System.out.println();        //print next line to keep space between both results

        Arrays.sort(numArray);              //arrays util is called to organise the print in order
        Arrays.sort(strArray);

        System.out.println("Sorted Numeric Array :" +Arrays.toString(numArray));        //print command to sort the number and string in order
        System.out.println("Sorted String Array :" +Arrays.toString(strArray));
    }
}