package ss1_introduction_java.exercise_1;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên của bạn");
        String name = sc.nextLine();
        System.out.println(name);
    }
}
