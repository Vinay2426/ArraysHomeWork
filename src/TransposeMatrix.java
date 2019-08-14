public class TransposeMatrix
{
public static void main(String [] args)
{
   int [] [] original = {{1975,1979,1983},{1987,1992,1996},{1999,2003,2007}};      //columns and rows value assign

   int transpose [] [] = new int [3] [3];    //3 rows and 3 columns

    for (int i = 0; i < 3; i++)         //code to transpose a matrix
    {
        for (int j = 0; j < 3; j++)
        {
            transpose[i][j] = original[j][i];
        }
    }

    System.out.println("Pricing Matrix without transpose:");

    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            System.out.print(original [i] [j] + " " );
        }
        System.out.println(); //for new ling
    }
    System.out.println("Printing Matrix After Transpose:");

    for(int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            System.out.print(transpose [i] [j] + " " );
        }
        System.out.println();   //for new line
    }
}
}