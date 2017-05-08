package OOP.bookmyshow.objects;

import OOP.bookmyshow.assistant.MovieHelper;

import java.util.*;

/**
 * Created by ritesh on 4/25/17.
 */
public class Movies implements UserCommand {

    Map<City,List<MovieCurrentlyRunning>> moviesMap;

    public Movies() {

        moviesMap = new HashMap<>();

    }

    public Collection<MovieCurrentlyRunning> getMoviesByCity(final City city) {

        final List<MovieCurrentlyRunning> movieCurrentlyRunnings = MovieHelper.retrieveMoviesByCity(city);

        populateMoviesMap(movieCurrentlyRunnings, city);

        return moviesMap.get(city);
    }

    private void populateMoviesMap(final List<MovieCurrentlyRunning> movieCurrentlyRunning, final City city) {

        moviesMap.put(city,movieCurrentlyRunning);
    }
}
