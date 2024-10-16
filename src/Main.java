public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[6];
        books[0] = new ProgrammingBook("PB01", "Learn Java", 1500, "John Doe", "Java", "Spring");
        books[1] = new ProgrammingBook("PB02", "Learn Python", 1300, "Jane Doe", "Python", "Django");
        books[2] = new ProgrammingBook("PB03", "Learn C++", 1400, "Alex Smith", "C++", "Qt");
        books[3] = new FictionBook("FB01", "Sci-Fi Adventure", 1200, "Carl Jones", "Viễn tưởng 1");
        books[4] = new FictionBook("FB02", "Mystery Night", 1100, "Sarah Black", "Trinh thám");
        books[5] = new FictionBook("FB03", "Future World", 1000, "Lucy Brown", "Viễn tưởng 2");


        double sum = 0;
        for (Book book : books) {
            sum += book.getPrice();
        }
        System.out.println("Tổng tiền của 6 cuốn sách là: " + sum);
    }

}
