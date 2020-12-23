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
public class Clientes {
    
    private String name;
    private String apellido;
    private String numerodeTel;
    private String pedido;

    public Clientes() {
    }

    public Clientes(String name, String apellido, String numerodeTel, String pedido) {
        this.name = name;
        this.apellido = apellido;
        this.numerodeTel = numerodeTel;
        this.pedido = pedido;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumerodeTel() {
        return numerodeTel;
    }

    public void setNumerodeTel(String numerodeTel) {
        this.numerodeTel = numerodeTel;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

   
}


