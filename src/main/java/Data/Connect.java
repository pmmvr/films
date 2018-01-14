package Data;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public  class Connect {
    static Connection connection = null;
    public Connect(String host, String db, String user) {
         loadDriver();
         setConnection(host,db,user);


    }


    public static Connection getConnection(String host, String db, String user){
        setConnection(host, db, user);
        return connection;
    }



    private static void loadDriver() {
        System.out.println("Loading PostgreSQL driver...");

        try {
            Class.forName("org.postgresql.Driver");

        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL Driver not found!");
            e.printStackTrace();
            return;
        }
        System.out.println("Loaded succesfully!");
    }

    public static Connection setConnection(String host, String db, String user) {
        try {

            connection = DriverManager.getConnection(
                    "jdbc:postgresql://"+host+"/"+db,user, null);

        } catch (SQLException e) {

            System.out.println("Unable to connect to database.");
            e.printStackTrace();

        }
        System.out.println("Connected to database '" + db + "' as user '" + user+"'" );
        return connection;

    }
}