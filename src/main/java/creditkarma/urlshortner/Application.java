package creditkarma.urlshortner;

import creditkarma.urlshortner.service.GoogleService;
import creditkarma.urlshortner.service.object.BitMapService;
import creditkarma.urlshortner.service.object.Service;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by ritesh on 3/20/17.
 */
public class Application {

    public static void main(String args[]) {

        try {
            System.out.println(apply(new URL("http://nttimes.com/2012/08/more/shopping.html?r=1hb"),Service.GOOGLE));
        } catch (MalformedURLException e) {
            System.out.println(e.getStackTrace());
        }

    }

    public static URL apply(final URL url, final Service service) {
        switch (service) {

            case GOOGLE:
                return new GoogleService().apply(url);
            case BIT:
                return new BitMapService().apply(url);
            default:
                throw new IllegalArgumentException("Invalid Choice");
        }
    }
}
