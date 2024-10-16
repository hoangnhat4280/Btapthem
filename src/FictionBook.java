public class FictionBook extends Book {
    String category;

    public FictionBook(String bookCode, String bookName, double price, String author, String category) {
        super(bookCode, bookName, price, author);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
    @Override
    public double getAmount() {
        return this.getPrice() * 0.93;
    }

}
