package otus.homeworkSorting;


public class QuickSort {
    public static void sort(int[] array, int from, int to) {

        if (from < to) {

            int index = devision(array, from, to);

            sort(array, from, index - 1);

            sort(array, index, to);
        }
    }

    private static int devision(int[] array, int from, int to) {

        int rightIndex = to;
        int leftIndex = from;
        int pointer = array[from];

        while (leftIndex <= rightIndex) {

            while (array[leftIndex] < pointer) leftIndex++;

            while (array[rightIndex] > pointer) rightIndex--;

            if (leftIndex <= rightIndex) {

                swap(array, rightIndex, leftIndex);
                rightIndex--;
                leftIndex++;

            }
        }
        return leftIndex;
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
