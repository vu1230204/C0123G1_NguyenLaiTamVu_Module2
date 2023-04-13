package exercise;

import java.util.Scanner;

public class ExerciseThuatToan {
    public static void main(String[] args) {
        System.out.println("dãy fibonacci nhỏ hơn 100 : ");
        for (int i = 0; i < 100; i++) {
            if (checkFibonacci(i) < 100) {
                System.out.println(checkFibonacci(i));
            }
        }
    }

    public static int checkFibonacci(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return checkFibonacci((n - 1)) + checkFibonacci(n - 2);
        }
    }
}
//    public static void main(String[] args) {
//        int a = 100;
//        check(a);
//    }
//
//    public static void check(int a) {
//        int temp;
//        int count = 0;
//        int sum = 0;
//
//        for (int i = 1; i < a; i++) {
//            temp = count;
//            count = sum;
//            sum = count + temp;
//            if (sum < a) {
//                System.out.println(sum);
//            } else
//                break;
//        }
//    }
