package sort;

import util.MyUtils;

public class MergeSort {

    public static void main(String[] args) {
        Merge m = new Merge();
        int[] array = MyUtils.getArray();
        System.out.println("Before sort");
        MyUtils.printArray(array);
;       int[] arraySorted = m.sort(array);
        System.out.println("After sort");
        MyUtils.printArray(arraySorted);

    }
}

class Merge {

    //sort the array
    public int[] sort(int[] array) {
        if(array.length > 1) {
            int leftSize =  MyUtils.getLeftArrayLength(array.length);
            int rightSize = array.length - leftSize;
            int[] leftArray = new int[leftSize];
            int[] rightArray = new int[rightSize];
            MyUtils.fillSplitArray(array, leftArray, 0, leftSize);
            MyUtils.fillSplitArray(array, rightArray, leftSize, array.length);
            this.sort(leftArray);
            this.sort(rightArray);
            this.merge(array, leftArray, rightArray);

        }
        return array;
    }

    //given two arrays merge sorted
    public void merge(int[] main, int[] left, int[]  right) {
        int leftIndex = 0;
        int rightIndex = 0;
        int i = 0;
        while (left.length != leftIndex && right.length != rightIndex) {
            if (left[leftIndex] < right[rightIndex]) {
                main[i] = left[leftIndex];
                leftIndex++;
                i++;
            } else  {
                main[i] = right[rightIndex];
                i++;
                rightIndex++;
            }
        }

        while (left.length != leftIndex) {
            main[i] = left[leftIndex];
            leftIndex++;
            i++;
        }

        while (right.length != rightIndex) {
            main[i] = right [rightIndex];
            rightIndex++;
            i++;
        }
    }


}
