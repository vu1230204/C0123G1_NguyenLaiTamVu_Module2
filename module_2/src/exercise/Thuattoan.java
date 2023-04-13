package exercise;

import java.util.Scanner;

public class Thuattoan {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số đầu tiên");
        a = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số thứ hai");
        b = Integer.parseInt(sc.nextLine());
        System.out.println("UCLN của " + a + " và " + b + "là " + UCLN(a, b));
        System.out.println("BCNN của " + a + " và " + b + "là " + BCNN(a, b));
        System.out.println("trung bình cộng của UCLB và BCNN của " + a + " và " + b + " là " + ((UCLN(a, b) + BCNN(a, b)) / 2));
    }

    public static int UCLN(int a, int b) {
        if (b == 0) return a;
        return UCLN(b, a % b);
    }

    public static int BCNN(int a, int b) {
        return (a * b) / UCLN(a, b);
    }
}
