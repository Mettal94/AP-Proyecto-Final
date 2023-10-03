package Entidades;

public class Productos {

    private int idProducto=-1;
    private String nombre;
    private String descripcion;
    private String rubro;
    private double precioActual;
    private int stock;
    private boolean estado;

    public Productos() {
    }

    public Productos(String nombre, String descripcion, String rubro, double precioActual, int stock, boolean estado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.rubro = rubro;
        this.precioActual = precioActual;
        this.stock = stock;
        this.estado = estado;
    }

    public Productos(int idProducto, String nombre, String descripcion,String rubro, double precioActual, int stock, boolean estado) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.rubro = rubro;
        this.precioActual = precioActual;
        this.stock = stock;
        this.estado = estado;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }
    
    public double getPrecioActual() {
        return precioActual;
    }

    public void setPrecioActual(double precioActual) {
        this.precioActual = precioActual;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
    
    
}
