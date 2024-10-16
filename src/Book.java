public class Book {
    String bookCode;
    String bookName;
    double price;
    String author;

    public Book(String bookCode, String bookName, double price, String author) {
        this.bookCode = bookCode;
        this.bookName = bookName;
        this.price = price;
        this.author = author;
    }

    public String getBookCode() {
        return this.bookCode;
    }

    public void setBookCode(String newBookCode) {
        this.bookCode = newBookCode;
    }

    public String getBookName() {
        return this.bookName;
    }

    public void setBookName(String newBookName) {
        this.bookName = newBookName;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double newAmount) {
        this.price = newAmount;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public double getAmount() {
        System.out.println("You will get a discount!");
        return this.price;
    }
}


