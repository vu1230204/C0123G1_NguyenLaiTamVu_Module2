package ss13_search.exercise_2_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 7, 6, 4, 6, 4, 1, 2};
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(binarySearch(array, 0, array.length - 1, 4));
    }

    static int binarySearch(int[] array, int left, int right, int value) {
        int middle = (right + left) / 2;
        if (right >= left) {
            if (array[middle] == value) {
                return middle;
            } else if (value > array[middle]) {
                return binarySearch(array, middle + 1, right, value);
            } else if (value < array[middle]) {
                return binarySearch(array, left, middle - 1, value);
            }
        }
        return -1;
    }
}

