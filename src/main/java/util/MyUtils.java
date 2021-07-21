package util;

public class MyUtils {

    private static final int ARRAY_LENGTH = 5000;

    public static int[] getArray() {
        int[] response = new int[ARRAY_LENGTH];
        for(int i = ARRAY_LENGTH, pos = 0; i > 0; i--, pos ++) {
          response[pos] = i;
        }
        return response;
    }

    public static void printArray(int[] array) {
        StringBuilder toPrint = new StringBuilder();
        for(int i: array) {
            toPrint.append(i).append(",");
        }
        toPrint.setLength(toPrint.length() - 1);
        System.out.print(toPrint.toString());
    }
}
