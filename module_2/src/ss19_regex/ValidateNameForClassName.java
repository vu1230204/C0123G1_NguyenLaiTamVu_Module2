package ss19_regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateNameForClassName {
    private static final String REGEX_CLASS = "^[C|P|A][0-9]{4}[G|H|I|K]";

    public static boolean validateClassName(String regex) {
        return Pattern.matches(REGEX_CLASS, regex);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên lớp");
        String classesName = sc.nextLine();
        System.out.println(validateClassName(classesName));
    }
}

