package autonoma.taquillaCine.models;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Modelo que permite representar un decuento si es un niño
 * @author Mariana
 * @since 20250402
 * @version 1.0
 */
public class Nino extends Usuario {
    
    /**
     * Inicializa la clase Nino
     *
    */
    public Nino(){
        super(500);
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
        double precioFinalNiño = precioConDescuento - this.valorDescuento;
        
        return precioFinalNiño;
    }
}
