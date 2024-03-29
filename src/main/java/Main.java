package main.java;

import main.java.library.Librarian;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Map<String, String> library = new HashMap<>();
        library.put("2019-06-29", "Head First Java");
        library.put("2019-06-30", "ProGit");
        library.put("2019-07-01", "Effective Java");
        library.put("2019-07-02", "Head First Design Patterns");
        library.put("2019-07-03", "Java Concurrency");

        System.out.println("Enter the date when the book was taken (in format like 2019-07-03):");
        try (Scanner scanner = new Scanner(System.in)) {
            String dateTaken = scanner.nextLine();
            Librarian.printBookOfDate(library, dateTaken);
            System.out.println();
            Librarian.printAllDatesTakenBook(library);
            Librarian.printAllTakenBooks(library);
        } catch (java.util.InputMismatchException ex) {
            System.out.println("You entered incorrect date!");
        }

    }
}
