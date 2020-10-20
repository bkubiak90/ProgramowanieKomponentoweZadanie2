package MediaObjects;

public class Book extends Media implements Comparable {

    private String author;
    private String publicationDate;
    private String pages;

    public Book() {
    }

    public Book(String title, String genre, String author, String publicationDate, String pages) {
        super(title, genre);
        this.author = author;
        this.pages = pages;
        this.publicationDate = publicationDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }


    @Override
    public String toString() {
        return "Book { " +
                super.toString() +
                ", author='" + author + '\'' +
                ", publicationDate='" + publicationDate + '\'' +
                ", pages='" + pages + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {

        return 0;
    }
}
