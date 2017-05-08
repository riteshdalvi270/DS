package OOP.bookmyshow.objects;

/**
 * Created by ritesh on 4/25/17.
 */
public class MovieCurrentlyRunning {

    String movieName;
    String genere;
    City city;

    public MovieCurrentlyRunning(String movieName, String genre) {
        this.movieName = movieName;
        this.genere = genre;
    }

    public boolean isPlayinginCity(final City city) {

        return this.city == city;
    }
}
