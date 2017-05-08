package OOP.bookmyshow.objects;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ritesh on 4/25/17.
 */
public class UserPreferences {

    final Map<User,Preferences> userPreferencesMap;

    public UserPreferences() {

        userPreferencesMap = new HashMap<>();
    }


}
