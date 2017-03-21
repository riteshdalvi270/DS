package creditkarma.urlshortner.service;

import java.net.URL;

/**
 * Created by ritesh on 3/20/17.
 */
public class GoogleService implements URLShortner{

    @Override
    public URL apply(URL url) {
       return shorten(url.getPath());
    }

    private URL shorten(final String path){

        return null;
    }
}
