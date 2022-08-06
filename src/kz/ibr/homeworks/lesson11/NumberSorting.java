package kz.ibr.homeworks.lesson11;

import kz.ibr.homeworks.lesson11.resources.BubbleSort;
import kz.ibr.homeworks.lesson11.resources.DataCreator;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class NumberSorting {
    public static void main(String[] args) {
        int elementsCount = 10_000;
        DataCreator dataCreator = new DataCreator(elementsCount);
        int[] dataForSort = dataCreator.getDataArray();
        int[] dataForArraySort = new int[elementsCount];
        System.arraycopy(dataForSort, 0, dataForArraySort, 0, dataForSort.length);
        //Засекаем время выполнения
        long startTimeForBubble = System.nanoTime();
        //Сортируем через BubbleSort
        BubbleSort.sort(dataForSort);
        long endTimeForBubble = System.nanoTime();
        long durationForBubble = endTimeForBubble - startTimeForBubble;
        System.out.println("Time elapsed Bubble: " + TimeUnit.MILLISECONDS.convert(durationForBubble, TimeUnit.NANOSECONDS) + "ms");

        //Засекаем время выполнения
        long startTime = System.nanoTime();
        //Сортируем через BubbleSort
        Arrays.sort(dataForArraySort);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Time elapsed Array.sort: " + TimeUnit.MILLISECONDS.convert(duration, TimeUnit.NANOSECONDS) + "ms");
        //System.out.println(Arrays.toString(dataForSort));
    }
}
