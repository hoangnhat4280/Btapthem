 class ProgrammingBook extends Book {
    String language;
    String flamework;

    public ProgrammingBook(String bookCode, String bookName, double price, String author, String language, String flamework) {
        super(bookCode, bookName, price, author);
        this.language = language;
        this.flamework = flamework;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFlamework() {
        return flamework;
    }
    public void setFlamework(String flamework) {
        this.flamework = flamework;

    }
     @Override
     public double getAmount() {
         return this.getPrice() * 0.95;
     }
}
