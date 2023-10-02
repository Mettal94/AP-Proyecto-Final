package AccesoADatos;

import java.sql.Connection;

public class ProductosData {
    private Connection con = null;
    
    public ProductosData(){
        con = Conexion.getConexion();
    }
}
