/**
 * @author Ingrid Carmona Diaz - 2150147
 * Perdiodo 2019 - 03
 */
package control;

import java.util.LinkedList;
import modelo.User;


public class ControllerUser {

    public ControllerUser() {
    }
    
    public boolean insertarUsuario(LinkedList<User> ListaUsuario) {
        boolean t = false;
        String sql = "";
        User objUsu= new User();
        for (int i = 0; i < ListaUsuario.size(); i++) {
            
            sql = "insert into usuarios values(?,?,?,?,?,?,?,?,?,?);";
            t = objUsu.insertUser(sql);
            
        }
        
        
        return t;
        
        
    }
    
}
