package otus.homeworkSorting;

import java.util.Arrays;

public class homeworkSorting {
    public static void main(String[] args) {



        long start = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            int[] array = new int[1000000];
            for (int j = 0; j < array.length; j++) {
                array[j] = (int) (Math.random()*1000);
            }
            Arrays.sort(array);
        }
        long finish = System.nanoTime();
        System.out.println("Системная сортировка на 100 прогонов. Прошло нано: " + (finish-start));

        start = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            int[] array = new int[1000000];
            for (int j = 0; j < array.length; j++) {
                array[j] = (int) (Math.random()*1000);
            }
            QuickSort.sort(array, 0, array.length - 1);
        }
        finish = System.nanoTime();
        System.out.println("Моя сортировка на 100 прогонов. Прошло нано: " + (finish-start));

    }
}

