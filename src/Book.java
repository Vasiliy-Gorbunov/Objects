import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int publicationYear;

    public Book(String name, Author author, int publicationYear) {
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }


    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "\"" + name + "\"" + " - " + author.toString() + ", " + publicationYear+"г.";
    }

    @Override
    public boolean equals(Object anotherBook) {
        if (this == anotherBook) return true;
        if (anotherBook == null || getClass() != anotherBook.getClass()) return false;
        Book book = (Book) anotherBook;
        return publicationYear == book.publicationYear && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, publicationYear);
    }
}
