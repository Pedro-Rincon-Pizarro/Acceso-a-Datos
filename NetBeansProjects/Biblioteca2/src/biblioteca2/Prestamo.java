/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca2;

import java.util.Date;

/**
 *
 * @author Pedro
 */
public class Prestamo 
{
    private int id, idLib, idUsu;
    private Date fecha;

    public Prestamo(int id, int idLib, int idUsu, Date fecha) {
        this.id = id;
        this.idLib = idLib;
        this.idUsu = idUsu;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdLib() {
        return idLib;
    }

    public void setIdLib(int idLib) {
        this.idLib = idLib;
    }

    public int getIdUsu() {
        return idUsu;
    }

    public void setIdUsu(int idUsu) {
        this.idUsu = idUsu;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    

    
    
    
}