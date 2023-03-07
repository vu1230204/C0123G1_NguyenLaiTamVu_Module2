package ss2_loop_array_java.exercise_2_7;

import java.util.Arrays;
import java.util.Scanner;


public class FindMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng ");
        int number = sc.nextInt();
        System.out.println("Nhập độ dài phần tử");
        int number2 = sc.nextInt();
        int[][] array = new int[number][number2];
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Nhập phần tử thứ" + i + j);
                array[i][j] = sc.nextInt();
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("giá trị lớn nhất trong ma trận là:" + max);
    }
}
