import java.util.*;

class Book {
    private String title;
    private String author;
    private boolean borrowed;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.borrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public String toString() {
        return "Title: " + title + ",  Author: " + author + ",  isBorrowed: " + borrowed;
    }
}

class MyLibrary {
    int add = 1;
    int present = 0;
    private List<Book> books;

    public MyLibrary() {
        books = new ArrayList<>();
    }

    public void addBook(String title, String author) {
        Book book = new Book(title, author);
        books.add(book);
        System.out.println();
        System.out.println(add + " Book added successfully.");
        present++;
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        System.out.println("Books in the library: " + present);
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.print("Book found: ");
                System.out.println(book);
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.isBorrowed()) {
                    System.out.println("Book is already borrowed.");
                } else {
                    book.setBorrowed(true);
                    System.out.println("Book borrowed successfully.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.isBorrowed()) {
                    book.setBorrowed(false);
                    System.out.println("Book returned successfully.");
                } else {
                    System.out.println("Book is not borrowed.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }
}

class Library_management_system {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyLibrary library = new MyLibrary();

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Borrow Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();
            System.out.println();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    library.addBook(title, author);
                    break;
                case 2:
                    library.displayBooks();
                    break;
                case 3:
                    System.out.print("Enter book title to search: ");
                    title = scanner.nextLine();
                    library.searchBook(title);
                    break;
                case 4:
                    System.out.print("Enter book title to borrow: ");
                    title = scanner.nextLine();
                    library.borrowBook(title);
                    break;
                case 5:
                    System.out.print("Enter book title to return: ");
                    title = scanner.nextLine();
                    library.returnBook(title);
                    break;
                case 6:
                    System.out.println("Thank You for visiting our Library.....\n");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
