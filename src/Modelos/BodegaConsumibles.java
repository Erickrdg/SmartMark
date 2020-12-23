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
public class BodegaConsumibles {
    
    private String codigosapbod;
    private String fabricante;
    private String tipo;
    private String descripcion;

    public BodegaConsumibles() {
    }

    public BodegaConsumibles(String codigosapbod, String fabricante, String tipo, String descripcion) {
        this.codigosapbod = codigosapbod;
        this.fabricante = fabricante;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public String getCodigosapbod() {
        return codigosapbod;
    }

    public void setCodigosapbod(String codigosapbod) {
        this.codigosapbod = codigosapbod;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
