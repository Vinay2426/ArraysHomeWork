public class EqualityTest
{
    static void equality_test(int[]my_array1, int[]my_array2)
    {
        boolean equalOrNot = true;

       // if (my_array1.length == my_array2.length)     //if you want to compare both length
            if (my_array1 == my_array2)

            {
            for (int i = 0; i < my_array1.length; i++)
            {
                //if(my_array1.length != my_array2.length) //if you want to compare both length
                   if(my_array1 != my_array2)              // if you want to check the value of both arrays

                {
                    equalOrNot = false;
                }
            }
        }
        else
        {
            equalOrNot = false;
        }
        if (equalOrNot)
        {
            System.out.println("Both Arrays are Equal");
        }
        else
        {
            System.out.println("Both Arrays are not Equal");
        }
    }
public static void main (String[]args)
{
  int [] array1 = {1975, 1979, 1983, 1987, 1992, 1996, 1999, 2003, 2007, 2011, 2015, 2019};
  int [] array2 = {1975, 1979, 1983, 1987, 1992, 1996, 1999, 2003, 2007, 2011, 2015, 2019};

  equality_test(array1, array2);
}
}

/*
 public static void main(String[] args) //Niyati's home work
    {
        int arr[]={3,4,5,3,2};
        int brr[]={3,4,5,3,2};

        if(Arrays.equals(arr,brr)) {
            System.out.println("ARRAYS MATCH :" + Arrays.equals(arr, brr));
        }
        else{
            System.out.println("ARRAYS DOESN'T MATCH :"+ Arrays.equals(arr,brr));
        }
    }}

 */