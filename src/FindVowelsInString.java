import java.util.Scanner;

public class FindVowelsInString
{
    public static void main(String[] args)
    {
//        String inputStr;
//        int v = 0;
//        int n = 0;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your string : ");
//        inputStr = scanner.nextLine();
//        for (int i = 0; i < inputStr.length(); i++) {
//            Character c = inputStr.charAt(i);
//            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c ==
//                    'o' || c == 'u') {
//                v++;
//            } else if (Character.isDigit(c)) {
//                n++;
//            }
//        }
//        System.out.println("No of vowels "+v);
//        System.out.println("No of numbers "+n);
        Scanner sc = new Scanner(System.in);

        System.out.println("Type a sentence");
        String sentence = sc.nextLine();
        System.out.println("You entered the sentence " + sentence);
        System.out.println("The number of words in the sentence is " + sentence.length());

        char [] chars=sentence.toCharArray();

        int count = 0;
        for (char c : chars) {
            switch(c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
            }
        }
        System.out.println("The numner of vowels in your sentence is " + count);
        System.out.println("The percentage of vowels is " + 100 * count /sentence.length() + "%" );
        System.out.println("The percentage of consonant is " +(100-(+100*count/sentence.length())) +"%");
    }
}
