package lab2.problem1.librarySystem;

class Book extends LibraryItem {
    private int numberOfPages;

    public Book(String title, String author, int year, int pages) {
        super(title, author, year);
        this.numberOfPages = pages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public boolean isLongBook() {
        return numberOfPages > 500;
    }

    @Override
    public String toString() {
        return super.toString() + ", Pages: " + numberOfPages;
    }
}