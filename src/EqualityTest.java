public class EqualityTest
{
    static void equality_test(int[]my_array1, int[]my_array2)
    {
        boolean equalOrNot = true;

        if (my_array1.length == my_array2.length)
        {
            for (int i = 0; i < my_array1.length; i++)
            {
                if(my_array1.length != my_array2.length)
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
public static void main (String [] args)
{
  int [] array1 = {1975, 1979, 1983, 1987, 1992, 1996, 1999, 2003, 2007, 2011, 2015, 2019};
  int [] array2 = {1975, 1979, 1983, 1987, 1992, 1996, 1999, 2003, 2007, 2011, 2015, 2019};

  equality_test(array1, array2);
}
}
