package lesson23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    final String JDBC_CONNECTION = "";
    final String JDBC_USERNAME = "username";
    final String JDBC_PASSWORD = "qwerty";
    Connection connection = null;

    //CONSTRUCTOR THAT CREATES A CONNECTION TO THE DATABASE
    public DBConnection() throws SQLException {
        connection = DriverManager.getConnection(JDBC_CONNECTION, JDBC_USERNAME, JDBC_PASSWORD);
    }



}
