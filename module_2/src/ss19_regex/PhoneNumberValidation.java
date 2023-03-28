package ss19_regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PhoneNumberValidation {
    private static final String REGEX_CLASS = "^[0-9]{2}-0[0-9]{9}$";

    public static boolean phoneNumberValidation(String regex) {
        return Pattern.matches(REGEX_CLASS, regex);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so dien thoai");
        String phoneNumber = sc.nextLine();
        System.out.println(phoneNumberValidation(phoneNumber));
    }
}
