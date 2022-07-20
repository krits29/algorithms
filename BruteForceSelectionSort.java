// Brute force selection sort
// - simplist design strategy
// - most straigthforward approach
// - given an input of numbers 
// - output a permutation of the sequence of numbers
// - increasing order of numbers
// - Algorithm:
// - locate the smallest item and put it in the first place
// - then locate the next smallest and put it int he second plate
// - sort by repeated selection

public class BruteForceSelectionSort 
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!");

        int[] unsorted = {6, 4, 5, 3, 5, 8};

        System.out.println("unsorted");
        for(int i = 0; i < unsorted.length; i++)
        {
            System.out.print(unsorted[i] + " ");
        }

        //int[] sorted = new int[] selectionSort(unsorted);

        System.out.println("sorted");
        for(int i = 0; i < selectionSort(unsorted).length; i++)
        {
            System.out.print(selectionSort(unsorted)[i] + " ");
        }
    }

    public static int[] selectionSort(int[] unsorted)
    {
        
        for(int i = 0; i < unsorted.length; i++)
        {
            int minValue = unsorted[i];
            int minIndex = i;
            for(int j = i + 1; j < unsorted.length; j++)
            {
                if(unsorted[j] < minValue)
                {
                    minValue = unsorted[j];
                    minIndex = j;
                }
            }
            int temp = unsorted[i];
            unsorted[i] = unsorted[minIndex];
            unsorted[minIndex] = temp;
        }
        return unsorted;
        
    }
}