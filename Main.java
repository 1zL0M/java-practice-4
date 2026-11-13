import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("1988", "Джордж Дройд", 328, false);
        Book book2 = new Book("Свадебная ваза", "Джордж Дройд", 112 , true);
        Book book3 = new Book("Мастер и Пеперони", "Михаил Михаил", 480, false);

        System.out.println("Задание 1");
        book1.describe();
        book2.describe();
        book3.describe();

        Reader reader1 = new Reader("Алексей", "Фантастика");
        Reader reader2 = new Reader("Мария", "Классика");

        reader1.readBook(book1);
        reader2.readBook(book3);

        System.out.println("\nЗадание 2");
        System.out.println(reader1.getName() + ": " + reader1.getLastBookInfo());
        System.out.println(reader2.getName() + ": " + reader2.getLastBookInfo());

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(new Book("Смурфики", "Алеша величавый", 256, false));
        library.addBook(new Book("Бугульма", "Глеб", 300, true));
        library.addBook(new Book("Кровавый меридиан", "Кормак Маккарти\n", 640, false));

        System.out.println("\nЗадание 3");
        System.out.println("Всего страниц в библиотеке: " + library.getTotalPages());

        System.out.println("\nКниги Джорджа Дройда:");
        List<Book> droidBooks = library.findByAuthor("Джордж Дройд");
        for (Book book : droidBooks) {
            book.describe();
        }

        System.out.println("\nНепрочитанные книги:");
        List<Book> unreadBooks = library.getUnreadBooks();
        for (Book book : unreadBooks) {
            book.describe();
        }
    }
}
