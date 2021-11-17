package lesson23;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Lesson23SQLiteMain {
    public static void main(String[] args) {

        try {
            //SQLITE EXAMPLE
            SQLiteConnection sqlconn = new SQLiteConnection();
            Statement statement2 = sqlconn.connection.createStatement();

            String query = "SELECT * FROM spaceships";
            ResultSet rs = statement2.executeQuery(query);

            while (rs.next()) {
                System.out.println("SQLITE: " + rs.getString("name"));
            }

            //INSERT EXAMPLE
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter spaceship name: ");
            String name = scanner.nextLine();

            //!!!!
            //INSTEAD OF REGULAR STATEMENT YOU SHOULD ALWAYS USE PreparedStatement
            String preparedQuery = "INSERT INTO spaceships (type, active, name) VALUES ('regular', 1, ? )";
            PreparedStatement preparedStatement = sqlconn.connection.prepareStatement(preparedQuery);

            preparedStatement.setString(1, name);

            preparedStatement.execute();
            //!!!!

        } catch (SQLException e) {
            System.out.println("There was a SQL exception " + e);
        }



    }
}
