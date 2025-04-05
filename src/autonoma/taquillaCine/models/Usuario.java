/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.taquillaCine.models;
/**
 * Modelo que permite representar un usuario
 * @author Mariana
 * @since 20250402
 * @version 1.0
 */
public abstract class Usuario {
    //Atributos
    /**
     * porcentaje de descuento que depende del usuario
    */
    protected double valorDescuento;
    /**
     * Tipo de usuario
    */
    protected String tipoUsuario;
    /**
     * Id del usuario
    */
    protected String id;

    /**
    * Inicializa los atributos de la clase Usuario
    * @param valorDescuento
    * @param tipo
    * @param id
    */
    public Usuario(double valorDescuento, String tipo, String id) {
        this.valorDescuento = valorDescuento;
        this.tipoUsuario = tipo;
        this.id = id;
    }

    /**
     * Retorna el valor de descuento
     * @return valorDescuento
    */
    public double getValorDescuento() {
        return valorDescuento;
    }

    /**
     * Modifica el valor de descuento
     * @param valorDescuento
    */ 
    public void setValorDescuento(double valorDescuento) {
        this.valorDescuento = valorDescuento;
    }

    /**
     * Retorna el tipo de usuario
     * @return tipoUsuario
    */
    public String getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     * Modifica el tipo de usuario
     * @param tipoUsuario
    */ 
    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    /**
     * Retorna el id del usuario
     * @return id
    */
    public String getId() {
        return id;
    }
    
    /**
     * Modela el metodo de aplicar el descuento
     * @param costoBase
     * @param funcion
     * @return float
    */
    public abstract double aplicarDescuento(double costoBase, Funcion funcion); 
}
