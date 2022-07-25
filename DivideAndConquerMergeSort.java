// Divide and Conquer
// Dividing the problem into multiple smaller instances (usually 2), generally of the same size
// Solve the smaller instances, typically using recursion
// Combine the solutions to the smaller instances to get the solution to the original problem

public class DivideAndConquerMergeSort
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

    public static int[] mergeSort(int[] unsorted)
    {
        helper(unsorted, 0, unsorted.length - 1);
        return unsorted;
    }

    public static void helper(int[] unsorted, int start, int end)
    {
        // Leaf worker
        // number of indices in a sub array: end - start + 1
        if(start == end)
        {
            return;
        }

        // Internal node worker
        int mid = start + (end - start)/2;
        helper(unsorted, start, mid);
        helper(unsorted, mid + 1, end);

        // merge the two halfs
        int aux[] = new int[end - start + 1];
        int auxIndex = 0;
        int i = start;
        int j = mid + 1;

        while(i <= mid && j <= end)
        {
            if(unsorted[i] <= unsorted[j])
            {
                aux[auxIndex] = unsorted[i];
                auxIndex++;
                i++;
            } else {
                aux[auxIndex] = unsorted[j];
                auxIndex++;
                j++;
            }
        }

        // Gather phase
        while(i <= mid)
        {
            aux[auxIndex] = unsorted[i];
            auxIndex++;
            i++;
        }
        while(j <= end)
        {
            aux[auxIndex] = unsorted[j];
            auxIndex++;
            j++;
        }

        for(int k = start; k < aux.length; k++)
        {
            unsorted[k] = aux[k];
        }

        return;
    }
}