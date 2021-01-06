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
public class Proveedores {
    
    private String codeigosapprove;
    private String marca;
    private String tipoproducto;

    public Proveedores() {
    }

    public Proveedores(String codeigosapprove, String marca, String tipoproducto) {
        this.codeigosapprove = codeigosapprove;
        this.marca = marca;
        this.tipoproducto = tipoproducto;
    }

    public String getCodeigosapprove() {
        return codeigosapprove;
    }

    public void setCodeigosapprove(String codeigosapprove) {
        this.codeigosapprove = codeigosapprove;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoproducto() {
        return tipoproducto;
    }

    public void setTipoproducto(String tipoproducto) {
        this.tipoproducto = tipoproducto;
    }
    
    
}
