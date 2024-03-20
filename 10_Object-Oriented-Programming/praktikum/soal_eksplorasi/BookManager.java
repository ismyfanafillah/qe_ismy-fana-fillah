import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManager {
    private static List<Book> books = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean program_running = true;
        while (program_running) {
            System.out.println("Welcome to book management app\nPlease choose your menu:");
            System.out.println("1. Create a new book");
            System.out.println("2. Get all books");
            System.out.println("3. Get book by ID");
            System.out.println("4. Update book");
            System.out.println("5. Delete book");
            System.out.println("6. Exit");
            System.out.println("\n");

            int option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    createBook();
                    break;
                case 2:
                    getAllBooks();
                    break;
                case 3:
                    getBookById();
                    break;
                case 4:
                    updateBook();
                    break;
                case 5:
                    deleteBook();
                    break;
                case 6:
                    System.out.println("Bye....");
                    program_running = false;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }

    private static void createBook() {
        System.out.println("Enter title:");
        String title = scanner.nextLine();
        System.out.println("Enter author:");
        String author = scanner.nextLine();
        System.out.println("Enter category:");
        String category = scanner.nextLine();
        Book newBook = new Book(title, author, category);
        books.add(newBook);
        System.out.println("Book created with ID: " + newBook.getId());
        System.out.println("\n");
    }

    private static void getAllBooks() {
        System.out.println("=== ALL BOOKS ===");
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println("\n");
    }

    private static void getBookById() {
        System.out.printf("Enter book ID: ");
        String id = scanner.nextLine();
        for (Book book : books) {
            if (book.getId().equals(id)) {
                System.out.println(book);
                return;
            }
        }
        System.out.println("Book not found!");
        System.out.println("\n");
    }

    private static void updateBook() {
        System.out.printf("Enter book ID: ");
        String id = scanner.nextLine();
        for (Book book : books) {
            if (book.getId().equals(id)) {
                System.out.printf("Enter title: ");
                book.setTitle(scanner.nextLine());
                System.out.printf("Enter author: ");
                book.setAuthor(scanner.nextLine());
                System.out.printf("Enter category: ");
                book.setCategory(scanner.nextLine());
                System.out.println("Book updated!");
                System.out.println(book);
                return;
            }
        }
        System.out.println("Book not found!");
        System.out.println("\n");
    }

    private static void deleteBook() {
        System.out.printf("Enter book ID: ");
        String id = scanner.nextLine();
        books.removeIf(book -> book.getId().equals(id));
        System.out.println("Book deleted!");
        System.out.println("\n");
    }
}

