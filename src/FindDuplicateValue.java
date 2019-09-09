import java.util.Arrays;

public class FindDuplicateValue
{
    public static void main(String[] args)
    {
    //int [] numArray = new int [] {1975, 1979, 1983, 1983, 1987, 1992, 1996, 1999, 2003, 2007, 2011, 2015, 2019};
        int [] numArray = {1975, 1979, 1983, 1983, 1987, 1992, 1996, 1999, 2003, 2007, 2011, 2015, 2019};

       System.out.println("Original Value of Array : " + Arrays.toString(numArray)); //will print original value

    /*for (int i = 0; i < numArray.length; i++)        //loop to print original value
        {
            System.out.print(numArray[i] + " ");
        }

        System.out.println();
*/
    System.out.println("Duplicate Value in Array : ");

    for (int i = 0; i < numArray.length; i++)           //loop to find duplicate value/s
        {
            for (int j = i + 1; j < numArray.length; j++)
            {
                if (numArray[i] == numArray [j])
                    System.out.println(numArray[j]);
            }
        }
    }
}
/*
import java.util.Scanner;

public class Duplicate {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the length of array");
        int len = scanner.nextInt();
        int arr[] = new int[len];
        System.out.print("The array is" );
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();

            //System.out.print(Arrays.toString(arr));
            //  System.out.print(arr[i]);}
        }
for (int i=0;i<arr.length;i++){
    for(int j=i+1;j<arr.length;j++)
        if(arr[i]==arr[j]){
            System.out.println("Duplicate array is " + arr[j]);
        }
    //System.out.println(arr[i]);
}


}}

 */