package sort;

import util.MyUtils;

public class InsertionSort {

    public static void main(String[] args) {
        Insertion in = new Insertion();
        int[] array = MyUtils.getArray();
        System.out.println("Before ort");
        MyUtils.printArray(array);
        int[] arraySorted = in.sort(array);
        System.out.println("\n");
        MyUtils.printArray(arraySorted);
    }
}

//[a,b] if b > a then [b,a]
class  Insertion {
    public int[] sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int rightVal = array[i];
            int leftPoss = i - 1;
            while ((leftPoss >= 0) && (rightVal < array[leftPoss])) {
                array[leftPoss + 1] = array[leftPoss];
                leftPoss--;
            }
            array[leftPoss + 1] = rightVal;
        }
        return  array;
    }
}
