package exercise_james.ss7_abstract_class;

import java.util.ArrayList;
import java.util.List;

public class SocialBook extends Book implements IBook {
    private String author;

    public SocialBook() {
    }

    public SocialBook(String author) {
        this.author = author;
    }

    public SocialBook(String nameBook, String nameBookCompany, String publishingYear, String author) {
        super(nameBook, nameBookCompany, publishingYear);
        this.author = author;
    }

    @Override
    public String toString() {
        return "SocialBook{" +
                ", nameBook='" + nameBook + '\'' +
                ", nameBookCompany='" + nameBookCompany + '\'' +
                ", publishingYear='" + publishingYear + '\'' + "author='" + author + '\'' +
                '}';
    }


    @Override
    public void display() {
        SocialBook socialBook = new SocialBook("Dac Nhan Tam", "kim dong", "1998", "nha nam");
        SocialBook socialBook2 = new SocialBook("Dac Nhan Tam", "kim dong", "1998", "nha nam");
        SocialBook socialBook3 = new SocialBook("Dac Nhan Tam", "kim dong", "1998", "nha nam");
        SocialBook socialBook4 = new SocialBook("Dac Nhan Tam", "kim dong", "1998", "nha nam");
        SocialBook socialBook5 = new SocialBook("Dac Nhan Tam", "kim dong", "1998", "nha nam");
        SocialBook[] socialBooks = {socialBook, socialBook2, socialBook3, socialBook4, socialBook5};
        for (SocialBook i : socialBooks
        ) {
            System.out.println(i);
        }
    }
}
