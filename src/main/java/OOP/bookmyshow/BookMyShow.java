package OOP.bookmyshow;

import OOP.bookmyshow.objects.*;

import java.util.Collection;
import java.util.List;

/**
 * Created by ritesh on 4/25/17.
 */
public class BookMyShow {

    public static void main(String args[]) {

        final Cities cities = new Cities();
        List<City> citiesSupported = cities.getCities();

        // user input;
        final City city = City.NEW_YORK;

        final Movies movies = new Movies();
        final Collection<MovieCurrentlyRunning> moviesByCity = movies.getMoviesByCity(city);

        // user selected movie.
        final MovieCurrentlyRunning movieCurrentlyRunning = new MovieCurrentlyRunning("Hero", "Action");

        final Theatres theatres = new Theatres();
        final List<String> theatresAvailable = theatres.retrieveTheatres(movieCurrentlyRunning);
    }
}

