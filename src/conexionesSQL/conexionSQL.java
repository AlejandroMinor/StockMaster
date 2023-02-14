/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionesSQL;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Aleja
 */
public class conexionSQL {
    
    
    Connection conectar = null;
    
    public Connection conexion() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/seguricam", "Minor", "732322");

        } catch (Exception e) {
            System.out.println("Error " + e);
        }
        return conectar;
    }

    
}
