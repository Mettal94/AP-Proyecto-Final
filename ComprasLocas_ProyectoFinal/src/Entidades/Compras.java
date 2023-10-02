package Entidades;

import java.time.LocalDate;

public class Compras {

    private int idCompra=-1;
    private Proveedor proveedor;
    private LocalDate fecha;

    public Compras() {
    }

    
    public Compras(int idCompra,Proveedor proveedor, LocalDate fecha) {
        this.idCompra = idCompra;
        this.proveedor = proveedor;
        this.fecha = fecha;
    }

    public Compras(Proveedor proveedor, LocalDate fecha) {
        this.proveedor = proveedor;
        this.fecha = fecha;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Compras{" + "idCompra=" + idCompra + ", proveedor=" + proveedor + ", fecha=" + fecha + '}';
    }
    
    
    
}
