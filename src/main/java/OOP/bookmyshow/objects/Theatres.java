package OOP.bookmyshow.objects;

import OOP.bookmyshow.assistant.TheatreHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ritesh on 4/26/17.
 */
public class Theatres {

    List<String> theatres;

    public Theatres() {
        theatres = new ArrayList<>();
    }

    public List<String> retrieveTheatres(final MovieCurrentlyRunning movieCurrentlyRunning) {

        // retrieve from the databse using movie selected.

        return TheatreHelper.theatresByMovie(movieCurrentlyRunning);
    }
}
