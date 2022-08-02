// Similar to Merge sort
// instead picking an arbitrary value, and using it as a pivot


public class DivideAndConquerQuickSort
{
    public static void main(String[] args)
    {
        int[] unsorted = {6, 4, 5, 3, 5, 8};

        System.out.println("unsorted");
        printList(unsorted);

        System.out.println("sorted");
        int[] sorted = mergeSort(unsorted);
        printList(sorted);
    }

    public static void printList(int[] list)
    {
        for(int i = 0; i < list.length; i++)
        {
            System.out.print(list[i] + " ");
        }
    }

    public static int[] quickSort(int[] unsorted)
    {
        helper(unsorted, 0, unsorted.length - 1);
        return unsorted;
    }

    public static void helper(int[] unsorted, int start, int end)
    {
        // Leaf worker
        if(start == end)
        {
            return;
        }


        // Internal node worker
        // Lomuto's partitioning
        int i = start;
        for(int j = start + 1; j < end; j++)
        {
            if(unsorted[j] < unsorted[start])
            {
                i++;
                int temp = unsorted[i];
                unsorted[i] = unsorted[j];
                unsorted[j] = temp;
            }
        }
        int temp = unsorted[start];
        unsorted[start] = unsorted[i];
        unsorted[i] = unsorted[temp];

        helper(unsorted, start, i - 1);
        helper(unsorted, i + 1, end);
    }     
    
}