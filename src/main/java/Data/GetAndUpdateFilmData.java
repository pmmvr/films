package Data;

import java.sql.Connection;
import java.sql.ResultSet;

/**
 * Created by pietervanroij on 22/12/2017.
 */
public class GetAndUpdateFilmData {
    //Connection connection = Connect.setConnection("localhost", "movies", "pieter");
    static ResultSet rs;
    Connection connect = Connect.getConnection("localhost", "movies", "pieter");

    public static void main(String[] args) throws Exception {
        GetAndUpdateFilmData gf = new GetAndUpdateFilmData();
        gf.getIt();

    }

    public void getIt() throws Exception {
        rs = GetResultSet.getResultSet(connect);
        while (rs.next()) {

            rs.next();
            Film f = GetOMDBData.getData(rs.getString("title"), rs.getInt("year"));
            UpdateDatabase.update(connect, f, rs.getString("title").replaceAll("'", "''"), rs.getInt("year"));
        }
    }
}







