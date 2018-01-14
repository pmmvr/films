package Data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by pietervanroij on 15/12/2017.
 */
public class GetResultSet {
    private static ResultSet rs;
    static String query = "select * from movies order by YEAR, TITLE ";



    public static ResultSet  getResultSet(Connection connect){
        Statement stmnt = null;
        try {
            stmnt = connect.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = stmnt.executeQuery(query);
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }
        return rs;
    }


    }



