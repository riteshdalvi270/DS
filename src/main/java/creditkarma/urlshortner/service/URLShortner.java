package creditkarma.urlshortner.service;

import java.net.URL;

/**
 * Created by ritesh on 3/20/17.
 */
public interface URLShortner {

    URL apply(final URL url);
}
