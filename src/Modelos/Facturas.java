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
public class Facturas {
    
    private String numerodefactura;
    private String codigocliente;
    private String nombrecliente;
    private String codigovendedor;
    private String fechacompra;
    private String codigosap;

    public Facturas() {
    }

    public Facturas(String numerodefactura, String codigocliente, String nombrecliente, String codigovendedor, String fechacompra, String codigosap) {
        this.numerodefactura = numerodefactura;
        this.codigocliente = codigocliente;
        this.nombrecliente = nombrecliente;
        this.codigovendedor = codigovendedor;
        this.fechacompra = fechacompra;
        this.codigosap = codigosap;
    }

    public String getNumerodefactura() {
        return numerodefactura;
    }

    public void setNumerodefactura(String numerodefactura) {
        this.numerodefactura = numerodefactura;
    }

    public String getCodigocliente() {
        return codigocliente;
    }

    public void setCodigocliente(String codigocliente) {
        this.codigocliente = codigocliente;
    }

    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    public String getCodigovendedor() {
        return codigovendedor;
    }

    public void setCodigovendedor(String codigovendedor) {
        this.codigovendedor = codigovendedor;
    }

    public String getFechacompra() {
        return fechacompra;
    }

    public void setFechacompra(String fechacompra) {
        this.fechacompra = fechacompra;
    }

    public String getCodigosap() {
        return codigosap;
    }

    public void setCodigosap(String codigosap) {
        this.codigosap = codigosap;
    }
    
    
}
