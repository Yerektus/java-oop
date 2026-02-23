package lab2.problem1.librarySystem;

class LibraryTest {
    public static void main(String[] args) {
        Book book = new Book("Clean Code", "Robert Martin", 2008, 464);

        System.out.println(book);
        System.out.println("Is long book? " + book.isLongBook());
    }
}