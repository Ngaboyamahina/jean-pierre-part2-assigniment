class Singlepierre {

    public static void main(String[] args) {
        // Creating an instance of the Book class
        Book myBook = new Book();

        // Using methods to set information about the book
        myBook.setTitle("The Great Gatsby");
        myBook.setAuthor("F. Scott Fitzgerald");
        myBook.setPublicationYear(1925);

        // Using a method to display information about the book
        myBook.displayBookInfo();
    }
}

// A class representing a Book
class Book {
    private String title;
    private String author;
    private int publicationYear;

    // Method to set the title of the book
    public void setTitle(String title) {
        this.title = title;
    }

    // Method to set the author of the book
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to set the publication year of the book
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    // Method to display information about the book
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
    }
}