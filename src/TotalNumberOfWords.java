import java.util.Scanner;

public class TotalNumberOfWords
{
    public static void main (String [] args)
    {
        Scanner scanner = new Scanner (System.in); //scanner method being used so user can input data/string

        System.out.println("Write a sentence of which you wish to count words :");

        String string = scanner.nextLine();

        int letter = 0;
        int space = 0;

        for (int i = 0; i < string.length(); i++)       //counts each character without space
        {
            if (string.charAt(i) !=' ')
            {letter ++;}
        }
        System.out.println("Total number of characters in a string :" +letter);   //will give output of counts
        //System.out.println("Number of spaces :" );
    }
}