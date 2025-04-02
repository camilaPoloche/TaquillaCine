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
public interface Usuario {
    
    
    /**
     * Modela el metodo de aplicar el descuento
     * @param costoBase
     * @param funcion
     * @return float
    */
    public abstract double aplicarDescuento(double costoBase, Funcion funcion);
    
}
