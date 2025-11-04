public class Main {
    public static void main(String[] args) {

        Book book = new Book("Moby-Dick, or The Whale", 1851, new Author("Herman", "Melville", 4), 100);

        System.out.println(book);

        System.out.println("Является ли книга большой? ");
        System.out.println(book.isBig());
        System.out.println("Содержится ли в описании книги (названии или в имени автора) слово 'Dick' ? ");
        System.out.println(book.matches("Dick"));
        System.out.println("Оценочная стоимость книги: " + book.estimatePrice() + " рублей");
    }
}
