package otus.homeworkSorting;

import java.util.Arrays;

public class homeworkSorting {
    public static void main(String[] args) {

        int[] array = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*1000);
        }
        int[] array2 = array.clone();

        long start = System.nanoTime();
        Arrays.sort(array);
        long finish = System.nanoTime();
        System.out.println("Системная сортировка. Прошло мс: " + (finish-start));

        start = System.nanoTime();
        QuickSort.sort(array2, 0, array.length - 1);
        finish = System.nanoTime();
        System.out.println("Моя сортировка. Прошло мс: " + (finish-start));

    }
}

