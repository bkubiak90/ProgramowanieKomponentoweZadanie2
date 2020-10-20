package SortObjects;

import MediaObjects.Book;
import MediaObjects.Media;
import MediaObjects.Movie;

import java.util.Comparator;

public class SortlByLenght implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Media m1 = (Media) o1;
        Media m2 = (Media) o2;

        if (m1.getClass() == Book.class) {
            Book b1 = (Book) o1;
            if (m2.getClass() == Book.class) {
                Book b2 = (Book) o2;
                return b1.getPages().compareToIgnoreCase(b2.getPages());
            } else if (m2.getClass() == Movie.class) {
                return 1;
            }
        } else if (m1.getClass() == Movie.class) {
            Movie mv1 = (Movie) o1;
            if (m2.getClass() == Book.class) {
                return -1;
            } else if (m2.getClass() == Movie.class) {
                Movie mv2 = (Movie) o2;
                return mv1.getRunningTime().compareToIgnoreCase(mv2.getRunningTime());
            }
        }
        return 0;
    }
}
