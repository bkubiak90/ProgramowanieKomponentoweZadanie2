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
        return "Movie { " +
                super.toString() +
                ", director='" + director + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", runningTime='" + runningTime + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Media m = (Media) o;
        if (m.getClass() == this.getClass()) {
            Movie movie = (Movie) o;
            return this.toString().compareToIgnoreCase(movie.toString());
        }
        return -1;
    }
}
