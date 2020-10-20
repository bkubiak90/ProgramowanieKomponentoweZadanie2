package MediaObjects;

public class Movie extends Media implements Comparable {

    private String director;
    private String releaseDate;
    private String runningTime;

    public Movie() {
    }

    public Movie(String title, String genre, String director, String releaseDate, String runningTime) {
        super(title, genre);
        this.director = director;
        this.releaseDate = releaseDate;
        this.runningTime = runningTime;
    }

    public Movie(Book book) {
        super();
        super.setTitle(book.getTitle());
        super.setGenre(book.getGenre());
        this.director = book.getAuthor();
        this.releaseDate = book.getPublicationDate();
        this.runningTime = book.getPages();
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(String runningTime) {
        this.runningTime = runningTime;
    }


    @Override
    public String toString() {
        return String.format("%-8sTitle: %-35sDirector: %-20sGenre: %-27sReleaseDate: %-13sRunningTime: %-10s", "Movie", getTitle(), director, getGenre(), releaseDate, runningTime);
    }

    @Override
    public int compareTo(Object o) {
        if (o.getClass() == this.getClass()) {
            Movie movie = (Movie) o;
            return this.toString().compareToIgnoreCase(movie.toString());
        }
        return -1;
    }
}
