public class RecursiveSelectionSort {

    // Find index of minimum element from index 'start' to end
    static int findMinIndex(int[] arr, int start) {
        if (start == arr.length - 1)
            return start;

        int minIndex = findMinIndex(arr, start + 1);

        return (arr[start] < arr[minIndex]) ? start : minIndex;
    }

    // Recursive selection sort
    static void selectionSort(int[] arr, int index) {
        if (index == arr.length - 1)
            return;

        // Find minimum element in remaining array
        int minIndex = findMinIndex(arr, index);

        // Swap if needed
        if (minIndex != index) {
            int temp = arr[index];
            arr[index] = arr[minIndex];
            arr[minIndex] = temp;
        }

        // Recurse for the rest of the array
        selectionSort(arr, index + 1);
    }

    // Print array
    static void printArray(int[] arr) {
        for (int val : arr)
            System.out.print(val + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.print("Before Sorting: ");
        printArray(arr);

        selectionSort(arr, 0);

        System.out.print("After Sorting:  ");
        printArray(arr);
    }
}
