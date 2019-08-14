import java.util.Arrays;

public class SortNumericStringArray
{
    public static void main(String[] args)
    {
    int [] numArray = {1975, 1983, 2003, 1992, 2019, 1979, 1999, 1987, 2011, 2015, 1996, 2007};     //input numbers of arrays
    String [] strArray = {"West Indies", "India","Australia", "Pakistan", "Sri Lanka", "England"};  //input string of arrays

        System.out.println("Numeric Array :" + Arrays.toString(numArray));        //print command to sort the number
        System.out.println("String Array :" + Arrays.toString(strArray));        //print command to sort the string

        System.out.println();        //print next line to keep space between both results

        Arrays.sort(numArray);       //arrays util is called to organise the print in order
        Arrays.sort(strArray);

        System.out.println("Sorted Numeric Array :" + Arrays.toString(numArray));        //print command to sort the number and string in order
        System.out.println("Sorted String Array :" + Arrays.toString(strArray));
    }
}