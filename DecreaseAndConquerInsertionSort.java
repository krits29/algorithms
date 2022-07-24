// Decrease and Conquer
// allocating a singular insertion to a previously sorted 

public class DecreaseAndConquerInsertionSort
{
    public static void main(String[] args)
    {
        int[] unsorted = {6, 4, 5, 3, 5, 8};

        System.out.println("unsorted");
        for(int i = 0; i < unsorted.length; i++)
        {
            System.out.print(unsorted[i] + " ");
        }

        System.out.println("sorted");
        for(int i = 0; i < insertionSort(unsorted).length; i++)
        {
            System.out.print(insertionSort(unsorted)[i] + " ");
        }
    }

    public static int[] insertionSort(int[] unsorted)
    {
        for(int i = 0; i < unsorted.length; i++)
        {
            int temp = unsorted[i];
            int j = i - 1;
            while((j >= 0) && (unsorted[j] > temp))
            {
                unsorted[j+1] = unsorted[j];
                j--;
            }
            unsorted[j+1] = temp;
        }
        return unsorted;
    }
}