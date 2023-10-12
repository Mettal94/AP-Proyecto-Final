package AccesoADatos;

import Entidades.Proveedor;
import static Vistas.mainMenu.mensaje;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProveedorData {
    private Connection con = null;
    
    public ProveedorData(){
        con = Conexion.getConexion();
    }
    
    public void agregarProveedor(Proveedor prov){
        
        String sql = "INSERT INTO proveedor (razonSocial, domicilio, email, telefono, estado)"
                + "VALUES (?,?,?,?,?);";
        try{
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, prov.getRazonSocial());
            ps.setString(2, prov.getDomicilio());
            ps.setString(3, prov.getEmail());
            ps.setString(4, prov.getTelefono());
            ps.setBoolean(5, true);
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                prov.setIdProveedor(rs.getInt(1));
                
                mensaje("Se añadió el proveedor exitosamente");
            }
            ps.close();
        }catch(SQLException ex){
            mensaje("Error al acceder a la tabla de proveedor");
            System.out.println(ex.getMessage());
        }
    }
    
    public void modificarProveedor(Proveedor prov){
      
        String sql = "UPDATE `proveedor` SET `razonSocial`= ? ,`domicilio`= ? ,`email`= ? ,`telefono`= ? ,`estado`= ? WHERE `idProveedor`= ? ";
        PreparedStatement ps = null;
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, prov.getRazonSocial());
            ps.setString(2, prov.getDomicilio());
            ps.setString(3, prov.getEmail());
            ps.setString(4, prov.getTelefono());
            ps.setBoolean(5, prov.isEstado());
            ps.setInt(6, prov.getIdProveedor());
            
            int exito = ps.executeUpdate();
            
            if(exito == 1){
                mensaje("El proveedor se modificó exitosamente");
            }else{
                mensaje("No existe ese proveedor en la base de datos");
            }
            ps.close();
        }catch(SQLException ex){
            mensaje("Error al acceder a la tabla de proveedor");
            System.out.println(ex.getMessage());
        }
    }
    
    public List<Proveedor> listarProveedores(int estado){
        
        List<Proveedor> listaProv = new ArrayList<>();
        
        String sql = "SELECT * FROM proveedor WHERE estado = ?";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, estado);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Proveedor prov = new Proveedor();
                prov.setIdProveedor(rs.getInt(1));
                prov.setRazonSocial(rs.getString(2));
                prov.setDomicilio(rs.getString(3));
                prov.setEmail(rs.getString(4));
                prov.setTelefono(rs.getString(5));
                prov.setEstado(rs.getInt("estado")== 1);
                
                listaProv.add(prov);
            }
            ps.close();
        }catch(SQLException ex){
            mensaje("Error al acceder a la tabla de proveedor");
            System.out.println(ex.getMessage());
        }
        return listaProv;
    }
    
    public void altaBajaProveedores(int estado, int id){
        
        String sql = "UPDATE proveedor SET estado = ? WHERE idProveedor = ?";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, estado);
            ps.setInt(2, id);
            
            int fila = ps.executeUpdate();
            if(fila == 1){
                mensaje("Modificación exitosa");
            }else{
                mensaje("Hubo un error");
            }
            ps.close();
        }catch(SQLException ex){
            mensaje("Error al acceder a la tabla de proveedor");
            System.out.println(ex.getMessage());
        }
    }
    
    public Proveedor buscarProveedorPorId(int id){
        Proveedor prov = new Proveedor();
        
        String sql = "SELECT * FROM proveedor WHERE idProveedor = ?;";
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                prov.setIdProveedor(rs.getInt(1));
                prov.setRazonSocial(rs.getString(2));
                prov.setDomicilio(rs.getString(3));
                prov.setEmail(rs.getString(4));
                prov.setTelefono(rs.getString(5));
                prov.setEstado(rs.getBoolean(6));
            }
            
            ps.close();
        }catch(SQLException ex){
            mensaje("Error al acceder a la tabla de proveedor");
            System.out.println(ex.getMessage());
        }
        return prov;
    }
}
