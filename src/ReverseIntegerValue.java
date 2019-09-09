import java.util.Scanner;

public class ReverseIntegerValue
{
    public static void main(String[] args)
    {
    int [] numArray = new int []{1975, 1979, 1987, 1992, 1996, 1999, 2003, 2007, 2011, 2015, 2019};  //declare an array

        System.out.println("Original Array :");

       for (int i = 0; i < numArray.length; i++)        //loop to print original value
        {
            System.out.print(numArray[i] + " ");
        }

       System.out.println();

       System.out.println("Array in reverse order:");

       for (int i = numArray.length-1; i>=0; i--)       //loop to print in reverse order
       {
           System.out.print(numArray[i] + " ");
       }
    }
}

/*int[]numArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 16};     //input numbers of arrays (SIMPLE WAY CALCULATION)

                    System.out.println(numArray.length);

                    System.out.println("Original order " + Arrays.toString(numArray)); //Arrays.toString(numArray)

                    for (int i = numArray.length-1; i >= 0; i--)    //index 9, right, print index no 9,
                    {
                        System.out.print("index"+i);//9                    // it will print index number
                        System.out.print("value"+ numArray[i]);             // it will print value of that particular index
                        System.out.print(" ");
                    }*/

/*
Scanner scanner=new Scanner(System.in);     //DEV'S HOME WORK
                    System.out.println("Enter the lenght of elements");
                    int elements=scanner.nextInt();
                     int a[]=new int[elements];//array lenght
                    System.out.println("Enter the elements in the array");
                    for(int i=0;i<a.length;i++){
                        a[i]=scanner.nextInt();
                        //System.out.println(Arrays.toString(a));}
                        System.out.println("this is the Reverse Elements");
                        for( int j =a.length -1;j>=0;j--){
                            System.out.println(a[j]);
                        }

 */
/*
import java.util.Scanner;       //NIYATI'S HOME WORK

public class OneNumber {

    public void m1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the lenght of array");
        int len = scanner.nextInt();
        int arr[] = new int[len];
        System.out.print("The array is");
        for (int i = 0; i < arr.length; i++) {

            arr[i] = scanner.nextInt();
            //System.out.print(Arrays.toString(arr));
            //  System.out.print(arr[i]);}
        }
        System.out.println("this is the Reverse Elements");
        for( int i =arr.length -1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
    public static void main (String args[])
    {
        OneNumber obj = new OneNumber();
        obj.m1();
    }

}
*/
