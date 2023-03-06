package ss1_introduction_java.exercise3;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số tiền USD");
        usd = sc.nextDouble();
        double transfer = usd * vnd;
        System.out.println("Giá trị VND: " + transfer);

    }


}
