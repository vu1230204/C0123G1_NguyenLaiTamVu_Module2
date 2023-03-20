package ss11_stack.exercise_1_1;

import java.util.Stack;
import java.util.Scanner;
import java.util.Arrays;

public class Revert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn nhập bao nhiêu phần tử:");
        int length = Integer.parseInt(sc.nextLine());
        Stack<Integer> stack = new Stack<>();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Nhập phần tử thứ: " + (i + 1));
            int mNumber = Integer.parseInt(sc.nextLine());
            array[i] = mNumber;
            stack.push(mNumber);
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
        System.out.println(" mảng đảo ngược " + "\n" + Arrays.toString(array));
    }
}
