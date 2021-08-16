package util;

import java.lang.reflect.Array;

public class MyUtils {

    private static final int ARRAY_LENGTH = 5000;

    public static int[] getArray() {
        int[] response = new int[ARRAY_LENGTH];
        for(int i = ARRAY_LENGTH, pos = 0; i > 0; i--, pos ++) {
          response[pos] = i;
        }
        return response;
    }

    //returns a length for the secondary array eiter either odd or even
    public static int getLeftArrayLength(int mainArrayLength) {
        return (mainArrayLength % 2 == 0) ? (mainArrayLength) / 2 : ((mainArrayLength / 2) + 1);
    }

    public static void printArray(int[] array) {
        StringBuilder toPrint = new StringBuilder();
        for(int i: array) {
            toPrint.append(i).append(",");
        }
        toPrint.setLength(toPrint.length() - 1);
        System.out.println(toPrint.toString());
    }

    public static void swap(int[] array, int leftPos, int RightPos) {
        int temp = array[leftPos];
        array[leftPos] = array[RightPos];
        array[RightPos] = temp;
    }

    public static void fillSplitArray(int[] mainArray, int[] arraySplit, int start, int end) {
        int i = 0;
        while (start < end) {
            arraySplit[i] = mainArray[start];
            start++;
            i++;
        }
    }
}
