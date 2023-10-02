package AccesoADatos;

import java.sql.Connection;

public class ComprasData {
    private Connection con = null;
    
    public ComprasData(){
        con = Conexion.getConexion();
    }
}
