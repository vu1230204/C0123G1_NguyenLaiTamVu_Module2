package ss2_loop_array_java.exercise_2_10;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalLine {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("nhập độ dài của mảng");
        int number = sc.nextInt();
        System.out.println("nhập độ dài phần tử");
        int number2 = sc.nextInt();
        float[][] array = new float[number][number2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("nhập vào phần tử thứ " + i + j);
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println("Tổng đường chéo là :" + sum(array));
    }

    static float sum(float[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    sum += array[i][j];
                }

            }
        }
        return sum;
    }
}
