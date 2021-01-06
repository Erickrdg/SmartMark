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
public class Producto {
    
    private String codigosappro;
    private String descripcion;
    private String tipo;
    private String fabricante;

    public Producto() {
    }

    public Producto(String codigosappro, String descripcion, String tipo, String fabricante) {
        this.codigosappro = codigosappro;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.fabricante = fabricante;
    }

    public String getCodigosappro() {
        return codigosappro;
    }

    public void setCodigosappro(String codigosappro) {
        this.codigosappro = codigosappro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
    
    
    
}
