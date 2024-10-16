public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[6];
        books[0] = new ProgrammingBook("PB01", "Learn Java", 1500, "John Doe", "Java", "Spring");
        books[1] = new ProgrammingBook("PB02", "Learn Python", 1300, "Jane Doe", "Python", "Django");
        books[2] = new ProgrammingBook("PB03", "Learn C++", 1400, "Alex Smith", "C++", "Qt");
        books[3] = new FictionBook("FB01", "Sci-Fi Adventure", 1200, "Carl Jones", "Viễn tưởng 1");
        books[4] = new FictionBook("FB02", "Mystery Night", 1100, "Sarah Black", "Trinh thám");
        books[5] = new FictionBook("FB03", "Future World", 1000, "Lucy Brown", "Viễn tưởng 2");

        double totalSum = bookSum(books);
        System.out.println("Tổng tiền 6 cuốn sách (sau khi giảm giá) là: " + totalSum);
        countBooks(books);

    }

    public static double bookSum(Book[] books) {
        double sum = 0;
        for (Book book : books) {
            sum += book.getAmount();
        }
        return sum;
    }

    public static void countBooks(Book[] books) {
        int javaBooksCount = 0;
        int vientuongBooksCount = 0;
        int fictionBooks1000 = 0;

        for (Book book : books) {
            if (book instanceof ProgrammingBook) {
                if (((ProgrammingBook) book).getLanguage().equals("Java")) {
                    javaBooksCount++;
                }
            }
             if (book instanceof FictionBook) {
                if (((FictionBook) book).getCategory().equals("Viễn tưởng 1")) {
                    vientuongBooksCount++;
                }
                if (book.getAmount() < 1000) {
                    fictionBooks1000++;
                }
            }
        }
        System.out.println("Số sách ProgrammingBook có language 'Java' là : " + javaBooksCount);
        System.out.println("Số sách FictionBook có category 'Viễn tưởng 1' là : " + vientuongBooksCount);
        System.out.println("Số sách FictionBook có giá < 1000 là : " + fictionBooks1000);
    }
}


