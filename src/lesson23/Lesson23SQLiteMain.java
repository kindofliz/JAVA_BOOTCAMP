package lesson23;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


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

        } catch (SQLException e) {
            System.out.println("There was a SQL exception " + e);
        }
    }
}
