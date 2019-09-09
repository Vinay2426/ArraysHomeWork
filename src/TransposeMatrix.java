public class TransposeMatrix
{
public static void main(String [] args)
{
   int [] [] original = {{1975,1979,1983},{1987,1992,1996},{1999,2003,2007},{1,2,3,4}};      //columns and rows value assign

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
/*
public class Practice       //transpose
{
    public static void main(String[] args) {
    int a[][]={{10,20,30},{15,67,25},{45,77,67}};   // 10 20 30   10  15
                                                    // 15 25 35   20  25
                                                    //  30  35
        int b[][]=new int[a.length][a.length];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.print(a[i][j] + " ");
                // System.out.print(" ");
            }

            System.out.println();
        }

        for(int i=0;i<a.length;i++) {
            for (int j = 0; j <a.length; j++) {
                b[i][j] = a[j][i];
            }

        }
        System.out.println("the transpose matrix");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.print(b[i][j] + " ");
                // System.out.print(" ");
            }

            System.out.println();
        }}}

 */