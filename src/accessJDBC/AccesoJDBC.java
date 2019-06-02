package accessJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class AccesoJDBC {

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB = "sakila";
    static final String DB_URL = "jdbc:mysql://localhost/" + DB;

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "root";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            //STEP 2: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");

            Properties p = new Properties();
            p.put("serverTimezone", "UTC");
            p.put("useSSL", "false");
            p.put("user", USER);
            p.put("password", PASS);

            conn = DriverManager.getConnection(DB_URL, p);

        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        }

        return conn;
    }

}
