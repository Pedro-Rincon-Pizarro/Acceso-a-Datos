/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sucursal;

/**
 *
 * @author pedro.rinpiz
 */
public class Ventas 
{
    Comprador comprador;
    String fecha;
    double precioVenta;
    

    public Ventas(Comprador comprador, String fecha, double precioVenta) 
    {
        this.comprador = comprador;
        this.fecha = fecha;
        this.precioVenta = precioVenta;
        
    }

    public Comprador getComprador() 
    {
        return comprador;
    }

    public void setComprador(Comprador comprador) 
    {
        this.comprador = comprador;
    }

    public String getFecha() 
    {
        return fecha;
    }

    public void setFecha(String fecha) 
    {
        this.fecha = fecha;
    }

    public double getPrecioVenta() 
    {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) 
    {
        this.precioVenta = precioVenta;
    }

   

    @Override
    public String toString() {
        return "Ventas{" + "comprador=" + comprador + ", fecha=" + fecha + ", precioVenta=" + precioVenta + '}';
    }
    
    
    
}
