package OOP.bookmyshow.objects;

/**
 * Created by ritesh on 4/25/17.
 */
public class User {

    String firstName;
    String lastName;
    String username;

    UserPreferences userPreferences;

    public User(final UserPreferences userPreferences) {
        this.userPreferences = userPreferences;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }
}
