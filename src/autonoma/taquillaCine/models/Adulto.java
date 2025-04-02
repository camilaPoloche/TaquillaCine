/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.taquillaCine.models;

/**
 * Modelo que permite representar un decuento si es un adulto
 * @author Mariana
 * @since 20250402
 * @version 1.0
 */
public class Adulto implements Usuario {
    //constante
    /**
    * cantidad de descuento si es un adulto
    */
    final double CANTIDAD_DESCUENTO = 0;
    
    /**
     * Inicializa la clase adulto
     *
    */
    public Adulto() {
    }
    
    /**
     * Metodo abstracto aplicar descuento
     * @param costoBase
     * @param funcion
     * @return double
    */

    @Override
    public double aplicarDescuento(double costoBase, Funcion funcion) {
        double precioConDescuento = funcion.calcularDescuento(costoBase);
        double precioFinalAdulto = precioConDescuento - CANTIDAD_DESCUENTO;
        
        return precioFinalAdulto;
        
    }
    
}
