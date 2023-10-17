package AccesoADatos;

import Entidades.Compras;
import static Vistas.mainMenu.mensaje;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ComprasData {
    private Connection con = null;
    private ProveedorData provD = new ProveedorData();
    
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
    
    public List comprasPorProveedor(int id){
        List<Compras> listaComp = new ArrayList<>();
        
        String sql = "SELECT * FROM compra WHERE idProveedor = ?";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Compras comp = new Compras();
                comp.setIdCompra(rs.getInt(1));
                comp.setProveedor(provD.buscarProveedorPorId(rs.getInt(2)));
                comp.setPrecioTotal(rs.getDouble(3));
                comp.setFecha(rs.getDate(4).toLocalDate());
                
                listaComp.add(comp);
            }
            
            ps.close();
        }catch(SQLException ex){
            mensaje("Error al acceder a la base de datos. ");
            System.out.println(ex.getMessage());
        }
        return listaComp;
    }
    
    public Compras buscarPorId(int id){
        Compras comp = new Compras();
        String sql="SELECT * FROM compra WHERE idCompra = ?";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                comp.setIdCompra(rs.getInt(1));
                comp.setProveedor(provD.buscarProveedorPorId(rs.getInt(2)));
                comp.setPrecioTotal(rs.getDouble(3));
                comp.setFecha(rs.getDate(4).toLocalDate());
            }
            
            ps.close();
        }catch(SQLException ex){
            mensaje("Error al acceder a la base de datos. ");
            System.out.println(ex.getMessage());
        }
        return comp;
    }
    public List BusquedaPorFecha (LocalDate fecha1, LocalDate fecha2){
        List <Compras> listaCompra = new ArrayList<>();
        //producto, precio, fecha, cantidad
        
        String sql = "SELECT * FROM compra WHERE fecha BETWEEN ? AND ? ORDER BY fecha ";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDate(1, Date.valueOf(fecha1) );
            ps.setDate(2, Date.valueOf(fecha2));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Compras comp = new Compras();
                comp.setIdCompra(rs.getInt(1));
                comp.setProveedor(provD.buscarProveedorPorId(rs.getInt(2)));
                comp.setPrecioTotal(rs.getDouble(3));
                comp.setFecha(rs.getDate(4).toLocalDate());
                listaCompra.add(comp);
            }
            ps.close();
            
        }catch(SQLException ex){
            mensaje("Error al acceder a la base de datos. ");
            System.out.println(ex.getMessage());
        }
        
        
        
        return listaCompra;
    }
}
