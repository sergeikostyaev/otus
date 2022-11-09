package otus.homeworkSorting;

import java.time.LocalDateTime;

public class homeworkSorting {
    public static void main(String[] args) {

        int[] array = {9, 6, 4, 7, 4, 3, 4, 7, 9, 4, 33, 444, 6, 6, 76, 4334, 2, -45, -667};

        for (int i : array) System.out.print(i + "  ");
        System.out.println();

        QuickSort.sort(array, 0, array.length - 1);

        for (int i : array) {
            System.out.print(i + "  ");
        }

    }
}

