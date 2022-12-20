public class Main {

    public static void printBook(Book book) {
        String name = book.getName();
        String author = book.getAuthor().getFullName();
        int year = book.getPublicationYear();
        System.out.println("Название книги: \"" + name + "\"");
        System.out.println("Автор: " + author);
        System.out.println("Год издания: " + year + "г.");
        System.out.println();
    }

    public static void main(String[] args) {
        Author levTolstoy = new Author("Лев", "Толстой");
        Book warAndPeace = new Book("Война и мир", levTolstoy, 1869);
        Author azimov = new Author("Айзек", "Азимов");
        Book foundation = new Book("Основание", azimov, 1945);
        printBook(warAndPeace);
        printBook(foundation);
        foundation.setPublicationYear(1951);
        printBook(foundation);
    }
}