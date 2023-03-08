package ss2_loop_array_java.exercise_2_9;

import java.util.Arrays;
import java.util.Scanner;

public class SumCol {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Nhập độ dài mảng ");
        int number = sc.nextInt();
        System.out.println("Nhập độ dài phần tử");
        int number2 = sc.nextInt();
        float[][] array = new float[number][number2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Nhập phần tử thứ" + i + j);
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println("Tổng là:" + sum(array));

    }

    static float sum(float[][] array) {
        int sum = 0;
        int j = 0;
        do {
            System.out.println("Bạn muốn tính cột thứ mấy:");
            j = sc.nextInt();
        } while (j < 0 || j >= array[0].length);
        for (int i = 0; i < array.length; i++) {
            sum += array[i][j];
        }
        return sum;
    }
}
