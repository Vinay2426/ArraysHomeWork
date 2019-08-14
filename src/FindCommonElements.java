import java.util.Arrays;
import java.util.HashSet;

public class FindCommonElements
{
    public static void main (String [] args)
    {
        String [] array1 = {"West Indies", "India","Australia", "Pakistan", "Sri Lanka", "England"};
        String [] array2 = {"West Indies","Bangladesh", "India", "New Zealand", "Australia", "Afghanistan", "South Africa"};

        System.out.println("Array 1 : "+Arrays.toString(array1));
        System.out.println("Array 2 : "+ Arrays.toString(array2));

        HashSet<String> set = new HashSet<String>();        //hashset class for comparing strings

        System.out.println("Common Elements : ");


        for (int i = 0; i < array1.length; i++)     //to find common elements between both arrays
        {
            for (int j = 0; j < array2.length; j++)
            {
                if (array1[i] == array2[j])
                {
                    System.out.println(array1[i]);
                }
            }
        }
    }
}