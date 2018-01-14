package Data;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by pietervanroij on 24/12/2017.
 */
public class FilmMapper{

    private static Film f = new Film();

    public static Film FilmMapper(ResultSet rs) {
        try {
            f.setTitle(rs.getString(("TITLE")));
            f.setYear(rs.getInt("YEAR"));
            f.setDirector(rs.getString("DIRECTOR"));
            f.setCountry(rs.getString("COUNTRY"));
            f.setActors(rs.getString("ACTORS"));
            f.setGenre(rs.getString("GENRE"));
            f.setImdbRating(rs.getDouble("RATING"));
            f.setPlot(rs.getString("PLOT"));
            f.setPoster(rs.getString("POSTER"));

        }catch (SQLException e) {
            e.getMessage();
        }

        return f;
    }



}
