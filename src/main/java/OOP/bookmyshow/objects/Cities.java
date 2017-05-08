package OOP.bookmyshow.objects;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ritesh on 4/25/17.
 */
public class Cities implements UserCommand {

    List<City> cities;

    public Cities() {

        cities = new ArrayList<>();

        // populate all cities.
    }

    public List<City> getCities() {

        // retrieve from the database and populate the list.

        cities.add(City.CALIFORNIA);

        return cities;
    }


}
