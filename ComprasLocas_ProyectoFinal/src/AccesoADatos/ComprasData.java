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
    
    public int nuevaCompra(Compras comp){
        
        String sql = "INSERT INTO compra (idProveedor, precioTotal, fecha) VALUES (?,?,?);";
        int id = 0;
        try{
            
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, comp.getProveedor().getIdProveedor());
            ps.setDouble(2, comp.getPrecioTotal());
            ps.setDate(3, Date.valueOf(comp.getFecha()));
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                comp.setIdCompra(rs.getInt(1));
                mensaje("Compra exitosa.");
            }
            id = comp.getIdCompra();
            ps.close();
        }catch(SQLException ex){
            mensaje("Error al acceder a la base de datos.");
            System.out.println(ex.getMessage());
        }
        return id;
    }
}
