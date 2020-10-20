package Main;

import MediaObjects.Book;
import MediaObjects.Media;
import MediaObjects.Movie;
import SortObjects.*;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Media[] medias = new Media[10];
        init(medias);
        int index = 6;

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        do {
            System.out.println(
                            "\n" +
                            "1.Add \n" +
                            "2.Print \n" +
                            "3.Sort \n" +
                            "4.Quit"
            );

            switch (scanner.nextInt()) {
                case 1:
                    System.out.println(
                                    "\n" +
                                    "1.Movie \n" +
                                    "2.Book"
                    );
                    int choice = scanner.nextInt();

                    if (index < medias.length) {
                        if (choice == 1) {
                            scanner.nextLine();
                            System.out.print("Title: ");
                            String title = scanner.nextLine();
                            System.out.print("Director: ");
                            String director = scanner.nextLine();
                            System.out.print("Genre: ");
                            String genre = scanner.nextLine();
                            System.out.print("Running Time: ");
                            String length = scanner.nextLine();
                            System.out.print("Release Date: ");
                            String releaseDate = scanner.nextLine();
                            medias[index] = new Movie(title, genre, director,releaseDate, length);
                        } else if (choice == 2) {
                            scanner.nextLine();
                            System.out.print("Title: ");
                            String title = scanner.nextLine();
                            System.out.print("Author: ");
                            String author = scanner.nextLine();
                            System.out.print("Genre: ");
                            String genre = scanner.nextLine();
                            System.out.print("Pages: ");
                            String pages = scanner.nextLine();
                            System.out.print("Publication Date: ");
                            String publicationDate = scanner.nextLine();
                            medias[index] = new Book(title, genre, author, publicationDate, pages);
                        }
                        break;
                    }
                case 2:
                    for (Media m : medias) {
                        if (null != m) {
                            System.out.println(m.toString());
                        }
                    }
                    break;
                case 3:
                    System.out.println(
                                "1.byTitle \n" +
                                "2.byGenre \n" +
                                "3.byAuthor \n" +
                                "4.byReleaseDate \n" +
                                "5.byLength"
                    );

                    choice = scanner.nextInt();
                    scanner.nextLine();

                    if (choice == 1) {
                        Arrays.sort(medias, new SortByTitle());
                    } else if (choice == 2) {
                        Arrays.sort(medias, new SortByGenre());
                    } else if (choice == 3) {
                        Arrays.sort(medias, new SortByAuthor());
                    } else if (choice == 4) {
                        Arrays.sort(medias, new SortByRealeaseDate());
                    } else if (choice == 5) {
                        Arrays.sort(medias, new SortlByLenght());
                    }
                    break;
                case 4:
                    quit = true;
                    break;
                default:
                    System.out.println("Wrong choice, pick other");
                    break;
            }


        } while (!quit);
    }

    public static void init(Media[] o) {
        Media[] m = (Media[]) o;
        if (null == m) {
            m = new Media[10];
        }

        m[0] = new Book("The Unknown Kimi Raikkonen", "Biography", "Kari Hotakainen", "2018", "336");
        m[1] = new Book("The Green Mile", "Novel", "Stephen King", "1996", "416");
        m[2] = new Book("The Alchemist", "Novel", "Paulo Coelho", "1988", "163");
        m[3] = new Movie("Star Wars: Return of the Jedi", "Science fiction", "Richard Marquand", "1983", "132");
        m[4] = new Movie("Green Book", "Biographical comedy-drama", "Peter Farrelly", "2018", "130");
        m[5] = new Movie("The Hobbit: An Unexpected Journey", "Fantasy", "Peter Jackson", "2012", "169");
    }
}
