package AccesoADatos;

import Entidades.Compras;
import static Vistas.mainMenu.mensaje;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ComprasData {
    private Connection con = null;
    
    public ComprasData(){
        con = Conexion.getConexion();
    }
    
    public void nuevaCompra(Compras comp){
        
        String sql = "INSERT INTO compra (idProveedor,fecha) VALUES (?,?);";
        
        try{
            
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, comp.getProveedor().getIdProveedor());
            ps.setDate(2, Date.valueOf(comp.getFecha()));
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                comp.setIdCompra(1);
                mensaje("Compra exitosa.");
            }
        }catch(SQLException ex){
            mensaje("Error al acceder a la base de datos.");
            System.out.println(ex.getMessage());
        }
    }
}
