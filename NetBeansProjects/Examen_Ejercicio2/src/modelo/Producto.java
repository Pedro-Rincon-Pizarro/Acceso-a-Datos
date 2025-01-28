package modelo;

/**
 *
 * @author unai.esggir
 */
public class Producto {
    
    private int codProducto;
    private String producto;
    private double precio;
    boolean accion;

    public Producto() {
    }

    public Producto(int codProducto, String producto, double precio, boolean accion) {
        this.codProducto = codProducto;
        this.producto = producto;
        this.precio = precio;
        this.accion = accion;
    }

    public int getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isAccion() {
        return accion;
    }

    public void setAccion(boolean accion) {
        this.accion = accion;
    }

    @Override
    public String toString() {
        return "Producto{" + "codProducto=" + codProducto + ", producto=" + producto + ", precio=" + precio + '}';
    }
}
