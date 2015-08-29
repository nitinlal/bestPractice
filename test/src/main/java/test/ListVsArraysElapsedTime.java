package src.main.java.test;

import java.util.LinkedList;

/**
 * Created by nitin on 8/29/15.
 */
public class ListVsArraysElapsedTime {
    static LinkedList linkedList = new LinkedList();
    static Integer int_max = 100000;
    static Integer[] arrays = new Integer[int_max];

    static {
        for (int i = 0; i < int_max; i++) {
            linkedList.add(i);
        }


        int a = 0;
        while (a < int_max) {
            arrays[a] = a;
            a++;
        }
    }

    public static void main(String arg[]) {

        System.out.println("Elapsed time for linkedList " + elapsedTimeForLinkedList());
        System.out.println("Elapsed time for arrays" + elapsedTimeForArrays());


    }

    private static long elapsedTimeForArrays() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arrays.length; i++) {

        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static long elapsedTimeForLinkedList() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < linkedList.size(); i++) {

        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
