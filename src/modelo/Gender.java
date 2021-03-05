
package modelo;

import control.ConnectDBAnimalsZoo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class Gender {
    
    public String Perro, Gato, Caballo, Ganado;
    

//     public HashMap<String, String> ejecutarSQLSelect(String sql) {
//       
//        ResultSet rs;
//        String idSpecies;
//        String Type;
//        
//
//        ConnectDBAnimalsZoo objc = new ConnectDBAnimalsZoo();
//        HashMap<String, String> ma=new HashMap<>();
//        
//        try {
//            if (objc.crearConexion()) {
//                Statement sentencia = objc.getConexion().createStatement();
//                rs = sentencia.executeQuery(sql);
//                while (rs.next()) {
//                    idSpecies = rs.getNString("idProfesor");
//                    
//                    //nom = rs.getNString("nombreP1");
//                    //ape= rs.getNString("apellidoP1");
//                    nombrec= rs.getNString("nombre Profesor");
//                    ma.put(idSpecies, nombrec);
//                }
//            }
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//            return null;
//        }
//
//        return ma;
//        
//    }

    public Gender() {
    }

    public Gender(String Perro, String Gato, String Caballo, String Ganado) {
        this.Perro = Perro;
        this.Gato = Gato;
        this.Caballo = Caballo;
        this.Ganado = Ganado;
    }
    

    public String getPerro() {
        return Perro;
    }

    public void setPerro(String Perro) {
        this.Perro = Perro;
    }

    public String getGato() {
        return Gato;
    }

    public void setGato(String Gato) {
        this.Gato = Gato;
    }

    public String getCaballo() {
        return Caballo;
    }

    public void setCaballo(String Caballo) {
        this.Caballo = Caballo;
    }

    public String getGanado() {
        return Ganado;
    }

    public void setGanado(String Ganado) {
        this.Ganado = Ganado;
    }

    @Override
    public String toString() {
        return "Genero" + " Perro: " + Perro + " Gato: " + Gato + " Caballo: " + Caballo + " Ganado: " + Ganado;
    }
    
    
}
