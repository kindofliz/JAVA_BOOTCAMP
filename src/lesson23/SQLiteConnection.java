package lesson23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteConnection {

    final String JDBC_CONNECTION = "jdbc:sqlite:spaceships.db";
    Connection connection = null;

    //CONSTRUCTOR THAT CREATES A CONNECTION TO THE DATABASE
    public SQLiteConnection() throws SQLException {
        connection = DriverManager.getConnection(JDBC_CONNECTION);
    }



}
