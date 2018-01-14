package Data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

/**
 * Created by pietervanroij on 23/12/2017.
 */
public class GetOMDBData {

    public static Film getData(String title, int year) throws Exception {
        int tries = 5;
        Reader reader = null;
        for (int i = 0; i < tries ; i++) {
            try {
                reader = new InputStreamReader(createAndEncodeUrl(title,year).openStream());
                break;
            } catch (IOException e) {
                System.out.println(e.getMessage());
                tries--;
                System.out.println("Trying again, " + tries + " tries left...");
            }
        }
        Gson gson = new GsonBuilder().create();
        Film f = gson.fromJson(reader, Film.class);
        System.out.println("Succesfully collected data for film titled: " +f.getTitle());
        return f;
    }

    private static URL createAndEncodeUrl(String title, int year) {

        URL url = null;
        try {
            title = URLEncoder.encode(title, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            System.out.print("failed: " + e.getMessage());
        }

        String makeURL = "http://www.omdbapi.com/?t=" + title + "&y=" + year + "&apikey=10cb1acf";

        try {
            url = new URL(makeURL);
        } catch (MalformedURLException e) {
            System.out.print("failed: " + e.getMessage());
        }
        return url;
    }

}
