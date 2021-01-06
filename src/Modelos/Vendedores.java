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
public class Vendedores {

private String codigovendedor;
    private String nombre;
    private String apellido;
    private String correo;
    private String codigocliente;

    public Vendedores() {
    }

    public Vendedores(String codigovendedor, String nombre, String apellido, String correo, String codigocliente) {
        this.codigovendedor = codigovendedor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.codigocliente = codigocliente;
    }

    public String getCodigovendedor() {
        return codigovendedor;
    }

    public void setCodigovendedor(String codigovendedor) {
        this.codigovendedor = codigovendedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCodigocliente() {
        return codigocliente;
    }

    public void setCodigocliente(String codigocliente) {
        this.codigocliente = codigocliente;
    }
    
      
    
        
}
