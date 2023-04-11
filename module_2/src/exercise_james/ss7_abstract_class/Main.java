package exercise_james.ss7_abstract_class;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        NaturalBook naturalBook = new NaturalBook();
        naturalBook.display();
        SocialBook socialBook = new SocialBook();
        socialBook.display();
    }
}
