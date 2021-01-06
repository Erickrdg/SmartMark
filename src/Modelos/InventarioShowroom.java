/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author FireX
 */
public class InventarioShowroom {


private String codigosapinv;
    private String modulotipo;
    private String nombreproducto;

    public InventarioShowroom() {
    }

    public InventarioShowroom(String codigosapinv, String modulotipo, String nombreproducto) {
        this.codigosapinv = codigosapinv;
        this.modulotipo = modulotipo;
        this.nombreproducto = nombreproducto;
    }

    public String getCodigosapinv() {
        return codigosapinv;
    }

    public void setCodigosapinv(String codigosapinv) {
        this.codigosapinv = codigosapinv;
    }

    public String getModulotipo() {
        return modulotipo;
    }

    public void setModulotipo(String modulotipo) {
        this.modulotipo = modulotipo;
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }
        
    
}
