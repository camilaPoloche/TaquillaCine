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
    
    
    /**
     * porcentaje de descuento que depende del usuario
     */
    
    protected double valorDescuento;

    /**
    * Inicializa los atributos de la clase Usuario
    * @param valorDescuento
    * 
    */
    public Usuario(double valorDescuento) {
        this.valorDescuento = valorDescuento;
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
     * Modela el metodo de aplicar el descuento
     * @param costoBase
     * @param funcion
     * @return float
    */
    public abstract double aplicarDescuento(double costoBase, Funcion funcion); 
}
