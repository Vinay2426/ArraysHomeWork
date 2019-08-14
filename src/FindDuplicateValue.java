public class FindDuplicateValue
{
    public static void main(String[] args)
    {
    int [] numArray = new int [] {1975, 1979, 1983, 1983, 1987, 1992, 1996, 1999, 2003, 2007, 2011, 2015, 2019};

        for (int i = 0; i < numArray.length; i++)        //loop to print original value
        {
            System.out.print(numArray[i] + " ");
        }

        System.out.println();

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