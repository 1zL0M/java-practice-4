public class Reader {
    private String name;
    private String favoriteGenre;
    private Book lastBook;

    public Reader(String name, String favoriteGenre) {
        this.name = name;
        this.favoriteGenre = favoriteGenre;
        this.lastBook = null;
    }

    public void readBook(Book book) {
        lastBook = book;
        book.setIsRead(true);
    }

    public String getLastBookInfo() {
        if (lastBook == null) {
            return "Пока ничего не читал";
        }
        return lastBook.describe();
    }

    public String getName() {
        return name;
    }

    public String getFavoriteGenre() {
        return favoriteGenre;
    }
}
