
package modelo;
import control.ConnectDBAnimalsZoo;
import java.sql.SQLException;
import java.sql.Statement;

public class User {
    private int idUser;
    private String NombreU, NombreU2, ApellidoU, ApellidoU2;
    private String BirthDay, email, PhoneNumber;

    public User() {
    }

    public User(String NombreU, String ApellidoU, String BirthDay, String email, String PhoneNumber) {
        this.NombreU = NombreU;
        this.ApellidoU = ApellidoU;
        this.BirthDay = BirthDay;
        this.email = email;
        this.PhoneNumber = PhoneNumber;
    }

//    public User(int idUser, String NombreU, String ApellidoU, String BirthDay, String email, String PhoneNumber) {
//        this.idUser = idUser;
//        this.NombreU = NombreU;
//        this.ApellidoU = ApellidoU;
//        this.BirthDay = BirthDay;
//        this.email = email;
//        this.PhoneNumber = PhoneNumber;
//    }

    public User(String NombreU, String NombreU2, String ApellidoU, String ApellidoU2, String BirthDay, String email, String PhoneNumber) {
        this.NombreU = NombreU;
        this.NombreU2 = NombreU2;
        this.ApellidoU = ApellidoU;
        this.ApellidoU2 = ApellidoU2;
        this.BirthDay = BirthDay;
        this.email = email;
        this.PhoneNumber = PhoneNumber;
    }
    

//    public User(int idUser, String NombreU, String NombreU2, String ApellidoU, String ApellidoU2, String BirthDay, String email, String PhoneNumber) {
//       this.idUser = idUser;
//        this.NombreU = NombreU;
//        this.NombreU2 = NombreU2;
//        this.ApellidoU = ApellidoU;
//        this.ApellidoU2 = ApellidoU2;
//        this.BirthDay = BirthDay;
//        this.email = email;
//        this.PhoneNumber = PhoneNumber;
//    }
    
    public String getidUser() {
        return NombreU;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
    
    public String getNombreU() {
        return NombreU;
    }

    public void setNombreU(String NombreU) {
        this.NombreU = NombreU;
    }

    public String getNombreU2() {
        return NombreU2;
    }

    public void setNombreU2(String NombreU2) {
        this.NombreU2 = NombreU2;
    }

    public String getApellidoU() {
        return ApellidoU;
    }

    public void setApellidoU(String ApellidoU) {
        this.ApellidoU = ApellidoU;
    }

    public String getApellidoU2() {
        return ApellidoU2;
    }

    public void setApellidoU2(String ApellidoU2) {
        this.ApellidoU2 = ApellidoU2;
    }

    public String getBirthDay() {
        return BirthDay;
    }

    public void setBirthDay(String BirthDay) {
        this.BirthDay = BirthDay;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    @Override
    public String toString() {
        return "Usuario  " + "IdUsuario:"+ idUser + " NombreU:  " + NombreU + "   NombreU2:  " + NombreU2 + "   ApellidoU:  " + ApellidoU + "  ApellidoU2:  " + ApellidoU2 + "  Birth Day:  " + BirthDay + "  Email:  " + email + "  PhoneNumber:  " + PhoneNumber;
    }
    
    public boolean insertUser(String sql) {
        ConnectDBAnimalsZoo objC = new ConnectDBAnimalsZoo();

        if (objC.crearConexion()) {
            try {
                Statement sentencia = objC.getConexion().createStatement();
                sentencia.executeUpdate(sql);
            } catch (SQLException ex) {
                ex.printStackTrace();
                return false;
            }
        }
        return true;
    }
    
}
