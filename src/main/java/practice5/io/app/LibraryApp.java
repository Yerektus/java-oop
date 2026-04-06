package practice5.io.app;

import practice5.io.model.Book;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryApp {
    private static final String FILE_NAME = "library.dat";

    @SuppressWarnings("unchecked")
    private static ArrayList<Book> loadLibrary() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            return new ArrayList<>();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (ArrayList<Book>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Could not load library: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    private static void saveLibrary(ArrayList<Book> books) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(books);
            System.out.println("Library saved.");
        } catch (IOException e) {
            System.out.println("Could not save library: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ArrayList<Book> books = loadLibrary();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("\n(A)dd book, (L)ist books, (Q)uit: ");
            String choice = scan.nextLine().trim().toUpperCase();

            switch (choice) {
                case "A":
                    System.out.print("Title: ");
                    String title = scan.nextLine();
                    System.out.print("Author: ");
                    String author = scan.nextLine();
                    books.add(new Book(title, author));
                    System.out.println("Book added.");
                    break;
                case "L":
                    if (books.isEmpty()) {
                        System.out.println("No books in library.");
                    } else {
                        books.forEach(System.out::println);
                    }
                    break;
                case "Q":
                    saveLibrary(books);
                    scan.close();
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
