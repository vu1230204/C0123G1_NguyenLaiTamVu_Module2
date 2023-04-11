package exercise;

import java.util.Scanner;

public class Exercise_thuatoan {
    public static void main(String[] args) {
        int count = 0;
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số cần tính tổng số ước");
        number = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i + "\t");
                count = count + i;
            }

        }
        System.out.println(" tổng các ước của" + number + " là " + " " + count);
        System.out.println("\n----------------------------------");
    }
}

