public class Main {
    public static void main(String[] args) {

        Book book = new Book("Mr. and Mrs. Smith", 1999, new Author("John", "Smith", 4), 100);

        System.out.println(book);

        System.out.println("Является ли книга большой? ");
        System.out.println(book.isBig());
        System.out.println("Содержится ли в описании книги (названии или в имени автора) слово 'John' ? ");
        System.out.println(book.matches("John"));
        System.out.println("Оценочная стоимость книги: " + book.estimatePrice() + " рублей");
    }
}
