package accessJDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class AccesoJDBC {

    private static Connection conexion = null;

    public static Connection getInstance()
    {

        if(conexion==null)
        {
            try {
                Class.forName("com.myqsl.jdbc.Driver");
                conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","luis","");
            }catch (Exception e){
                e.getMessage();
            }
        }
        return conexion;
    }

}
