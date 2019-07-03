package main.java.library;

import java.util.Map;

public class Librarian {

    public static <String> void printBookOfDate(Map<String, String> library, String dateTaken) {

        if (library.get(dateTaken) == null) {
            System.out.println("Yo haven't take any book in " + dateTaken);
        } else {
            System.out.println("Book tou taken on " + dateTaken + " is: " + library.get(dateTaken));
        }
    }

    public static void printAllDatesTakenBook(Map<String, String> library) {
        System.out.println("All dates when you have taken in library books are: " + library.keySet());
    }

    public static void printAllTakenBooks(Map<String, String> library) {
        System.out.println("All book you have taken in library are: " + library.values());
    }
}
