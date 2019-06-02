package services.impl;

import accessJDBC.AccesoJDBC;
import modelos.Pais;
import services.PaisService;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PaisServiceImpl implements PaisService {

    private static final String QUERY_PAISES = "SELECT country_id,country FROM country;";

    @Override
    public ArrayList<Pais> get_all_countries() {
        Connection conn = AccesoJDBC.getConnection();

        if (conn != null) {
            try {
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(QUERY_PAISES);

                ArrayList<Pais> retorno = new ArrayList<>();

                while (rs.next()) {
                    Pais nuevo = new Pais();

                    nuevo.setCountry_id(rs.getInt(1));
                    nuevo.setCountry(rs.getString(2));

                    retorno.add(nuevo);
                }

                stmt.close();
                rs.close();
                conn.close();

                return retorno;

            } catch (SQLException ex) {
                Logger.getLogger(PaisServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return null;
    }
}

