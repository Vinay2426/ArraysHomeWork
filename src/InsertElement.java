import java.util.Arrays;

public class InsertElement
{
    public static void main(String[]args)
    {

        int [] numArray = {1975, 1979, 1987, 1992, 1996, 1999, 2003, 2007, 2011, 2015, 2019};     //input numbers of arrays

        int Index_positing = 1;     //wish to insert new value on 2nd index of an array (index starts from 0) if you insert 2 then it will replace 3rd number
        int newValue = 1983;        //this number will replace above selected index

        System.out.println(numArray.length);    //will print the length of an array
        System.out.println("Original Array : "+ Arrays.toString(numArray) );        //will print original array before any changes

        for (int i = numArray.length-1; i > Index_positing; i--)                    //loop for inserting new elements
        {
            numArray[i] = numArray [i-1];
        }
        numArray[Index_positing] = newValue;
        System.out.println("New Arrays :" +Arrays.toString(numArray));              //will print amended array
    }
}