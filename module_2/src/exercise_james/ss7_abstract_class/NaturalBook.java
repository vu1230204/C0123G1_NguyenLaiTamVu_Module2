package exercise_james.ss7_abstract_class;

public class NaturalBook extends Book implements IBook {
   private int numberPublications;

    public NaturalBook() {
    }

    public NaturalBook(int numberPublications) {
        this.numberPublications = numberPublications;
    }

    public NaturalBook(String nameBook, String nameBookCompany, String publishingYear, int numberPublications) {
        super(nameBook, nameBookCompany, publishingYear);
        this.numberPublications = numberPublications;
    }

    @Override
    public String toString() {
        return "NaturalBook{" +
                "numberPublications=" + numberPublications +
                ", nameBook='" + nameBook + '\'' +
                ", nameBookCompany='" + nameBookCompany + '\'' +
                ", publishingYear='" + publishingYear + '\'' +
                '}';
    }

    @Override
    public void display() {
        NaturalBook naturalBook = new NaturalBook("Đắc Nhân Tâm", "Kim Đồng", "1998", 1);
        NaturalBook naturalBook2 = new NaturalBook("Đắc Nhân Tâm", "Kim Đồng", "1998", 1);
        NaturalBook naturalBook3 = new NaturalBook("Đắc Nhân Tâm", "Kim Đồng", "1998", 1);
        NaturalBook naturalBook4 = new NaturalBook("Đắc Nhân Tâm", "Kim Đồng", "1998", 1);
        NaturalBook[] naturalBooks = {naturalBook, naturalBook2, naturalBook3, naturalBook4};
        for (NaturalBook i : naturalBooks
             ) {
            System.out.println(i);
            
        }
    }
}
