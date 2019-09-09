import java.util.Scanner;

public class TotalNumberOfWords
{
    public static void main (String [] args)
    {
        Scanner scanner = new Scanner (System.in); //scanner method being used so user can input data/string

        System.out.println("Write a sentence of which you wish to count words :");

        String string = scanner.nextLine();

        int word = 0;       //if you declare here 0, then add one in sout

        /*for (int i = 0; i < string.length(); i++)       //counts each word without space
        {
            if (string.charAt(i) ==' ')
            {word ++;}
        }
        System.out.println("Total number of words in a string :" +word+1);   //will give output of counts. words are usually more than space
        System.out.println("Number of spaces :" +(word) ); // space is usually one less than words which is already initiated zero
        */
        for (int i = 0; i < string.length(); i++)       //counts each character without space
        {
            if (string.charAt(i) !=' ')
            {word ++;}
        }
        System.out.println("Total number of characters in a string :" +word);   //will give output of all the character

    }
    /*                                                          //Dev's homework
    Scanner scanner=new Scanner(System.in);
        System.out.println("enter the sentence");
        String sentence=scanner.nextLine();
        int a=1;

        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)==' '){
                a++;
            }
        }
        System.out.println("Total no of words in the sentence is " + a);
        System.out.println("Total no of spaces in the sentence is " + (a-1));
    }
     */
}