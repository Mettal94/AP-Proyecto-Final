package Entidades;

public class DetalleDeCompras {

    private int idDetalle=-1;
    private int cantidad;
    private double precioCosto;
    private Compras compra;
    private Productos producto;

    public DetalleDeCompras() {
    }

    public DetalleDeCompras(int idDetalle, int cantidad, double precioCosto, Compras compra, Productos producto) {
        this.idDetalle = idDetalle;
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
        this.compra = compra;
        this.producto = producto;
    }

    public DetalleDeCompras(int cantidad, double precioCosto, Compras compra, Productos producto) {
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
        this.compra = compra;
        this.producto = producto;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public Compras getCompra() {
        return compra;
    }

    public void setCompra(Compras compra) {
        this.compra = compra;
    }

    public Productos getProducto() {
        return producto;
    }

    public void setProducto(Productos producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "DetalleDeCompras{" + "idDetalle=" + idDetalle + '}';
    }
    
    
}
