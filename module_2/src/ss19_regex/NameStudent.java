package ss19_regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class NameStudent {
    private static final String REGEX_CLASS = "^([A-Z][a-z]{1,7}\\s){1,5}([A-Z][a-z]{1,7})";

    public static boolean namevalidateStudent(String regex) {
        return Pattern.matches(REGEX_CLASS, regex);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên học sinh");
        String studentName = sc.nextLine();
        System.out.println(namevalidateStudent(studentName));
    }
}
