package AccesoADatos;

import Entidades.DetalleDeCompras;
import static Vistas.mainMenu.mensaje;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DetalleData {
    private Connection con = null;
    private ComprasData compD = new ComprasData();
    private ProductosData prodD = new ProductosData();
    
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
    
    public List consultarPorIdProd(int id){
        List<DetalleDeCompras> listaDeta = new ArrayList<>();
        
        String sql="SELECT * FROM detallecompra WHERE idProducto = ?";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                DetalleDeCompras deta = new DetalleDeCompras();
                deta.setIdDetalle(rs.getInt(1));
                deta.setCantidad(rs.getInt(2));
                deta.setPrecioCosto(rs.getDouble(3));
                deta.setCompra(compD.buscarPorId(rs.getInt(4)));
                deta.setProducto(prodD.buscarPorId(rs.getInt(5)));
                deta.setEstado(rs.getBoolean(6));
                
                listaDeta.add(deta);
            }
            
            ps.close();
        }catch(SQLException ex){
            mensaje("Error al acceder a la base de datos. ");
            System.out.println(ex.getMessage());
        }
        return listaDeta;
    }
    public List BusquedaPorIdComp(int id){
        List <DetalleDeCompras> listaDeta = new ArrayList<>();
        
        String sql = "SELECT * FROM detallecompra WHERE idCompra = ? ";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                DetalleDeCompras deta = new DetalleDeCompras();
                deta.setIdDetalle(rs.getInt(1));
                deta.setCantidad(rs.getInt(2));
                deta.setPrecioCosto(rs.getDouble(3));
                deta.setCompra(compD.buscarPorId(rs.getInt(4)));
                deta.setProducto(prodD.buscarPorId(rs.getInt(5)));
                deta.setEstado(rs.getBoolean(6));
                
                listaDeta.add(deta);
            }
            
            ps.close();
        }catch(SQLException ex){
            mensaje("Error al acceder a la base de datos. ");
            System.out.println(ex.getMessage());
        }
        
        return listaDeta;
    }
    
    public List ultimaCompra(){
        List<DetalleDeCompras> ultimaComp = new ArrayList<>();
        
        String sqlC = "SELECT MAX(idCompra) FROM compra";
        int idCompra=0;
        try{
            PreparedStatement ps = con.prepareStatement(sqlC, Statement.RETURN_GENERATED_KEYS);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                idCompra = rs.getInt(1);
            }
            
            ultimaComp = BusquedaPorIdComp(idCompra);
        }catch(SQLException ex){
            mensaje("Error al acceder a la base de datos. ");
            System.out.println(ex.getMessage());
        }
        return ultimaComp;
    }
}
