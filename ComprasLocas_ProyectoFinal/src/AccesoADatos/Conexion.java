package AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    private static final String URL="jdbc:mariadb://localhost/";
    private static final String DB="sistema_compras";
    private static final String USER="root";
    private static final String PASSWORD="";
    
    
    private static Connection con;
    
    private Conexion(){
    
    }

    public static Connection getConexion(){
        
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            con = DriverManager.getConnection(URL+DB,USER,PASSWORD);     
        }catch (ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Error Driver");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error conexion BD");
        }
        return con;    
    }
}
