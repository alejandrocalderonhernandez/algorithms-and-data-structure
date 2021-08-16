package sort;

import util.MyUtils;

public class BubbleSort {

    public static void main(String[] args) {
        Bubble b = new Bubble();
        int[] array = MyUtils.getArray();
        System.out.println("Before sort");
        MyUtils.printArray(array);
        int[] arraySorted = b.sort(array);
        System.out.println("After sort");
        MyUtils.printArray(arraySorted);
    }
}

//if right position is less than actual position then swap -> is [a,b] b < a then [b,a]
class Bubble {
    public int[] sort(int[] array) {
        for (int j = 0; j < (array.length - 1); j++) {
            for (int i = 0; i < (array.length - 1); i++) {
                int rightVal = array[i+1];
                int leftVal = array[i];
                if(rightVal < leftVal) {
                    array[i] = rightVal;
                    array[i+1] = leftVal;
                }
            }
        }
        return array;
    }
}
