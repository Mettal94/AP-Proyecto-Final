package AccesoADatos;

import Entidades.Productos;
import static Vistas.mainMenu.mensaje;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.mariadb.jdbc.Statement;

public class ProductosData {
    private Connection con = null;
    
    public ProductosData(){
        con = Conexion.getConexion();
    }
    
    public void agregarProducto(Productos prod){
        
        String sql = "INSERT INTO producto (nombre, descripcion, rubro, precioActual, stock, estado)"
                + "VALUES (?,?,?,?,?,?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, prod.getNombre());
            ps.setString(2, prod.getDescripcion());
            ps.setString(3, prod.getRubro());
            ps.setDouble(4, prod.getPrecioActual());
            ps.setInt(5, prod.getStock());
            ps.setBoolean(6, true);
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                prod.setIdProducto(rs.getInt(1));
                
                mensaje("Se añadió el producto exitosamente");
            }
            ps.close();
        }catch(SQLException ex){
            mensaje("Error al acceder a la base de datos. ");
            System.out.println(ex.getMessage());
        }
    }
    
    public void modificarProducto(Productos prod){
        
        String sql = "UPDATE producto SET nombre = ?, descripcion = ?, rubro = ?, precioActual = ?, stock = ?, estado = ? "
                + "WHERE idProducto = ?";
        
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, prod.getNombre());
            ps.setString(2, prod.getDescripcion());
            ps.setString(3, prod.getRubro());
            ps.setDouble(4, prod.getPrecioActual());
            ps.setInt(5, prod.getStock());
            ps.setBoolean(6, prod.isEstado());
            ps.setInt(7, prod.getIdProducto());
            
            int exito = ps.executeUpdate();
            
            if(exito == 1){
                mensaje("El producto se modificó exitosamente");
            }else{
                mensaje("Producto no encontrado");
            }
            ps.close();
        }catch(SQLException ex){
            mensaje("Error al acceder a la base de datos. ");
            System.out.println(ex.getMessage());
        }
    }
    
    public List<Productos> listarProductos(int estado){
        List<Productos> listaPro = new ArrayList<>();
        
        String sql ="SELECT * FROM producto WHERE estado = ?";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, estado);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Productos prod = new Productos();
                prod.setIdProducto(rs.getInt(1));
                prod.setNombre(rs.getString(2));
                prod.setDescripcion(rs.getString(3));
                prod.setRubro(rs.getString(4));
                prod.setPrecioActual(rs.getDouble(5));
                prod.setStock(rs.getInt(6));
                prod.setEstado(rs.getInt("estado")== 1);
//                if(estado == 1){
//                    prod.setEstado(true);
//                }else{
//                    prod.setEstado(false);
//                }
//                
                listaPro.add(prod);
            }
            
            ps.close();
        }catch(SQLException ex){
            mensaje("Error al acceder a la base de datos. ");
            System.out.println(ex.getMessage());
        }
        return listaPro;
    }
    
    public void altaBajaProducto(int id, int estado){
        
        String sql = "UPDATE producto SET estado = ? WHERE idProducto = ?";
        
        try{
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, estado);
            ps.setInt(2, id);
            
            int fila = ps.executeUpdate();
            
            if(fila == 1){
                mensaje("Modificación exitosa");
            }else{
                mensaje("Hubo un error.");
            }
            
            ps.close();
        }catch(SQLException ex){
            mensaje("Error al acceder a la base de datos. ");
            System.out.println(ex.getMessage());
        }
    }
    
     public void modificarStock(int id, int cantidad){
        
        String sql = "UPDATE producto SET stock = ? WHERE idProducto = ?";
        
        try{
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cantidad);
            ps.setInt(2, id);
            
            int fila = ps.executeUpdate();
            
            if(fila == 1){
                System.out.println("Stock actualizado");
            }else{
                System.out.println("Hubo un error");
            }
            
            ps.close();
        }catch(SQLException ex){
            mensaje("Error al acceder a la base de datos. ");
            System.out.println(ex.getMessage());
        }
    }
     
     public Productos buscarPorId(int id){
         Productos prod = new Productos();
         
         String sql = "SELECT * FROM producto WHERE idProducto = ?";
         
         try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                prod.setIdProducto(rs.getInt(1));
                prod.setNombre(rs.getString(2));
                prod.setDescripcion(rs.getString(3));
                prod.setRubro(rs.getString(4));
                prod.setPrecioActual(rs.getDouble(5));
                prod.setStock(rs.getInt(6));
                prod.setEstado(rs.getInt("estado")== 1);
            }
            
            ps.close();
         }catch(SQLException ex){
            mensaje("Error al acceder a la base de datos. ");
            System.out.println(ex.getMessage());
        }
         return prod;
     }
     
      public List<Productos> listarStockFaltante(){
        List<Productos> listFaltante = new ArrayList<>();
        
        String sql = " SELECT `idProducto`, `nombre`, `descripcion`, `precioActual`, `stock` FROM `producto` WHERE stock <= 10 ORDER BY stock " ;
        
        try{
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Productos prod = new Productos();
                prod.setIdProducto(rs.getInt(1));
                prod.setNombre(rs.getString(2));
                prod.setDescripcion(rs.getString(3));
                prod.setPrecioActual(rs.getDouble(4));
                prod.setStock(rs.getInt(5));

                listFaltante.add(prod);
            }
            
            ps.close();
        }catch(SQLException ex){
            mensaje("Error al acceder a la base de datos. ");
            System.out.println(ex.getMessage());
        }
        return listFaltante;
    }
}
