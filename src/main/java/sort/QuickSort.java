package sort;

import util.MyUtils;

public class QuickSort {

    public static void main(String[] args) {
        Quick q = new Quick();
        int[] array = MyUtils.getArray();
        System.out.println("Before sort");
        MyUtils.printArray(array);
        int[] arraySorted = q.sort(array);
        System.out.println("After sort");
        MyUtils.printArray(arraySorted);
    }
}

class Quick {

    //Main method calls quickSort
    public int[] sort(int[] array) {
        int pivot = array.length - 1;
        quickSort(array, 0, pivot);
        return  array;
    }

    /*
      arr[] --> Array to be sorted,
      left --> Starting index,
      right --> Ending index
    */
    public void quickSort(int[] array, int left, int right) {
        if(left < right) {
            int partitionIndex = partition(array, left, right);
            quickSort(array, left, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, right);
        }
    }
    /* This method takes last element as pivot, places
   the pivot element at its correct position in sorted
   array, and places all smaller (smaller than pivot)
   to left of pivot and all greater elements to right
   of pivot */
    public int partition(int[] array, int left, int right) {

        //pivot
        int pivot = array[right];
        // Index of smaller element and
        int index = left - 1;

        for (int i = left; i <= right - 1; i ++) {
            if (array[i] < pivot) {
                index++;
                MyUtils.swap(array, index, i);
            }
        }

        MyUtils.swap(array, index + 1, right);
        return index + 1;
    }
}
