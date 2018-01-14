package Data;

import java.sql.Connection;

/**
 * Created by pietervanroij on 23/12/2017.
 */
public class Runner {
    Connection connect = Connect.getConnection("localhost", "movies", "pieter");


}
