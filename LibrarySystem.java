package day3;

import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        // Add some sample data
        library.addBook(new Book(1, "Java Fundamentals"));
        library.addBook(new Book(2, "Database Management System"));
        library.addBook(new Book(3, "Spring Boot"));

        library.addUser(new User(101, "Soumya"));
        library.addUser(new User(102, "Sani"));

        boolean running = true;
        while (running) {
            System.out.println("\n====== Library System Menu ======");
            System.out.println("1. View Available Books");
            System.out.println("2. View Users");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    library.showAvailableBooks();
                    break;
                case 2:
                    library.showUsers();
                    break;
                case 3:
                    System.out.print("Enter Book ID: ");
                    int bookId = scanner.nextInt();
                    System.out.print("Enter User ID: ");
                    int userId = scanner.nextInt();
                    library.issueBook(bookId, userId);
                    break;
                case 4:
                    System.out.print("Enter Book ID: ");
                    int returnBookId = scanner.nextInt();
                    System.out.print("Enter User ID: ");
                    int returnUserId = scanner.nextInt();
                    library.returnBook(returnBookId, returnUserId);
                    break;
                case 5:
                    running = false;
                    System.out.println("Thank you for using the Library System!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}
