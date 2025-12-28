package hospital;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static final String URL =
        "jdbc:mysql://localhost:3306/hospitaldb";
    private static final String USER = "root";
    private static final String PASS = "";          // Update DB credentials in this file before running


    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USER, PASS);
    }
}
