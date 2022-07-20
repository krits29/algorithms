// Bubble sort
// Good argument for analyzing algorithm performance
// In practice it is a perfectly correct algorithm
// But it has the worst actual performance
// shows the difference between good algorithms and correct algorithms

public class BruteForceBubbleSort
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

        //int[] sorted = new int[] bubbleSort(unsorted);

        System.out.println("sorted");
        for(int i = 0; i < bubbleSort(unsorted).length; i++)
        {
            System.out.print(bubbleSort(unsorted)[i] + " ");
        }
    }

    public static int[] bubbleSort(int[] unsorted)
    {
        for(int i = 0; i < unsorted.length; i++)
        {
            for(int j = unsorted.length - 1; j >= i + 1; j--)
            {
                if(unsorted[j - 1] > unsorted[j])
                {
                    int temp = unsorted[j];
                    unsorted[j] = unsorted[j-1];
                    unsorted[j-1] = temp;
                }
            }
        }

        return unsorted;
    }
}