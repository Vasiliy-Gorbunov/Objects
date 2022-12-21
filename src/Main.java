public class Main {

    public static void main(String[] args) {
        Author levTolstoy = new Author("Лев", "Толстой");
        Book warAndPeace = new Book("Война и мир", levTolstoy, 1869);
        Author azimov = new Author("Айзек", "Азимов");
        Book foundation = new Book("Основание", azimov, 1945);
        System.out.println(warAndPeace);
        System.out.println(foundation);
        foundation.setPublicationYear(1951);
        System.out.println(foundation);
        Author tolstoyLev = new Author("Лев", "Толстой");
        System.out.println(levTolstoy.equals(tolstoyLev));
        Book peaceAndWar = new Book("Война и мир", tolstoyLev, 1869);
        System.out.println(warAndPeace.equals(peaceAndWar));
    }
}