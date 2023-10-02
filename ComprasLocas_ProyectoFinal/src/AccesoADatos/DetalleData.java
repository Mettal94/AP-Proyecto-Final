package AccesoADatos;

import java.sql.Connection;

public class DetalleData {
    private Connection con = null;
    
    public DetalleData(){
        con = Conexion.getConexion();
    }
}
