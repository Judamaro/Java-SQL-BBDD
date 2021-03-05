package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ingrid.carmona
 */
public class ConnectDBAnimalsZoo {
    Connection conexion;
    Statement st;

    public ConnectDBAnimalsZoo() {
        //conexion
    }
    
     public Connection getConexion() {
        return conexion;
    }
      /**
     * Método utilizado para establecer la conexión con la base de datos
     *
     * @return estado regresa el estado de la conexión, true si se estableció la
     * conexión, falso en caso contrario
     */
    public boolean crearConexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");                                    //user  //pass
            conexion =DriverManager.getConnection("jdbc:mysql://localhost:3306/animalsZooDB", "root", "root");
            st = conexion.createStatement();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            return false;
        }

        return true;
    }
}
