package AccesoADatos;

import Entidades.DetalleDeCompras;
import static Vistas.mainMenu.mensaje;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DetalleData {
    private Connection con = null;
    
    public DetalleData(){
        con = Conexion.getConexion();
    }
    
    public void insertarDetalle(DetalleDeCompras deta){
        
        String sql ="INSERT INTO detallecompra (cantidad, precioCosto, idCompra, idProducto, estado) VALUES (?,?,?,?,?);";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, deta.getCantidad());
            ps.setDouble(2, deta.getPrecioCosto());
            ps.setInt(3, deta.getCompra().getIdCompra());
            ps.setInt(4, deta.getProducto().getIdProducto());
            ps.setBoolean(5, true);
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                deta.setIdDetalle(rs.getInt(1));
                System.out.println("Se generó el detalle: "+deta.getIdDetalle()+".");
            }
            
            ps.close();
        }catch(SQLException ex){
            mensaje("Error al acceder a la base de datos. ");
            System.out.println(ex.getMessage());
        }
    }
}
