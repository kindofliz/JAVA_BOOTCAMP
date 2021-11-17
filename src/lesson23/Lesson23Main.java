package lesson23;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Lesson23Main {
    public static void main(String[] args) {

        try {
            DBConnection db = new DBConnection();

            Statement statement = db.connection.createStatement();

            //SELECT example
            //Create a query to the database in string
            String query = "SELECT * from spaceships";

            //Executing the query
            ResultSet rs = statement.executeQuery(query);

            //Looping through the result-set and doing some action with (printing) every line
            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }

            //INSERT EXAMPLE
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter spaceship name: ");
            String name = scanner.nextLine();

            query = "INSERT INTO spaceships( name, type, active) VALUES ('" + name + "', 'regular', 1)";

            statement.execute(query);



            //SQLITE EXAMPLE
            SQLiteConnection sqlconn = new SQLiteConnection();
            Statement statement2 = sqlconn.connection.createStatement();

            statement2.execute(query);

            query = "SELECT * FROM spaceships";
            rs = statement2.executeQuery(query);

            while (rs.next()) {
                System.out.println("SQLITE: " + rs.getString("name"));
            }


        } catch (SQLException e) {
            System.out.println("There was a SQL exception " + e);
        }
    }
}
