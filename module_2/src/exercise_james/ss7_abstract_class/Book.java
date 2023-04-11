package exercise_james.ss7_abstract_class;

import java.util.Arrays;

public abstract class Book {


    public String nameBook;
    public String nameBookCompany;
    public String publishingYear;

    public Book() {
    }

    public Book(String nameBook, String nameBookCompany, String publishingYear) {
        this.nameBook = nameBook;
        this.nameBookCompany = nameBookCompany;
        this.publishingYear = publishingYear;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getNameBookCompany() {
        return nameBookCompany;
    }

    public void setNameBookCompany(String nameBookCompany) {
        this.nameBookCompany = nameBookCompany;
    }

    public String getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(String publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", nameBookCompany='" + nameBookCompany + '\'' +
                ", publishingYear='" + publishingYear + '\'' +
                '}';
    }


}
