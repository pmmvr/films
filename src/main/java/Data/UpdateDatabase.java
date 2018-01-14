package Data;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by pietervanroij on 23/12/2017.
 */
public class UpdateDatabase {


    public static void update(Connection connect, Film f, String title, int year) {
        Statement stmt = null;

        String query = "UPDATE movies \n" +
                "        SET title ='" + f.getTitle().replaceAll("'","''") + "', \n" +
                "        country = '" + f.getCountry().replaceAll("'","''") + "', \n" +
                "        year = " + f.getYear() + ", \n" +
                "        plot = '" + f.getPlot().replaceAll("'","''") + "', \n" +
                "        director = '" + f.getDirector().replaceAll("'","''") + "', \n" +
                "        actors = '" + f.getActors().replaceAll("'","''") + "', \n" +
                "        rating = " + f.getImdbRating() + ", \n" +
                "        poster = '" + f.getPoster().replaceAll("'","''") + "', \n" +
                "        genre = '" + f.getGenre().replaceAll("'","''") + "'" +
                "        WHERE title ='" + title + "'" +
                "        AND year = " + year;

        try {
            stmt = connect.createStatement();
            stmt.executeUpdate(query);


        } catch (SQLException e) {
            e.getMessage();
            e.printStackTrace();
        }
        System.out.println("Record updated succesfully for film titled: " + f.getTitle());

    }
}


