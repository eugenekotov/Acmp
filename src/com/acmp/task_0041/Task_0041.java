package com.acmp.task_0041;

import java.util.Arrays;

public class Task_0041 {

    private static final int MIN = -100;
    private static final int MAX = 100;

    private static int[] arg1 = { 9, -20, 14 };
    private static int[] exp1 = { -20, 9, 14 };

    private static int[] arg2 = { 12, 7, 92, 5, 18, 4, 32, 48, 11, 74 };
    private static int[] exp2 = { 4, 5, 7, 11, 12, 18, 32, 48, 74, 92 };

    public static void main(String[] args) {
        new Task_0041().run();
    }

    public void run() {
        checkSolution(arg1, exp1);
        checkSolution(arg2, exp2);
    }

    private void checkSolution(int[] arg, int[] exp) {
        System.out.println(Arrays.equals(sort(arg), exp));
    }

    private int[] sort(int[] array) {
        // make empty array
        int[] temp = new int[MAX - MIN];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = 0;
        }
        // fill array
        for (int i = 0; i < array.length; i++) {
            int index = array[i] - MIN;
            temp[index] = temp[index] + 1;
        }

        // fill result
        int[] result = new int[array.length];
        int pos = 0;
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i]; j++) {
                result[pos] = i + MIN;
                pos++;
            }
        }
        return result;
    }

}
